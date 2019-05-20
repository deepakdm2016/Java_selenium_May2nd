package SerializeDeserialize;

import java.io.Serializable;

public class employee implements Serializable{

	private transient String empId;
	private String name;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public employee(String empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	
}
