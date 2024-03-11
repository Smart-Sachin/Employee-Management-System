package in.sachin.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="employee_system")
public class Employee {

	@Id
	private String id; 
    private String employeeName; 
    private String employeeEmail; 
    private Long employeePhone; 
    private String employeeGender; 
    private String employeeSalary; 
    private String employeeRole;
    
    
	public Employee() {
		super();
		
	}
	public Employee(String id, String employeeName, String employeeEmail, Long employeePhone, String employeeGender,
			String employeeSalary, String employeeRole) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.employeePhone = employeePhone;
		this.employeeGender = employeeGender;
		this.employeeSalary = employeeSalary;
		this.employeeRole = employeeRole;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public Long getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(Long employeePhone) {
		this.employeePhone = employeePhone;
	}
	public String getEmployeeGender() {
		return employeeGender;
	}
	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}
	public String getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeRole() {
		return employeeRole;
	}
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", employeeEmail=" + employeeEmail
				+ ", employeePhone=" + employeePhone + ", employeeGender=" + employeeGender + ", employeeSalary="
				+ employeeSalary + ", employeeRole=" + employeeRole + "]";
	}    

}
