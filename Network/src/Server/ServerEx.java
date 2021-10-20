package Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);

		try {
			// 서버 생성
			listener = new ServerSocket(9999);
			System.out.println("연결 대기 중...");
			socket = listener.accept();
			System.out.println("연결되었습니다.");

			// 통신 진행
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// 데이터 주고받기
			while (true) {
				String inputMessage = in.readLine(); // 클라이언트로 부터 한 줄씩 정보 받기

				// 종료조건
				if (inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트로부터 연결을 종료합니다.");
					break;
				}
				System.out.println("클라이언트: " + inputMessage); // 클라이언트의 메세지 출력
				System.out.println("보내기>>");
				String outputMessage = scanner.nextLine();
				out.write(outputMessage + "\n"); // 보낼 말
				out.flush(); // 버퍼에 남아있는 데이터 밀어내기 밑 종료
			}
		} catch (Exception e) {

		} finally {
			try {
				scanner.close();
				socket.close();
				listener.close();

			} catch (Exception e2) {
				System.out.println("클라이언트와 채팅 중 오류발생");
			}
		}
	}

}
