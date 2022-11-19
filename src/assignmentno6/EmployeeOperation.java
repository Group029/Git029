package assignmentno6;

public class EmployeeOperation {
	private Employee[] allEmployees; 
	private  static float operationResult; 
	private EmployeeProcessor processor;
	
	
	public EmployeeOperation() {
		operationResult=0;
		processor = new SalaryOfEmployee();
	}


	public EmployeeOperation(Employee[] allEmployees, EmployeeProcessor processor) {
		super();
		this.allEmployees = allEmployees;
		this.processor = processor;
	}

	
	public Employee[] getAllEmployees() {
		return allEmployees;
	}

	public void setAllEmployees(Employee[] allEmployees) {
		this.allEmployees = allEmployees;
	}

	public static float getOperationResult() {
		return operationResult;
	}

	public static void setOperationResult(float operationResult) {
		EmployeeOperation.operationResult = operationResult;
	}

	public EmployeeProcessor getProcessor() {
		return processor;
	}

	public void setProcessor(EmployeeProcessor processor) {
		this.processor = processor;
	}

	public void perform(String nameOrLocation) {
		if(processor.equals(new SalaryOfEmployee())) {
			EmployeeOperation.operationResult = processor.processEmployees(allEmployees, nameOrLocation);
		}
		else {
			EmployeeOperation.operationResult = processor.processEmployees(allEmployees, nameOrLocation);
			}
	}
	
}
