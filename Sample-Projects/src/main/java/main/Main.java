package main;
public class Main{
	public static void main(String[] args) {
		Manager m=new Manager();
		m.setId(1001);
		m.setName("Manoj");
		m.setdesignation("Operations Manager");
		m.setSalary(55000.0f);
		m.setNoOfReportees(20);
		m.applyleave("12-March-2019");
		
		
		Trainer t=new Trainer();
		t.setId(5001);
		t.setName("Tarun");
		t.setdesignation("Senior Facilitator");
		t.setSalary(30000.0f);
		t.setSkillset("Java,C++,Python");
		t.applyleave("15-March-2019");
		
		
		m.approveLeave("Tarun", "15-March-2019");
		
	}
}

 class Employee {
	public int empId;
	String empName;
	String designation;
	float salary;
	
	void applyleave(String date) {
		System.out.println(empName+" has applied for leave on "+date);
	}
	
	public int getId() {
		return empId;
	}
	
	public void setId(int id) {
		this.empId=id;
	}
	
	public String getName() {
		return empName;
	}
	
	public void setName(String name) {
		this.empName=name;
	}
	
	public String  getIdesignation() {
		return designation;
	}
	
	public void setdesignation(String desig) {
		this.designation=desig;
	}
	
	public float getSalary() {
		return empId;
	}
	
	public void setSalary(float sal) {
		this.salary=sal;
	}
}

class Manager extends Employee{
	int noOfReportees;
	
	public void approveLeave(String empName,String date) {
	
		System.out.println("The leave applied by "+empName+" on "+date+" is approved");
	}
	
	public int getNoOfReportees() {
		return noOfReportees;
	}
	
	public void setNoOfReportees(int num) {
		this.noOfReportees=num;
	}
}


class Trainer extends Employee {
	String skillset;
	
	public void training() {
		System.out.println(empName+ "can train on the "+skillset+" topics.");
	}
	
	public String getSkillSet() {
		return skillset;
	}
	
	public void setSkillset(String skillset) {
		this.skillset=skillset;
		
	}
}


