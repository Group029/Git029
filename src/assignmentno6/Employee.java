package assignmentno6;

import java.util.Objects;

public class Employee {

	private int empNo;
	private String name;
	private float salary;
	private Department department;
	
	public Employee() {
		super();
		empNo = 0212;
		name = "Dominic";
		salary = 150000;
		department = new Department();
	}
	
	public Employee(int empNo, String name, float salary, Department department) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, empNo, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && empNo == other.empNo && Objects.equals(name, other.name)
				&& Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
	}
	
}
