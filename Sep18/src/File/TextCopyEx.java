package File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TextCopyEx {

	public static void main(String[] args) {
		File f = new File("c:\\windows\\system.ini"); // ����
		File d = new File("c:\\temp\\system.txt"); // ����

		int c;
		try {
			FileReader fr = new FileReader(f);
			FileWriter fw = new FileWriter(d);

			while ((c = fr.read()) != -1) {
				fw.write((char) c);
			}
			fr.close();
			fw.close();
			System.out.println(f.getPath() + "��" + d.getPath() + "�� ����Ϸ�");
		} catch (Exception e) {
			System.out.println("���� ���� �߻�");
		}
	}

}
