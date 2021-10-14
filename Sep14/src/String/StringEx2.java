package String;

public class StringEx2 {

	public static void main(String[] args) {
		String subject = "Java Programming Java Programming";

		int index = subject.indexOf("Programming");

		int index2 = subject.lastIndexOf("Programming");

		System.out.println(index);
		System.out.println(index2);

		String fileName = "aaa.jpg";
		int lastIndex = fileName.lastIndexOf(".");
		String ext = fileName.substring(lastIndex + 1);
		System.out.println(ext);

	}

}
