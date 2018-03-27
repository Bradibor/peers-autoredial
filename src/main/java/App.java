import java.net.SocketException;

public class App {
    public static void main(String[] args) {
        try {
            EventManager manger = new EventManager(new CustomConfig("1006961", "sip.globtelecom.ru", "642677223"));
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
