# 객체의 직렬화

## 직렬화란?

객체를 스트림을 통해 파일에 저장하거나 네트워크로 전송하려고
바이트 형태로 만드는 것입니다. 반대로 전송받은 직렬화된 객체를
다시 원래의 객체로 만드는 것을 **역직렬화** 라고 합니다.

직렬화 클래는 **java.io.Serializable** 인터페이스를 받아서 만들 수
있습니다.

## 직렬화 구조

**1.** Serialiazable 인터페이스를 상속(유의할 점은 필드만 직렬화 대상이 된다).

**2.** Try ~ catch문으로 감싼다. 

**3.** FileOutputStream 과 ObjectOutputStream 객체 생성.

**4.** 원하는 객체를 만들고 매개변수를 입력한다.

**5.** 입력한 값을 out.writeObject를 통해 파일에 쓴다.

**6.** close();

**7.** FileInputStream 과 ObjectInputStream 객체를 생성한다.

**8.** 객체 데이터를 반복문을 사용해서 전부 출력한다.
