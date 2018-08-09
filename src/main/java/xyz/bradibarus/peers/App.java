package xyz.bradibarus.peers;

import java.net.SocketException;

public class App {
    public static void main(String[] args) {
        final String callee = "78432215836";

        CustomConfig sipnetConfig1 = new CustomConfig("0042386593", "sipnet.ru", "fustcker6666") {{
            setDefaultCallee(callee);
        }};

        try {
            EventManager sipManager = new EventManager(sipnetConfig1);
            sipManager.call();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}