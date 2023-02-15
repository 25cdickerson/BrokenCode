package employee;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class PayRollTest {
    @Test
    public void testAdd() {
    	// Initialize employees
        PayRoll payroll = new PayRoll();
        HourlyEmp hourlyEmp = new HourlyEmp("J", 15, 40);
        SalEmp salEmp = new SalEmp("A", 2000);
        Contract contract = new Contract("K", 25, 20);

        // Add employees to payroll
        payroll.add(hourlyEmp);
        payroll.add(salEmp);
        payroll.add(contract);
        
        // Checks array
        ArrayList<employ> employees = payroll.l;
        assertArrayEquals(new employ[]{hourlyEmp, salEmp, contract}, employees.toArray());
    }

    @Test
    public void testPayMethod() {
    	// Initialize employees
        PayRoll payroll = new PayRoll();
        HourlyEmp hourlyEmp = new HourlyEmp("J", 15, 40);
        SalEmp salEmp = new SalEmp("A", 2000);
        Contract contract = new Contract("K", 25, 20);

        // Add employees to payroll
        payroll.add(hourlyEmp);
        payroll.add(salEmp);
        payroll.add(contract);
        
        // Check getPay works
        assert salEmp.getPay() == 80000.0;
        
        // Store payroll.pay
        double payEmp[] = payroll.pay();
        

        // Test payroll.pay
        double[] test = {600.0, 80000.0, 500.0};
        for(int i = 0; i < 2; i++) {
        		assertEquals(payEmp[i], test[i]);
        }
        // expected output: [600.0, 80000.0, 500.0]
    }

   
}
