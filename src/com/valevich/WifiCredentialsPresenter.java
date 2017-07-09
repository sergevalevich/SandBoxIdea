package com.valevich;

/**
 * @author by dzianis_padalitski on 2/10/17.
 */

public class WifiCredentialsPresenter extends AppBasePresenter<WifiCredentialsView> {

    private final IWifiCredentialsModel wifiCredentialsModel;

    public WifiCredentialsPresenter(final IWifiCredentialsModel wifiCredentialsModel) {


        this.wifiCredentialsModel = wifiCredentialsModel;
    }

    @Override
    public void onFirstViewAttach() {
        super.onFirstViewAttach();

        loadData();
    }

    public void loadData() {
        wifiCredentialsModel.getGuestCredentials()
                .subscribe(
                        guestCreds -> {
                            if (guestCreds == null) {
                                getViewState().showNoGuestNetwork();
                            } else {
                                getViewState().showGuestCredentials(guestCreds);
                            }
                        });
    }


    public void loadPrivateCredentials() {
        wifiCredentialsModel.getPrivateCredentials()
                .subscribe(privateCreds -> getViewState().showPrivateCredentials(privateCreds));

    }
}
