package com.valevich;

import java.util.List;

public class ViewHolder implements WifiCredentialsView {

    private WifiCredentialsPresenter wifiCredentialsPresenter;

    public void setWifiCredentialsPresenter(WifiCredentialsPresenter wifiCredentialsPresenter) {
        this.wifiCredentialsPresenter = wifiCredentialsPresenter;
    }

    @Override
    public void showNoGuestNetwork() {
        wifiCredentialsPresenter.loadPrivateCredentials();
    }

    @Override
    public void showPrivateCredentials(List<IWifiCredentialItem> wifiCredentialItems) {
        System.out.println("showing private creds in viewHolder");
    }

    @Override
    public void showGuestCredentials(IWifiCredentialItem wifiCredentialItem) {
        System.out.println("showing guest creds in viewHolder");
    }
}
