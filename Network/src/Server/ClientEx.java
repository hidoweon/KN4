package Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);

		try {
			// localhost = 127.0.0.1과 동일한 도메인 주소
			// 아니면 ipconfig에서 자기 IP주소 찾기
			socket = new Socket("localhost", 9999);

			// 스트림 생성
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			while (true) {
				System.out.println("보내기>>");
				String outputMessage = scanner.nextLine();

				if (outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage + "\n");
					out.flush();
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();

				// 받기
				String inputMessage = in.readLine();
				System.out.println("서버: " + inputMessage);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				if (socket != null)
					socket.close();
			} catch (Exception e2) {
				System.out.println("서버와 채팅 중 오류발생.");
			}
		}
	}

}
