package com.lomics.careforgood.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lomics.careforgood.domain.entity.Volunteer;
import com.lomics.careforgood.domain.repository.VolunteerRepository;

@Service
public class VolunteerQueryService {

  @Autowired
  private VolunteerRepository volunteerRepository;

  public Optional<Volunteer> getVolunteerById(Long volunteerId){
    return volunteerRepository.findById(volunteerId);
  }

  public List<Volunteer> getVolunteers() {
    return volunteerRepository.findAll();
  }
}
