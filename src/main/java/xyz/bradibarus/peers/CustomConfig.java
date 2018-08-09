package xyz.bradibarus.peers;

import net.sourceforge.peers.Config;
import net.sourceforge.peers.media.MediaMode;
import net.sourceforge.peers.sip.syntaxencoding.SipURI;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class CustomConfig implements Config {

    private InetAddress publicIpAddress;
    private String userPart;
    private String domain;
    private String password;
    private MediaMode mediaMode;
    private String defaultCallee;

    public String getDefaultCallee() {
        return defaultCallee;
    }

    public void setDefaultCallee(String defaultCallee) {
        this.defaultCallee = defaultCallee;
    }

    public void save() {

    }

    public CustomConfig(String userPart, String domain, String password) {
        this.userPart = userPart;
        this.domain = domain;
        this.password = password;
        this.mediaMode = MediaMode.captureAndPlayback;
    }

    public InetAddress getLocalInetAddress() {
        InetAddress inetAddress;
        try {
            inetAddress = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
        return inetAddress;
    }

    public InetAddress getPublicInetAddress() {
        return publicIpAddress;
    }

    public String getUserPart() {
        return userPart;
    }

    public String getDomain() {
        return domain;
    }

    public String getPassword() {
        return password;
    }

    public SipURI getOutboundProxy() {
        return null;
    }

    public int getSipPort() {
        return 0;
    }

    public MediaMode getMediaMode() {
        return mediaMode;
    }

    public boolean isMediaDebug() {
        return false;
    }

    public String getMediaFile() {
        return null;
    }

    public int getRtpPort() {
        return 0;
    }

    public void setLocalInetAddress(InetAddress inetAddress) {
    }

    public void setPublicInetAddress(InetAddress inetAddress) {
        publicIpAddress = inetAddress;
    }

    public void setUserPart(String s) {
        userPart = s;
    }

    public void setDomain(String s) {
        domain = s;
    }

    public void setPassword(String s) {
        password = s;
    }

    public void setOutboundProxy(SipURI sipURI) {

    }

    public void setSipPort(int i) {

    }

    public void setMediaMode(MediaMode mediaMode) {
        this.mediaMode = mediaMode;
    }

    public void setMediaDebug(boolean b) {

    }

    public void setMediaFile(String s) {

    }

    public void setRtpPort(int i) {

    }
}
