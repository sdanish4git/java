package basic;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String, StringBuilder-, StringBuffer -thread safe
		String s="Hello World";
		StringBuffer sb=new StringBuffer("Hello World");
		sb.append("Java").append(" ! ");
		
		String s2=sb.toString();
		System.out.println(sb.toString());
		
	}

}
