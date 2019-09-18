import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManipulateFile {
	
	
	public static void main(String[] args) {
		
		try(FileWriter fw=new FileWriter("C:\\Users\\dshakil\\Desktop\\Java-ITManu\\output.txt",true);
				BufferedWriter bw=new BufferedWriter(fw)) {
		
		
		bw.write("\n this is Fourth line ");
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	/*public static void main(String[] args) {
		BufferedReader br=null;
		FileReader fr=null;
		try {
		File file=new File("C:\\Users\\dshakil\\Desktop\\Java-ITManu\\atmInfo.txt");
		//System.out.println(file));
		fr=new FileReader(file);
		
		br=new BufferedReader(fr);
		String s=br.readLine();
		while(s!=null) {
			String data[]=s.split(",");
			System.out.println("Atm card Number"+data[0]);
			//System.out.println(s);
			s=br.readLine();
		}
		
		//writing into file.
		
		
		
		
		
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}*/

}
