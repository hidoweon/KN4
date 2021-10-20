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
				int n = fi.read(buf); // read(버퍼)의 리턴값은 버퍼에 입력된 byte갯수를 리턴
				fo.write(buf, 0, n);
				if (n < buf.length)
					break; // 남은 버퍼 버리고 빠져나가기
			}
			fi.close();
			fo.close();
			System.out.println("복사완료");

		} catch (Exception e) {
			System.out.println("오류");
		}

	}

}
