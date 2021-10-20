package Sep20;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx3 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		final String fileName = "c:\\temp\\ex1.txt";
		FileWriter fout = new FileWriter(fileName);
		FileReader fin = new FileReader(fileName);
		int c;

		try {

			System.out.println("type in your message");
			while (true) {
				String line = scanner.nextLine();
				if (line.length() == 0)
					break; // ������ ������ ����Ű�� ġ�� ����������
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2); // ����ڿ� ĳ���� �����߰�
			}
			fout.close();

			// read()�Լ� ���ھ� �о intŸ������ ���ϸ޼ҵ�, ����Ÿ�� ������ -1�� ����
			while ((c = fin.read()) != -1) {
				System.out.print((char) c);
			}
			fin.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.close();

	}
}
