package org.example.Ex003Math.Client;

import org.example.Ex003Math.Core.Views.View;

import java.util.Scanner;



public class ConsoleView implements View {
    Scanner in = new Scanner(System.in);

    public String get() {
        return in.next();
    };

    @Override
    public void set(String value) {
        System.out.println(value);

    }
}
