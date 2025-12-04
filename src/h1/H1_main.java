package h1;

public class H1_main {
    public static void main(String[] args) {
        Zahl a = new Zahl();
        a.setEven();
        a.setSmall();
        a.setPositive();
        System.out.println("even? " + a.even);
        System.out.println("small? " + a.small);
        System.out.println("positive? " + a.positive);
    }
}