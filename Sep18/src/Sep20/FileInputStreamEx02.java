package Sep20;

import java.io.FileInputStream;

public class FileInputStreamEx02 {

	public static void main(String[] args) {
		byte[] b = new byte[6];

		try {
			FileInputStream fin = new FileInputStream("c:\\temp\\test.out");
			int n = 0, c;
			while ((c = fin.read()) != -1) {
				b[n] = (byte) c;
				n++;
			}
			System.out.println("���Ͽ��� ���� �迭 ���");

			for (int i = 0; i < b.length; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();
			fin.close();
		} catch (Exception e) {
			System.out.println("��� Ȯ���ض�");
		}
		{
		}

	}

}
