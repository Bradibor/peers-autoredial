import net.sourceforge.peers.Config;
import net.sourceforge.peers.sip.core.useragent.SipListener;
import net.sourceforge.peers.sip.transport.SipRequest;
import net.sourceforge.peers.sip.transport.SipResponse;

public class EventManager implements SipListener {
    public EventManager(Config config) {
        Config config1 = new CustomConfig("");
    }

    public void registering(SipRequest sipRequest) {

    }

    public void registerSuccessful(SipResponse sipResponse) {

    }

    public void registerFailed(SipResponse sipResponse) {

    }

    public void incomingCall(SipRequest sipRequest, SipResponse sipResponse) {

    }

    public void remoteHangup(SipRequest sipRequest) {

    }

    public void ringing(SipResponse sipResponse) {

    }

    public void calleePickup(SipResponse sipResponse) {

    }

    public void error(SipResponse sipResponse) {

    }
}
