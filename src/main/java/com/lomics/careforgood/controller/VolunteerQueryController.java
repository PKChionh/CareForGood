package com.lomics.careforgood.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lomics.careforgood.domain.entity.Volunteer;
import com.lomics.careforgood.service.VolunteerQueryService;

@RestController
@RequestMapping(value = "/volunteer")
public class VolunteerQueryController {

  private final VolunteerQueryService volunteerQueryService;

  public VolunteerQueryController(VolunteerQueryService volunteerQueryService) {
    this.volunteerQueryService = volunteerQueryService;
  }

  @GetMapping("/{volunteerId}")
  public ResponseEntity<Volunteer> getVolunteerById(Long volunteerId){
    Optional<Volunteer> volunteerOpt = volunteerQueryService.getVolunteerById(volunteerId);
    return volunteerOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
  }

  @CrossOrigin(origins = "http://localhost:3000")
  @GetMapping("/list")
  public List<Volunteer> getVolunteers() {
    return volunteerQueryService.getVolunteers();
  }
}
