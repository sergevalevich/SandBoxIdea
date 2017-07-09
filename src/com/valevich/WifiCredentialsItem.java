package com.valevich;

public class WifiCredentialsItem implements IWifiCredentialItem{

    private String ssid;

    private String password;

    private String band;

    public WifiCredentialsItem(String ssid, String password, String band) {
        this.ssid = ssid;
        this.password = password;
        this.band = band;
    }

    @Override
    public String getSsid() {
        return ssid;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getBand() {
        return band;
    }
}
