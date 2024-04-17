import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Main2{

    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost",1212);
            InputStream inStr = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inStr));
            String receivedMessage = br.readLine();
            System.out.println("Received Message :" + receivedMessage);
            br.close();
            s.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
