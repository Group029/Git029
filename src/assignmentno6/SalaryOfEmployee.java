package assignmentno6;

public class SalaryOfEmployee  implements EmployeeProcessor {
	
	@Override
	public float processEmployees(Employee employee[], String name) {
		float sum = 0;
		for(Employee emp : employee) {
			if(emp.getDepartment().getName().equals(name)) {
				float salary = emp.getSalary();
				sum=sum+salary;
			}
		}
		return sum;
	}
}
