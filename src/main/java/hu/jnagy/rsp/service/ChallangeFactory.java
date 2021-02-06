package hu.jnagy.rsp.service;

import hu.jnagy.rsp.challangeable.Challangeable;
import hu.jnagy.rsp.challangeable.Paper;
import hu.jnagy.rsp.challangeable.Rock;
import hu.jnagy.rsp.challangeable.Scissors;

import java.util.InputMismatchException;

public class ChallangeFactory {
    private static Challangeable Rock = new Rock();
    private static Challangeable Scissors = new Scissors();
    private static Challangeable Paper = new Paper();

    public Challangeable getElement(String inPut) {
        if (inPut.equals("r")) {
            return Rock;
        } else if (inPut.equals("p")) {
            return Paper;
        } else if (inPut.equals("s")) {
            return Scissors;
        } else
            throw new InputMismatchException();
    }
}
