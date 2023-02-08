package employee;

import java.util.ArrayList;
import java.util.Arrays;

public class PayRoll  {
	public ArrayList<employ> employees;
	
	public PayRoll() {
		//super(name, hours, rate);
		employees = new ArrayList<>();
		
	}




	public void add(employ employee) {
        employees.add(employee);
    }

    public void pay() {
    	double pays[] = new double[employees.size()];
        int i = 0;
        for (employ employee : employees) {
            pays[i] = (double) employee.getPay();
            i++;
        }
    }
}
