package File;

import java.io.File;

public class FileEx {

	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath() + "," + f1.getParent() + "," + f1.getName());

		String res = "";
		if (f1.isFile())
			res = "파일";
		else if (f1.isDirectory())
			res = "디렉토리";
		System.out.println(f1.getPath() + "=" + res);

		System.out.println();
		System.out.println("***directory***");
		File f2 = new File("c:\\temp\\java_sample");

		if (!f2.exists()) {
			f2.mkdir(); // 파일 정보가 없으면 생성 -(디렉토리로 생성 mkdir)
		}

		listDirectory(new File("c:\\temp"));

		// 파일명변경
		f2.renameTo(new File("c:\\temp\\javasample"));

	}

	public static void listDirectory(File dir) {
		System.out.println(dir.getPath());
		File[] subfiles = dir.listFiles();

		for (int i = 0; i < subfiles.length; i++) {
			File f = subfiles[i];
			long t = f.lastModified(); // 생성된/수정된 일시 리턴 (1999,1,1,0,0,0)
			System.out.print(f.getName());
			System.out.print("\t파일 크기:" + f.length());
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", t, t, t, t);
		}
	}
}
