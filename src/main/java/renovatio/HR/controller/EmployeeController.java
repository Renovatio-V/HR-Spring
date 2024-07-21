package renovatio.HR.controller;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import renovatio.HR.exception.ResourceNotFoundException;
import renovatio.HR.model.Employee;
import renovatio.HR.service.EmployeeService;
import renovatio.HR.service.IEmployeeService;


import java.lang.foreign.SymbolLookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
//http://localhost:8080/rh-app/
@RequestMapping("rh-app")
@CrossOrigin(value = "http://localhost:3000")
public class EmployeeController {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);


    private final IEmployeeService employeeService;

    public EmployeeController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //http://localhost:8080/rh-app/employees
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        var employees = employeeService.listEmployees();
        employees.forEach((employee -> logger.info(employee.toString())));
        return employees;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        logger.info("Adding Employee: " + employee);
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id){
        Employee employee = employeeService.searchEmployeeById(id);
        if(employee == null){
            throw new ResourceNotFoundException("Id not found" + id);
        }
        return ResponseEntity.ok(employee);
    }

    @PutMapping("employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Integer id, @RequestBody Employee employeeObtained){
        Employee employee = employeeService.searchEmployeeById(id);
        if(employee == null){
            throw new ResourceNotFoundException("Id does not exist: " + id);
        }
        employee.setName(employeeObtained.getName());
        employee.setDepartment(employeeObtained.getDepartment());
        employee.setSalary(employeeObtained.getSalary());
        employeeService.saveEmployee(employee);

        return ResponseEntity.ok(employee);
    }

    @DeleteMapping("employees/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Integer id){
        Employee employee = employeeService.searchEmployeeById(id);
        if(employee == null){
            throw new ResourceNotFoundException("ID does not exist: " + id);
        }
        employeeService.deleteEmployee(employee);
        Map<String, Boolean> answer = new HashMap<>();
        answer.put("Eliminado", Boolean.TRUE);
        return ResponseEntity.ok(answer);
    }
}
