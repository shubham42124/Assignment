
import java.io.FileWriter;
import java.io.IOException;
//to write the information into the file 
public class FileWriterProg {
public static void main(String[] args) throws IOException {
	
	
	FileWriter fw= new FileWriter("welcome.txt");
	
	fw.write("welcome");
	fw.write("to ");
	fw.write("java");
	fw.write("session");
	fw.write(97);
	fw.write(107);
	fw.close();
	System.out.println("data is inserted");
	

}
}
