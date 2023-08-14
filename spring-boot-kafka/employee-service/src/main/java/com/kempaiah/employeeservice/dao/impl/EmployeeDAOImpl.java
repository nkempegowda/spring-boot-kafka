package com.kempaiah.employeeservice.dao.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.common.service.dto.EmployeeDTO;
import com.kempaiah.employeeservice.dao.EmployeeDAO;
import com.kempaiah.employeeservice.entity.Employee;
import com.kempaiah.employeeservice.repository.EmployeeRepository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

  @Autowired
  EmployeeRepository employeeRepository;

  @Autowired
  ModelMapper mapper;

  @Override
  public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {

    Employee employee = mapper.map(employeeDTO, Employee.class);
    Employee savedEmployee = employeeRepository.save(employee);
    return mapper.map(savedEmployee, EmployeeDTO.class);
  }

  @Override
  public EmployeeDTO getEmployee(Long id) throws Exception {
    Employee employee = employeeRepository.findById(id).orElseThrow(() -> {
      return new Exception("Employee not found");
    });
    return mapper.map(employee, EmployeeDTO.class);
  }
}
