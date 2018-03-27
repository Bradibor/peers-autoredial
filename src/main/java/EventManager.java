import net.sourceforge.peers.Config;
import net.sourceforge.peers.FileLogger;
import net.sourceforge.peers.Logger;
import net.sourceforge.peers.javaxsound.JavaxSoundManager;
import net.sourceforge.peers.sip.core.useragent.SipListener;
import net.sourceforge.peers.sip.core.useragent.UserAgent;
import net.sourceforge.peers.sip.syntaxencoding.SipUriSyntaxException;
import net.sourceforge.peers.sip.transport.SipRequest;
import net.sourceforge.peers.sip.transport.SipResponse;

import java.net.SocketException;

public class EventManager implements SipListener {
    private UserAgent userAgent;
    private SipRequest sipRequest;
    private CustomConfig config;

    public EventManager(CustomConfig config) throws SocketException {
        this.config = config;
        Logger logger = new FileLogger(null);
        JavaxSoundManager javaxSoundManager = new JavaxSoundManager(false, logger, null);
        userAgent = new UserAgent(this, config, logger, javaxSoundManager);
        new Thread(){
            public void run(){
                try {
                    userAgent.register();
                }catch (SipUriSyntaxException e){
                    e.printStackTrace();
                }
            }
        }.start();
    }

    public void call() {
        new Thread() {
            @Override
            public void run() {
                try {
                    sipRequest = userAgent.invite(config.getDefaultCallee(), null);
                }catch (SipUriSyntaxException e){
                    e.printStackTrace();
                }
            }
        }.start();
    }

    public void hangup() {
        new Thread() {
            @Override
            public void run() {
                userAgent.terminate(sipRequest);
            }
        }.start();
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
