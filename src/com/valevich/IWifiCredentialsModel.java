package com.valevich;

import rx.Observable;

import java.util.List;

/**
 * @author dzianis_padalitski on 2/10/17.
 */

public interface IWifiCredentialsModel {


    Observable<List<IWifiCredentialItem>> getPrivateCredentials();

    Observable<IWifiCredentialItem> getGuestCredentials();

}
