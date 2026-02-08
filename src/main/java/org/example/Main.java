package org.example;

import org.example.MonkeyTypeAutomation.MonkeyType;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        MonkeyType mt = new MonkeyType();
        try {
            mt.run("chrome");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}