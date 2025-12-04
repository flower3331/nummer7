package h3;

public class Mensch {
    public String name = "Elsa";
    public int gebJahr = 2010;
    public int alter = 15;

    public void setName(String example) {
        name = example;
    }
    public void setGebJahr(int jahr) {
        gebJahr = jahr;
    }
    public void setAlter() {
        alter = 2025 - gebJahr;
    }
    public String getName() {
        return name;
    }
    public int getGebJahr() {
        return gebJahr;
    }
    public int getAlter() {
        return alter;
    }


    }

