package org.emsspring.emsmansys.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Role {
    @Id
    private Integer roleId;
    private String roleName;
    private String roleDesc;
}
