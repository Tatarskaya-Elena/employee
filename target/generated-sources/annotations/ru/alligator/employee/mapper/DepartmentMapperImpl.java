package ru.alligator.employee.mapper;

import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.alligator.employee.domain.Department;
import ru.alligator.employee.dto.DepartmentTo;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-08T21:28:26+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.8 (Ubuntu)"
)
@Component
public class DepartmentMapperImpl implements DepartmentMapper {

    @Override
    public DepartmentTo toTo(Department department) {
        if ( department == null ) {
            return null;
        }

        DepartmentTo departmentTo = new DepartmentTo();

        departmentTo.setHigherDepartmentId( departmentHigherDepartmentId( department ) );
        departmentTo.setId( department.getId() );
        departmentTo.setName( department.getName() );

        return departmentTo;
    }

    private UUID departmentHigherDepartmentId(Department department) {
        if ( department == null ) {
            return null;
        }
        Department higherDepartment = department.getHigherDepartment();
        if ( higherDepartment == null ) {
            return null;
        }
        UUID id = higherDepartment.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
