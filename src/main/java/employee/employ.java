package employee;

public class employ {
	String name;
	float hours;
	float rate;
	
	public employ(String name, float hours, float rate) {
		super();
		this.name = name;
		this.hours = hours;
		this.rate = rate;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public float getHours() {
		return hours;
	}



	public void setHours(float hours) {
		this.hours = hours;
	}



	public float getRate() {
		return rate;
	}



	public void setRate(float rate) {
		this.rate = rate;
	}



	//methods for employees 
	public float getPay() {
		return rate*hours;
	}
	
	public void hoursWorked(float hours) {
		this.hours=hours;
	}
	
	
	
}
