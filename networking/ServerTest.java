import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;  // 초기화
		
		try {
			serverSocket = new ServerSocket(5050);
			System.out.println("ready to connect....");
			socket = serverSocket.accept();  // 서버소켓 기다리게 하기 
			System.out.println("connected!!!");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 입력
			PrintWriter writer = new PrintWriter(socket.getOutputStream());  // 텍스를 바이너리로 바꿔주면서 소켓출력 형식으로 가공
			
			System.out.println(reader.readLine());  // 엔터키 입력 
			writer.println("HI I'm SERVER");
			writer.flush(); // 중요 : 보낼때 버퍼는 
			
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				socket.close();
			} catch (Exception e) {}
			
			try {
				serverSocket.close();
			} catch (Exception e) {}
		}
		
	}
}
