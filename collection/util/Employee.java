package collection.util;

public class Employee implements Comparable{
	private long id;
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee e=(Employee)o;
		if(this.id < e.id) return +1;
		if(this.id > e.id) return -1;
		//if(this.id == e.id) return 0;
		return 0; 
	}
	
	
	
}
