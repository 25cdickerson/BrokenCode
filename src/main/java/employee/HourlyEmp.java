package employee;

public class HourlyEmp extends employ {
	public HourlyEmp(String name, double rate, int hours) {
        super(name, (float) rate, hours);
    }

    @Override
    public float getPay() {
        double pay = 0;
        if (hours <= 40) {
            pay = rate * hours;
        } else {
            pay = (40 * rate) + ((hours - 40) * (rate * 1.5));
        }
        return (float) pay;
    }
}
