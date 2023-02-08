package employee;

public class HourlyEmp extends employ {
	public HourlyEmp(String name, double rate, int hours) {
        super(name, (float) rate, hours);
    }

    @Override
    public float getPay() {
        double payup = 0;
        if (hours <= 40) {
            payup = rate * hours;
        } else {
            payup = (40 * rate) + ((hours - 40) * (rate * 1.5));
        }
        return (float) payup;
    }
}
