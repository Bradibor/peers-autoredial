package xyz.bradibarus.peers;

import java.net.SocketException;

public class Zadarma3c3 {
    public static void main(String[] args) {
        final String callee = "78432215836";

        CustomConfig zadarmaConfig1 = new CustomConfig("981881","sip.zadarma.com", "fucker666") {{
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
