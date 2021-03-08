package CheckIp;

import java.net.InetAddress;

public class IpAdd {
    public static class JavaInetAddressGetLocalHostExample {
        public static void main(String[] args) {
            try {
                InetAddress ia = InetAddress.getLocalHost();
                String str = ia.getHostAddress();
                System.out.println(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

///this is copy and paste i will look this after submitting this assignment

