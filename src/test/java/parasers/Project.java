package parasers;

public class Project {
	
	String emplyeeName;
	int empAge;
	double empSalary;
	String location;
	public Project(String emplyeeName, int empAge, double empSalary, String location) {
		super();
		this.emplyeeName = emplyeeName;
		this.empAge = empAge;
		this.empSalary = empSalary;
		this.location = location;
	}
	
	public Project() {
		
	}

	public String getEmplyeeName() {
		return emplyeeName;
	}

	public void setEmplyeeName(String emplyeeName) {
		this.emplyeeName = emplyeeName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	

}
