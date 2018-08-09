package xyz.bradibarus.peers;

import java.net.SocketException;

public class Zadarma1c2 {
    public static void main(String[] args) {
        final String callee = "78432215836";

        CustomConfig zadarmaConfig1 = new CustomConfig("0042386593","sipnet.ru", "fustcker6666") {{
            setDefaultCallee(callee);
        }};

        try {
            EventManager zadManager = new EventManager(zadarmaConfig1);
            zadManager.call();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
