package com.kempaiah.employeeservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.common.service.dto.EmployeeDTO;
import com.kempaiah.employeeservice.dao.EmployeeDAO;
import com.kempaiah.employeeservice.repository.EmployeeRepository;
import com.kempaiah.employeeservice.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  private EmployeeDAO employeeDAO;

  @Override
  public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {

    return employeeDAO.saveEmployee(employeeDTO);
  }

  @Override
  public EmployeeDTO getEmployee(Long id) throws Exception {

    return employeeDAO.getEmployee(id);
  }
}
