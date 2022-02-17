import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderProg {
public static void main(String[] args) throws IOException {
	
	
	FileReader fr= new FileReader("welcome.txt");
	
	while(fr.read()!=-1) {
		
		char c=(char) fr.read();
		System.out.print(c);
	}
}
}
