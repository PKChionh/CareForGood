package com.lomics.careforgood.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lomics.careforgood.service.MockVolunteerGenerateService;

@RestController
@RequestMapping(value = "/mockvolunteer")
public class MockVolunteerController {

  private final MockVolunteerGenerateService dummyVolunteerGenerateService;

  public MockVolunteerController(MockVolunteerGenerateService dummyVolunteerGenerateService) {
    this.dummyVolunteerGenerateService = dummyVolunteerGenerateService;
  }

  @GetMapping("/generatedummyvolunteers")
  public void generateDummyVolunteers() {
    dummyVolunteerGenerateService.generateVolunteers();
  }
}
