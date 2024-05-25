package com.lomics.careforgood.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lomics.careforgood.domain.entity.Volunteer;

public interface VolunteerRepository extends JpaRepository<Volunteer, Long>{

}
