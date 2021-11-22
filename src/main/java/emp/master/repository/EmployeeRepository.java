package emp.master.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import emp.master.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
