package datagram;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class udp2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(2000);
        byte[] buffer = new byte[1024];
        DatagramPacket  dp = new DatagramPacket(buffer,1024);
        ds.receive(dp);
        String str = new String(dp.getData(),0,dp.getLength());
        System.out.println("Receive : "+str);
        ds.close();

    }
}
