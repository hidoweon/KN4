package File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TextCopyEx {

	public static void main(String[] args) {
		File f = new File("c:\\windows\\system.ini"); // 원본
		File d = new File("c:\\temp\\system.txt"); // 복사

		int c;
		try {
			FileReader fr = new FileReader(f);
			FileWriter fw = new FileWriter(d);

			while ((c = fr.read()) != -1) {
				fw.write((char) c);
			}
			fr.close();
			fw.close();
			System.out.println(f.getPath() + "를" + d.getPath() + "로 복사완료");
		} catch (Exception e) {
			System.out.println("복사 오류 발생");
		}
	}

}
