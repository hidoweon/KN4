package String;

import java.io.UnsupportedEncodingException;

public class ByteToStringEx {

	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };

		String str = new String(bytes);
		System.out.println(str);

		String str1 = new String(bytes, 6, 4);
		System.out.println(str1);

		byte[] bytes2 = "ȫ�浿".getBytes();

//		for (int i = 0; i < bytes2.length; i++) {
//			System.out.println((int) bytes2[i]);
//		}

		String str2 = new String(bytes2, "euc-kr");
		System.out.println(str2);
	}

}
