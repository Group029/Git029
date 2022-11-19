package assignmentno6;

public class EmployeeOfSameLocation implements EmployeeProcessor {

	@Override
		public float processEmployees(Employee[] employee, String location) {
			float count=0; 
			for(Employee emp : employee) {
				if(emp.getDepartment().getLocation().equals(location)) {
					count++;
				}
			}
		return count;
	}

}
