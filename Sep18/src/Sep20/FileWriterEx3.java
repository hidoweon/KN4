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
					break; // 문장이 없을때 엔터키를 치면 빠져나오기
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2); // 문장뒤에 캐리지 리턴추가
			}
			fout.close();

			// read()함수 한자씩 읽어서 int타입으로 리턴메소드, 데이타가 없으면 -1을 리턴
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
