package com.valevich;

public class AppBasePresenter<T> {

    private T view;

    public T getViewState() {
        return view;
    }

    public void setView(T view) {
        this.view = view;
        onFirstViewAttach();
    }

    public void onFirstViewAttach() {

    }
}
