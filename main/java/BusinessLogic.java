public class BusinessLogic {

    public double calculateYearlySalary(Employee employee){
        // function should return the yearly salary
        //yearly salary =   monthlySalary * 12;
        double yearlySalary = 0;
        yearlySalary = employee.getMonthlySalary() * 12;
        return yearlySalary;
    }

    public double calculateBonus(Employee employee){
        // if employee salary is more then 10000 -> return 500
        // if employee salary is less then 10000 -> return 100
        // yearlySalary ?
        double bonus = 0;
        if(employee.getMonthlySalary() < 10000){
            bonus = 100;
        }else
        {
            bonus = 500;
        }
        return bonus;
    }
}
