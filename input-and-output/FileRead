import java.io.*;

public class TextRead {

    public static void main(String[] args) {
    
      try {
          FileReader myfile = new FileReader("test.txt");
          
          int i;
          
          while((i = myfile.read()) != -1) {
          
            char c = (char) i;
            System.out.print(c);
            }
            myfile.close();
          }catch (IOException e) {
            System.out.println(e);
        }
     }
}
          
