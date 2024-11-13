package org.emsspring.emsmansys.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
public class Salary {
    @Id
    private Integer salaryId;
    private Integer employeeId;
    private Double amount;
    private String currency;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double bonus;
}
