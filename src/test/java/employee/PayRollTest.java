package employee;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class PayRollTest {
    @Test
    public void testAdd() {
        PayRoll payroll = new PayRoll();
        HourlyEmp hourlyEmp = new HourlyEmp("J", 15, 40);
        SalEmp salEmp = new SalEmp("A", 2000);
        Contract contract = new Contract("K", 25, 20);

        payroll.add(hourlyEmp);
        payroll.add(salEmp);
        payroll.add(contract);

        ArrayList<employ> employees = payroll.employees;
        assertArrayEquals(new employ[]{hourlyEmp, salEmp, contract}, employees.toArray());
    }

    @Test
    public void testPayMethod() {
        PayRoll payroll = new PayRoll();
        HourlyEmp hourlyEmp = new HourlyEmp("J", 15, 40);
        SalEmp salEmp = new SalEmp("A", 2000);
        Contract contract = new Contract("K", 25, 20);

        payroll.add(hourlyEmp);
        payroll.add(salEmp);
        payroll.add(contract);

        payroll.pay();
        // expected output: [600.0, 800.0, 500.0]
    }

   
}