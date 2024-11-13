package org.emsspring.emsmansys.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
public class Attendance {
    @Id
    private Integer attendanceId;
    private Integer employeeId;
    private LocalDate date;
    private String status;
}
