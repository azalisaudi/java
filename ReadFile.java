import java.io.*;
import java.util.*;

class ReadFile {
	public static void main(String[] args) {
		try {
			File f = new File("nota.txt");
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		
		System.out.println("GOODBYE");
	}
}