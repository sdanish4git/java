package collection;

public class ContainerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container<Integer,String> c=new Container<>();
		
		c.setItem1(6);
		c.setItem2("data");
		String result=c.getItem1()+c.getItem2();
		System.out.println(result);
	}

}
