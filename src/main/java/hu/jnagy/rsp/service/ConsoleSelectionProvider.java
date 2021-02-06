package hu.jnagy.rsp.service;

import hu.jnagy.rsp.challangeable.Challangeable;

import java.util.Scanner;

public class ConsoleSelectionProvider implements SelectionProvider {
    private ChallangeFactory factory = new ChallangeFactory();
    private Scanner scannerIn;

    public ConsoleSelectionProvider(Scanner scannerIn) {
        this.scannerIn = scannerIn;
    }

    @Override
    public Challangeable getSelection() {
        String inPut = scannerIn.nextLine();
        return factory.getElement(inPut);
    }


}
