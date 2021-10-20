package Sep20;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("c:\\temp\\test2.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 7);

			while ((c = fin.read()) != -1) {
				out.write(c);
			}

			new Scanner(System.in).nextLine();
			out.flush();
			fin.close();
			out.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
