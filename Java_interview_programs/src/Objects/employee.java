package Objects;

public class employee {
	
	String name;
	String empId;

	
	
	public employee(String name, String empId) {
		super();
		this.name = name;
		this.empId = empId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String toString()
	{
		return "I am "+name+" and my emp id is "+empId;
	}
	
	public int hashCode()
	{
		return Integer.parseInt(empId);
	}
	
	public boolean equals(employee e1)
	{
		if(e1.empId.equals(this.empId) && ((this.hashCode())==(e1.hashCode())))
			return true;
		
		else return false;
	}
	
}
