package Sep20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamReaderEx {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("c:\\Temp\\hangul.txt");

		// 1byte stream�� 2byte stream���� ��ȯ��ü
		InputStreamReader in = new InputStreamReader(fin, "utf-8");
		int c;

		// 2byte ���ڽ�Ʈ������ ���� ���� �о ���
		while ((c = in.read()) != -1) {
			System.out.print((char) c);
		}

	}

}
