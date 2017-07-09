package com.valevich;


import java.util.List;

/**
 * Author dzianis_padalitski on 5/30/17.
 */
public interface WifiCredentialsView {


    void showNoGuestNetwork();

    void showPrivateCredentials(final List<IWifiCredentialItem> wifiCredentialItems);

    void showGuestCredentials(final IWifiCredentialItem wifiCredentialItem);


}
