package Sep20;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {

	public static void main(String[] args) throws IOException {
		FileWriter fout = new FileWriter("c:\\temp\\test.txt");

		// ���ڸ� ���Ͽ� ����
		fout.write('A');

		// �ڿ���ü
		fout.close();

	}

}
