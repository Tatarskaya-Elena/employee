package ru.alligator.employee.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.alligator.employee.domain.Department;

public interface DepartmentRepository extends JpaRepository<Department, UUID>{

    
}
