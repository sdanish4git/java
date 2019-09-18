package demo;

import com.ford.exception.MyException;

public class Test {
		String s;
		public Test(String s){
			this.s=s;
		}

	public static void main(String[] args) {
		
		int age=40;
		
		try {
			if(age>30) {
				throw new MyException();
			}
		}catch(MyException ex) {
			ex.printStackTrace();
		}
		

	}

	@Override
	public String toString() {
		
		return this.s;
	}
	
	

}
