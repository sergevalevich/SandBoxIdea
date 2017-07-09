package com.valevich;

public class Main {

    public static void main(String[] args) {

        IWifiCredentialsModel model = new WifiCredentialsModel();
        WifiCredentialsPresenter widgetPresenter = new WifiCredentialsPresenter(model);
        WifiCredentialsPresenter fragmentPresenter = new WifiCredentialsPresenter(model);

        Fragment fragment = new Fragment();
        fragment.setWifiCredentialsPresenter(fragmentPresenter);

        ViewHolder viewHolder = new ViewHolder();
        viewHolder.setWifiCredentialsPresenter(widgetPresenter);

        fragmentPresenter.setView(fragment);
        widgetPresenter.setView(viewHolder);


    }
}
