package com.daudugodswill.Springboot.project.repository;

import com.daudugodswill.Springboot.project.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    //there is no method defined as department name in JPA Repository, so we have to
    //define it ourselves
    public Department findByDepartmentName(String departmentName);

    public Department findByDepartmentNameIgnoreCase(String departmentName);
}
