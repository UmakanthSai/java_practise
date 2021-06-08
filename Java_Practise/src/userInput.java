import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class userInput {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		// FILE
		File file = new File("E:\\Softwares", "Sample.txt");
		FileReader reader = new FileReader(file);
		try {
			file.createNewFile();
			System.out.println(file.getName());
			System.out.println(reader.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("It is done");
		}
		

	}

}
