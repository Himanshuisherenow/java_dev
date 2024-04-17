package datagram;
import java.io.IOException;
import java.net.*;


public class udp1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        String str = "This is message for Diti";
        InetAddress ip = InetAddress.getByName("localhost");
        DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),ip,2000);
        ds.send(dp);
        ds.close();
    }
}
