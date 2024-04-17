
import  java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        try{
            ServerSocket ss = new ServerSocket(1212);
            Socket s = ss.accept();
            OutputStream obj = s.getOutputStream();
            PrintStream ps = new PrintStream(obj);
            ps.println("Hey Himanshu ! what is going on there");
            ss.close();
            s.close();
            ps.close();


        } catch (IOException e) {
            //e.printStackTrace();
            throw new RuntimeException(e);

        }

    }
}