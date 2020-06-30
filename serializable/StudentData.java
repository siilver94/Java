package swing;

import java.io.*;

class StudentData implements java.io.Serializable {

	String name;
	int age;

	StudentData(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void printInfo() {
		System.out.println("이름: " + name + " 나이 :" + age);
	}
}

public class Main {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("D:\\Data.dat");
			ObjectOutputStream out = new ObjectOutputStream(fos);

			StudentData m1 = new StudentData("Eun Sung Kim", 28);
			StudentData m2 = new StudentData("Hyun Joong Moon", 29);
			StudentData m3 = new StudentData("Joon Tae Park", 23);

			out.writeObject(m1);
			out.writeObject(m2);
			out.writeObject(m3);

			fos.close();
			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			FileInputStream fis = new FileInputStream("D:\\Data.dat");
			ObjectInputStream in = new ObjectInputStream(fis);

			StudentData data;

			while ((data = (StudentData) in.readObject()) != null) {
				data.printInfo();
			}
			fis.close();
			in.close();

		} catch (EOFException e) {
			System.out.println("더는 읽을 데이터가 없습니다.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
