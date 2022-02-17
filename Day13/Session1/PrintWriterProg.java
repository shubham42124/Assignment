import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterProg {
public static void main(String[] args) throws IOException {
	
	
	FileWriter fw= new FileWriter("welcome.txt");
	PrintWriter pw= new PrintWriter(fw);
	
	
	pw.println("welcoem");
	pw.println("to");
	pw.println("files");
	pw.println("hello");
	pw.println(90);
	pw.println(true);
	pw.close();
	System.out.println("data is inserted");
}
}
