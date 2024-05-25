package com.lomics.careforgood.domain.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "volunteer")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Volunteer {

  @Id
  private Long id;
  private String name;
  private BigDecimal experience;

}
