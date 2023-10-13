package org.example.LSP;

public class Test {
    public static void main(String[] args) {
        QuadRandle quadRandle = new Rectangle(5,3);
        System.out.println("Rectangle " + quadRandle.area());
        quadRandle = new Square(4);
        System.out.println("Square " + quadRandle.area());

    }

}
