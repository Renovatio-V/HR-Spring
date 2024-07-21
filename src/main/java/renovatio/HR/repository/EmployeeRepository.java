package renovatio.HR.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import renovatio.HR.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
