package ru.alligator.employee.mapper;

import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.alligator.employee.domain.Department;
import ru.alligator.employee.domain.Employee;
import ru.alligator.employee.domain.Position;
import ru.alligator.employee.dto.EmployeeTo;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-07T22:42:48+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.8 (Ubuntu)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeTo toTo(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeTo employeeTo = new EmployeeTo();

        employeeTo.setPositionName( employeePositionRussianName( employee ) );
        employeeTo.setDepartmentName( employeeDepartmentName( employee ) );
        employeeTo.setDepartmentId( employeeDepartmentId( employee ) );
        employeeTo.setId( employee.getId() );
        employeeTo.setLastName( employee.getLastName() );
        employeeTo.setFirstName( employee.getFirstName() );
        employeeTo.setPatronymic( employee.getPatronymic() );
        employeeTo.setPhone( employee.getPhone() );
        employeeTo.setEmail( employee.getEmail() );
        employeeTo.setPosition( employee.getPosition() );

        return employeeTo;
    }

    private String employeePositionRussianName(Employee employee) {
        if ( employee == null ) {
            return null;
        }
        Position position = employee.getPosition();
        if ( position == null ) {
            return null;
        }
        String russianName = position.getRussianName();
        if ( russianName == null ) {
            return null;
        }
        return russianName;
    }

    private String employeeDepartmentName(Employee employee) {
        if ( employee == null ) {
            return null;
        }
        Department department = employee.getDepartment();
        if ( department == null ) {
            return null;
        }
        String name = department.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private UUID employeeDepartmentId(Employee employee) {
        if ( employee == null ) {
            return null;
        }
        Department department = employee.getDepartment();
        if ( department == null ) {
            return null;
        }
        UUID id = department.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
