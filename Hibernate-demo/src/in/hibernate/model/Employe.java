package in.hibernate.model;

import org.hibernate.annotations.Entity;

@Entity;
@Table(name="Emp_tab")
public class Employe {
	@Id
	@Column(name="Emp_Id")
	private int EmpId;
	@Column(name="Emp_name")
	private String EmpName;
	private double Empsalary;
	@Column(name=Emp_sal)
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getEmpsalary() {
		return Empsalary;
	}
	public void setEmpsalary(double empsalary) {
		Empsalary = empsalary;
	}
}

