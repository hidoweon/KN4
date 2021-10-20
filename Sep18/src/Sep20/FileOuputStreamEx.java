package Sep20;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOuputStreamEx {

	public static void main(String[] args) throws FileNotFoundException {
		byte b[] = { 7, 51, 3, 4, -1, 24 };

		try {
			FileOutputStream fout = new FileOutputStream("c:\\temp\\test.out");
			for (int i = 0; i < b.length; i++)
				fout.write(b[i]);
			fout.close();
		} catch (Exception e) {
			System.out.println("경로/파일 확인");
		}
		System.out.println("c:\\temp\\test.out is saved");
	}

}
