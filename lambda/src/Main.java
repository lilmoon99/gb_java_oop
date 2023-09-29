public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        DivideToThirteen myInterface = x -> x % 13 == 0;
        System.out.println(myInterface.isThirteenDivider(23));
        Descriminant descriminant = ( double a, double b, double c) -> a* Math.pow(b,c);
        System.out.println(descriminant.descrim(4,4,4));
    }
}