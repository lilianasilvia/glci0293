package AngajatiApp.repository;

import AngajatiApp.model.DidacticFunction;
import AngajatiApp.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeMockTest {
    EmployeeMock employeeMock;
    @BeforeEach
    void setUp() {
        employeeMock = new EmployeeMock();
    }

    @Test
    void addEmployee_TC01() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setLastName("Mihailescu");
        employee.setFirstName("Dan");
        employee.setCnp("1561210123456");
        employee.setFunction(DidacticFunction.ASISTENT);
        employee.setSalary(1000.00);

        boolean bool = employeeMock.addEmployee(employee);
        assertTrue(bool, "true");
    }

    @Test
    void addEmployee_TC02() {
        Employee e2 = new Employee();
        e2.setId(2);
        e2.setLastName("Moldovan");
        e2.setFirstName("Ioan");
        e2.setCnp("1551102123456");
        e2.setFunction(DidacticFunction.LECTURER);
        e2.setSalary(999.00);

        boolean bool = employeeMock.addEmployee(e2);
        assertFalse(bool,"false");

    }

    @Test
    void addEmployee_TC03() {
        Employee e3 = new Employee();
        e3.setId(2);
        e3.setLastName("22Vasilca");
        e3.setFirstName("Mona");
        e3.setCnp("2941015556644");
        e3.setFunction(DidacticFunction.CONFERENTIAR);
        e3.setSalary(3000.00);

        boolean bool = employeeMock.addEmployee(e3);
        assertFalse(bool,"false");

    }

    @Test
    void addEmployee_TC04() {
        Employee e4 = new Employee();
        e4.setId(2);
        e4.setLastName("Marin");
        e4.setFirstName("Ion");
        e4.setCnp("18310155566ff");
        e4.setFunction(DidacticFunction.ASISTENT);
        e4.setSalary(1500.00);

        boolean bool = employeeMock.addEmployee(e4);
        assertFalse(bool,"false");

    }

    @Test
    void addEmployee_TC05() {
        Employee e4 = new Employee();
        e4.setId(2);
        e4.setLastName("Morar");
        e4.setFirstName("Andra");
        e4.setCnp("226123086352");
        e4.setFunction(DidacticFunction.ASISTENT);
        e4.setSalary(1000.00);

        boolean bool = employeeMock.addEmployee(e4);
        assertFalse(bool,"false");

    }

    @Test
    void addEmployee_TC06() {
        Employee e4 = new Employee();
        e4.setId(2);
        e4.setLastName("Varzar");
        e4.setFirstName("Radu");
        e4.setCnp("1650523789645");
        e4.setFunction(DidacticFunction.CONFERENTIAR);
        e4.setSalary(1001.00);

        boolean bool = employeeMock.addEmployee(e4);
        assertTrue(bool, "true");

    }


}