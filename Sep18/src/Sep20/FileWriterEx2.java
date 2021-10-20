package Sep20;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;

		try {
			fout = new FileWriter("c:\\temp\\test2.txt");
			System.out.println("type in your message");
			while (true) {
				String line = scanner.nextLine();
				if (line.length() == 0)
					break; // ������ ������ ����Ű�� ġ�� ����������
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2); // ����ڿ� ĳ���� �����߰�
			}
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
