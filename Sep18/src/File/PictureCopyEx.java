package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PictureCopyEx {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\user\\Downloads\\pic.jpg");
		File d = new File("c:\\temp\\copiedpic.jpg");

		int c;

		try {
			FileInputStream fi = new FileInputStream(f);
			FileOutputStream fo = new FileOutputStream(d);

			while ((c = fi.read()) != -1) {
				fo.write((byte) c);
			}
			fi.close();
			fo.close();
			System.out.println("복사완료");

		} catch (Exception e) {
			System.out.println("오류발생");
		}
	}

}
