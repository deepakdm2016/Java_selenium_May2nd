package Collections;

public class Employee implements Comparable<Employee>{
	
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		
		if(this.id<e.id) return -1;
		else if(this.id>e.id) return 1;
		return 0;
	}
}