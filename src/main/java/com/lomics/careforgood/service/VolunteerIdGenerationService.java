package com.lomics.careforgood.service;

import org.springframework.stereotype.Service;

@Service
public class VolunteerIdGenerationService {

  public Long newVolunteerId() {
    return System.nanoTime();
  }
}
