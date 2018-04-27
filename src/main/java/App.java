import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        final String callee = "78432215836";


        CustomConfig sipnetConfig1 = new CustomConfig("0042386593", "sipnet.ru", "fustcker6666") {{
            setDefaultCallee(callee);
        }};

        CustomConfig zadarmaConfig1 = new CustomConfig("981798","sip.zadarma.com", "fucker666") {{
            setDefaultCallee(callee);
        }};

        try {
            EventManager sipManager = new EventManager(sipnetConfig1);
            EventManager zadManaget = new EventManager(zadarmaConfig1);
//
//
//            manger2.call();

            List<EventManager> managers = new ArrayList<>();
            managers.add(zadManaget);
//            neoManaget.call();
            managers.add(sipManager);
//            managers.add(neoManaget);
            managers.forEach(EventManager::call);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}