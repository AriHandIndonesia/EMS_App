package org.emsspring.emsmansys.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Department {
    @Id
    private Integer departmentId;
    private String departmentName;
    private String location;
}
