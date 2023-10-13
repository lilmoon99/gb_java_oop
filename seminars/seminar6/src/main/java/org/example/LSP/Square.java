package org.example.LSP;

public class Square extends QuadRandle{
    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public int area() {
        return length * length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}
