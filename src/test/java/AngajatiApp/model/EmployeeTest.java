package AngajatiApp.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee e1,e2,e3;

    @BeforeEach
    public void setUp(){
        e1 = new Employee("Ion","Popescu","1800815235689", DidacticFunction.CONFERENTIAR,1500.13d);
        e2 = new Employee();

        e2.setLastName("Albu");
        e2.setCnp("1561123542187");
        e2.setSalary(700.00d);

    }

    @Test
    public void test_setFirstName(){
        assertEquals("",e2.getFirstName());
        assertEquals("Ion",e1.getFirstName());

        e2.setFirstName("newName_e2");
        assertEquals("newName_e2",e2.getFirstName());
        e1.setFirstName("newName_e1");
        assertEquals("newName_e1",e1.getFirstName());

        try{
            e3.setFirstName("name4");
            assert false;

        } catch(Exception ex){
            assert true;
        }

    }

    @AfterEach
    public void tearDown(){
        System.out.println("after all");
    }


}