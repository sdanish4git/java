import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class SwitchExample {

	public static void main(String[] args)throws Exception {
		 
		FileReader fr=new FileReader("C:\\Users\\dshakil\\Desktop\\build.gradle");
		BufferedReader br=new BufferedReader(fr);
		String s=br.readLine();
		while(s!=null) {
			System.out.println(s);
			s=br.readLine();
		}
		
		try(FileWriter fw=new FileWriter("C:\\Users\\dshakil\\Desktop\\test22.txt",true)){
			
		fw.write("Hello33");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//fw.close();
	}
	static void switchExample() {
		System.out.println("\nInside switchExample ...");
		byte month =6 ;
		
		switch (month) {
			case 1: System.out.println("January");
		            break;
			case 2: System.out.println("February");
		            break;
		    case 3: System.out.println("March");
		            break;
			default: System.out.println("April");
		}
	  }

}
