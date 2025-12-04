package h3;

public class H3_main {
    public static void main(String[] args) {
        Mensch neu = new Mensch();
        neu.setName("Ella");
        neu.setGebJahr(2015);
        neu.setAlter();
        System.out.println("Name: " + neu.getName());
        System.out.println("GebJahr: " + neu.getGebJahr());
        System.out.println("Alter: " + neu.getAlter());

    }
}
