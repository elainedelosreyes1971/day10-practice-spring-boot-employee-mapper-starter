package com.afs.restapi.service.mapper;

import com.afs.restapi.entity.Employee;
import com.afs.restapi.service.dto.EmployeeRequest;
import com.afs.restapi.service.dto.EmployeeResponse;
import org.springframework.beans.BeanUtils;

public class EmployeeMapper {

    private EmployeeMapper() {
    }

    public static Employee toEntity(EmployeeRequest employeeRequest) {
        Employee employee = new Employee();
        employee.setAge(employeeRequest.getAge());
        BeanUtils.copyProperties(employeeRequest, employee);
        return employee;
    }

    public static EmployeeResponse toResponse(Employee employee) {
        EmployeeResponse employeeResponse = new EmployeeResponse();
        BeanUtils.copyProperties(employee, employeeResponse);
        return employeeResponse;
    }

    public static void updateEmployee(EmployeeRequest employeeRequest, Employee toBeUpdatedEmployee) {
        if (employeeRequest.getSalary() != null) {
            toBeUpdatedEmployee.setSalary(employeeRequest.getSalary());
        }
        if (employeeRequest.getAge() != null) {
            toBeUpdatedEmployee.setAge(employeeRequest.getAge());
        }
    }
}
