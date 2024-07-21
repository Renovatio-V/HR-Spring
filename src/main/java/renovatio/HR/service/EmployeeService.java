package renovatio.HR.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import renovatio.HR.model.Employee;
import renovatio.HR.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> listEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee searchEmployeeById(Integer idEmployee) {
        return employeeRepository.findById(idEmployee).orElse(null);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }
}
