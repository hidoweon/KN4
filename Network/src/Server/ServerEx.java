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
			// ���� ����
			listener = new ServerSocket(9999);
			System.out.println("���� ��� ��...");
			socket = listener.accept();
			System.out.println("����Ǿ����ϴ�.");

			// ��� ����
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// ������ �ְ�ޱ�
			while (true) {
				String inputMessage = in.readLine(); // Ŭ���̾�Ʈ�� ���� �� �پ� ���� �ޱ�

				// ��������
				if (inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("Ŭ���̾�Ʈ�κ��� ������ �����մϴ�.");
					break;
				}
				System.out.println("Ŭ���̾�Ʈ: " + inputMessage); // Ŭ���̾�Ʈ�� �޼��� ���
				System.out.println("������>>");
				String outputMessage = scanner.nextLine();
				out.write(outputMessage + "\n"); // ���� ��
				out.flush(); // ���ۿ� �����ִ� ������ �о�� �� ����
			}
		} catch (Exception e) {

		} finally {
			try {
				scanner.close();
				socket.close();
				listener.close();

			} catch (Exception e2) {
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� �����߻�");
			}
		}
	}

}
