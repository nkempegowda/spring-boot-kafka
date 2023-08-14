package com.kempaiah.employeeservice.service;

import com.common.service.dto.EmployeeDTO;

public interface EmployeeService {
  EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);

  EmployeeDTO getEmployee(Long id) throws Exception;
}
