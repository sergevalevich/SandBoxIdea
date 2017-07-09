package com.valevich;

import rx.Observable;

import java.util.Collections;
import java.util.List;

public class WifiCredentialsModel implements IWifiCredentialsModel {

    @Override
    public Observable<List<IWifiCredentialItem>> getPrivateCredentials() {
        WifiCredentialsItem privateCredentials = new WifiCredentialsItem("privateSsid","privatePass","2,4");
        return Observable.just(Collections.singletonList(privateCredentials));
    }

    @Override
    public Observable<IWifiCredentialItem> getGuestCredentials() {
        boolean isEnabled = Math.random() > 0;
        WifiCredentialsItem guestCredentials = new WifiCredentialsItem("guestSsid","guestPass","2,4");
        if (isEnabled) {
            return Observable.just(guestCredentials);
        }
        return Observable.just(null);
    }
}
