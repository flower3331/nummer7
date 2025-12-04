package h1;

public class Zahl {
    boolean even = false;
    boolean small = false;
    boolean positive = false;
    int num = 7;

    public void setEven() {
        if (num % 2 == 0) {
            even = true;
        } else {
            even = false;
        }
    }

    public void setPositive() {
        if (num > 0) {
            positive = true;
        } else {
            positive = false;
        }
    }

    public void setSmall() {
        if (num < 1000) {
            small = true;
        } else {
            small = false;
        }
    }
}

