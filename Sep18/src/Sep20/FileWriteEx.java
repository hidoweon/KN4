package Sep20;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {

	public static void main(String[] args) throws IOException {
		FileWriter fout = new FileWriter("c:\\temp\\test.txt");

		// 문자를 파일에 저장
		fout.write('A');

		// 자원해체
		fout.close();

	}

}
