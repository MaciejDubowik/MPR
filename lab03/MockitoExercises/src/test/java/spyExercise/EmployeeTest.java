package spyExercise;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeTest {

    private Employee employee;
    private Employee spyEmp;

    @Before
    public void buildSpy() {
        employee = new Employee("asd", "das");
        spyEmp = spy(employee);
    }

    @Test
    public void employeeTest() {
        when(spyEmp.getLastName()).thenReturn("Kowalski");

        System.out.println(spyEmp.getFullName());
    }
}
