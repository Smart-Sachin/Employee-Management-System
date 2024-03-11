package in.sachin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sachin.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, String>{

}
