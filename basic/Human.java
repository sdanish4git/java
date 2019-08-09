package basic;

//acces-modifier class Name(Noun,start always with capital)
public class Human {
	
	private String name;
	private int age;
	private int height;
	private String gender;
	
	/*Human(){  //default
		gender="Male";
		height=1;
	} */
	
	
	Human(){
		
	}
	Human(int h){
		
	}
	Human(int h,String g){  //Parameterized 
		gender=g;
		height=h;
	}
	Human(String g){  //Parameterized 
		gender=g;
	}
	
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void speak() {
		System.out.println("My name is "+name +" age "+age+" and height "+height);
	}
	
	public void walk() {
		System.out.println(name +" is walking");
	}
	public void eat() {
		System.out.println(name +" is eating");
	}
}
