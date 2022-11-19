package assignmentno6;

public class EmployeeProcessorExample {

	public static void main(String[] args) {
		Employee emp[]= new Employee[6];
		emp[0]= new Employee(920659,"jonty",65000,new Department("Desgin","Pune"));
		emp[1]= new Employee(920658,"Aniket",85000,new Department("Analysis","Brampton"));
		emp[2]= new Employee(920657,"Harshal",97000,new Department("Desgin","America"));
		emp[3]= new Employee(920656,"Umesh",65000,new Department("Mangenment","Canada"));
		emp[4]= new Employee(920655,"Sudeep",250000,new Department("Mangenment","Canada"));
		emp[5]= new Employee(920660,"Vikram",150000,new Department("Analysis","Brampton"));
		
		EmployeeProcessor empProcessor;
		empProcessor = new SalaryOfEmployee();
		 
		 float SumofSalary = empProcessor.processEmployees(emp, "Analysis");
		 System.out.println("Sum of Salary of Department Mangement :"+SumofSalary);
		 
		 empProcessor =new EmployeeOfSameLocation();
		 float count = empProcessor.processEmployees(emp, "Canada");
		 System.out.println("Number of Employee of same Location "+count);
		 
		 EmployeeOperation empPro = new EmployeeOperation();
		 empPro.setAllEmployees(emp);
		  empPro.perform("Analysis");
		 System.out.println(EmployeeOperation.getOperationResult());
		 
		 empPro.setProcessor(new EmployeeOfSameLocation());
		 empPro.setAllEmployees(emp);
		 empPro.perform("Pune");
		 System.out.println(EmployeeOperation.getOperationResult());
	}
	

}
