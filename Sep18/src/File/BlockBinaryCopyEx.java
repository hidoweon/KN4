package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BlockBinaryCopyEx {

	public static void main(String[] args) {
		File f = new File("c:\\temp\\copiedpic.jpg");
		File d = new File("c:\\temp\\javasample\\newd.jpg");

		try {
			FileInputStream fi = new FileInputStream(f);
			FileOutputStream fo = new FileOutputStream(d);
			byte[] buf = new byte[1024 * 10];
			while (true) {
				int n = fi.read(buf); // read(����)�� ���ϰ��� ���ۿ� �Էµ� byte������ ����
				fo.write(buf, 0, n);
				if (n < buf.length)
					break; // ���� ���� ������ ����������
			}
			fi.close();
			fo.close();
			System.out.println("����Ϸ�");

		} catch (Exception e) {
			System.out.println("����");
		}

	}

}
