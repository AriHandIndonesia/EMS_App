package org.emsspring.emsmansys.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
public class Employee {
    @Id
    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDate hireDate;
    private LocalDate birthDate;
    private Integer salaryId;
    private Integer departmentId;
    private Integer roleId;
    private String address;
    private String status;
}
