package com.valevich;

import java.util.List;

public class Fragment implements WifiCredentialsView{

    private WifiCredentialsPresenter wifiCredentialsPresenter;

    public void setWifiCredentialsPresenter(WifiCredentialsPresenter wifiCredentialsPresenter) {
        this.wifiCredentialsPresenter = wifiCredentialsPresenter;
    }

    @Override
    public void showPrivateCredentials(List<IWifiCredentialItem> wifiCredentialItems) {
        System.out.println("showing private creds in fragment");
    }

    @Override
    public void showGuestCredentials(IWifiCredentialItem wifiCredentialItem) {
        System.out.println("showing guest creds in fragment");
        wifiCredentialsPresenter.loadPrivateCredentials();
    }

    @Override
    public void showNoGuestNetwork() {
        System.out.println("showing button on the screen");
        wifiCredentialsPresenter.loadPrivateCredentials();
    }
}
