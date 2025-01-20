# Java Networking: Simple Server Example

## 개요
해당 코드는 Java를 사용하여 간단한 서버를 구현한 예제입니다.  
**`ServerTest`** 클래스는 서버 소켓을 생성하고 클라이언트와의 연결을 처리하는 기본적인 네트워킹 구조를 보여줍니다.  
이 코드를 통해 Java에서 소켓 프로그래밍의 기초를 학습할 수 있습니다.

---

## 코드 설명

### 주요 기능
1. **ServerSocket 생성**  
   - `ServerSocket`을 사용해 5050번 포트에서 클라이언트 연결을 대기합니다.

2. **클라이언트 연결**  
   - `accept()` 메서드로 클라이언트 연결 요청을 수락합니다.

3. **데이터 송수신**  
   - **`BufferedReader`**: 클라이언트로부터 데이터를 읽습니다.
   - **`PrintWriter`**: 클라이언트에게 데이터를 보냅니다.

4. **자원 관리**  
   - `try-finally` 블록을 통해 소켓과 서버 소켓을 안전하게 닫습니다.

### 주요 코드 흐름
```java
ServerSocket serverSocket = new ServerSocket(5050);  // 5050번 포트에서 서버 소켓 생성
System.out.println("ready to connect....");

Socket socket = serverSocket.accept();  // 클라이언트 연결 대기
System.out.println("connected!!!");

// 클라이언트와 데이터 송수신
BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
PrintWriter writer = new PrintWriter(socket.getOutputStream());

// 클라이언트 메시지 읽기
System.out.println(reader.readLine());  // 클라이언트가 보낸 메시지 출력

// 클라이언트에게 응답 전송
writer.println("HI I'm SERVER");
writer.flush();  // 데이터 전송
