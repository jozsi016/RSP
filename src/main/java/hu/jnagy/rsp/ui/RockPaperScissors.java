package hu.jnagy.rsp.ui;

import hu.jnagy.rsp.challangeable.Challangeable;
import hu.jnagy.rsp.service.Player;
import hu.jnagy.rsp.service.AISelectionProvider;
import hu.jnagy.rsp.service.ConsoleSelectionProvider;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in);

        System.out.println("Welcome to the rock paper scissors game.\n" +
                "Choose your type: Rock<r> Paper<p> Scissors<s>.\n" +
                "Press <x> to terminate the program");

        try {
            while (!scannerIn.hasNext("x")) {
                Player p1 = new Player(new ConsoleSelectionProvider(scannerIn));
                Player p2 = new Player(new AISelectionProvider());

                Challangeable c1 = p1.getSelection();
                Challangeable c2 = p2.getSelection();

                System.out.println("Your choice  " + "[" + c1 + "]");
                System.out.println("The machine choice  " + "[" + c2 + "]");

                if (c1.getType() == c2.getType()) {
                    System.out.println("Draw");
                } else {
                    if (c1.beats(c2)) {
                        System.out.println("You win");
                    } else {
                        System.out.println("Machine win");
                    }
                }
            }
        } catch (InputMismatchException ie) {
            System.out.println("Mismatch");
        }
        System.out.println("Program will terminate now! Bye.");
    }
}
