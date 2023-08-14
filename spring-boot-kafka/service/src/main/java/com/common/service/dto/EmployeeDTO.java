package com.common.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private Long departmentId;
}
