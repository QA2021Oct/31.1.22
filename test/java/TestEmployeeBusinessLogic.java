import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmployeeBusinessLogic {

    Employee employee = new Employee();
    BusinessLogic businessLogic = new BusinessLogic();

    @Test
    public void testCalculateYearlySalary(){
        // add details to employee and use them in the function
        // Assert to check if function calculate currently

        employee.setName("Haim");
        employee.setAge(25);
        employee.setMonthlySalary(8000);

        double yearlySalary = businessLogic.calculateYearlySalary(employee);
        Assert.assertEquals(96000, yearlySalary);

    }

    @Test
    public void testCalculateBonus(){
        // add details to employee and use them in the function
        // Assert for expected bonus:

        employee.setName("Haim");
        employee.setAge(25);
        employee.setMonthlySalary(8000);

        double bonus = businessLogic.calculateBonus(employee);
        Assert.assertEquals(100, bonus);
    }
}
