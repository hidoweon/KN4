package Sep20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamReaderEx {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("c:\\Temp\\hangul.txt");

		// 1byte stream을 2byte stream으로 변환객체
		InputStreamReader in = new InputStreamReader(fin, "utf-8");
		int c;

		// 2byte 문자스트림으로 부터 값을 읽어서 출력
		while ((c = in.read()) != -1) {
			System.out.print((char) c);
		}

	}

}
