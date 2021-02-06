package hu.jnagy.rsp.service;

import hu.jnagy.rsp.challangeable.Challangeable;
import hu.jnagy.rsp.challangeable.Paper;
import hu.jnagy.rsp.challangeable.Rock;
import hu.jnagy.rsp.challangeable.Scissors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AISelectionProvider implements SelectionProvider {
    private static Challangeable Rock = new Rock();
    private static Challangeable Scissors = new Scissors();
    private static Challangeable Paper = new Paper();

    private List<Challangeable> elements = new ArrayList<Challangeable>();

    public AISelectionProvider() {
        elements.add(Rock);
        elements.add(Scissors);
        elements.add(Paper);
    }

    @Override
    public Challangeable getSelection() {
        Collections.shuffle(elements);
        return elements.get(0);
    }

}
