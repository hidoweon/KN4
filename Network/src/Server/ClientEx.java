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
			// localhost = 127.0.0.1�� ������ ������ �ּ�
			// �ƴϸ� ipconfig���� �ڱ� IP�ּ� ã��
			socket = new Socket("localhost", 9999);

			// ��Ʈ�� ����
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			while (true) {
				System.out.println("������>>");
				String outputMessage = scanner.nextLine();

				if (outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage + "\n");
					out.flush();
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();

				// �ޱ�
				String inputMessage = in.readLine();
				System.out.println("����: " + inputMessage);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				if (socket != null)
					socket.close();
			} catch (Exception e2) {
				System.out.println("������ ä�� �� �����߻�.");
			}
		}
	}

}
