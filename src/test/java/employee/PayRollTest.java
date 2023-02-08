package employee;


import java.util.Arrays;

public class PayRollTest {
    public static void main(String[] args) {
        PayRoll payroll = new PayRoll();

        HourlyEmp hourlyEmp1 = new HourlyEmp("Hourly Emp 1", 10, 45);
        HourlyEmp hourlyEmp2 = new HourlyEmp("Hourly Emp 2", 8, 35);

        Contract contractEmp1 = new Contract("Contract Emp 1", 15, 25);
        Contract contractEmp2 = new Contract("Contract Emp 2", 20, 30);

        SalEmp salEmp1 = new SalEmp("Salary Emp 1", 4000);
        SalEmp salEmp2 = new SalEmp("Salary Emp 2", 6000);

        payroll.add(hourlyEmp1);
        payroll.add(hourlyEmp2);
        payroll.add(contractEmp1);
        payroll.add(contractEmp2);
        payroll.add(salEmp1);
        payroll.add(salEmp2);

        payroll.pay();
    }
}