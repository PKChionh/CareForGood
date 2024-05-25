package com.lomics.careforgood.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lomics.careforgood.domain.entity.Volunteer;
import com.lomics.careforgood.domain.repository.VolunteerRepository;

@Service
public class MockVolunteerGenerateService {

  @Autowired
  private VolunteerRepository volunteerRepository;

  @Autowired
  private VolunteerIdGenerationService volunteerIdGenerationService;

  public void generateVolunteers() {

    Volunteer volunteer1 = Volunteer.builder()
              .id(volunteerIdGenerationService.newVolunteerId())
              .experience(new BigDecimal(100))
              .name("Tom Sawyer")
              .build();
    volunteerRepository.save(volunteer1);

    Volunteer volunteer2 = Volunteer.builder()
              .id(volunteerIdGenerationService.newVolunteerId())
              .experience(new BigDecimal(200))
              .name("Annie Blyton")
              .build();
    volunteerRepository.save(volunteer2);

  }
}
