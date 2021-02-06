package hu.jnagy.rsp.service;

import hu.jnagy.rsp.challangeable.Challangeable;

public class Player implements SelectionProvider {
    private SelectionProvider provider;

    public Player(SelectionProvider provider) {
        this.provider = provider;
    }

    @Override
    public Challangeable getSelection() {
        return provider.getSelection();
    }

}
