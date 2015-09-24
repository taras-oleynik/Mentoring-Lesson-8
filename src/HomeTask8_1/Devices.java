package HomeTask8_1;

public abstract class Devices {

    boolean isTrunOn = false;

    abstract boolean isTurnOn();

    abstract int power();

    public void turnOnTeepot() {
        isTrunOn = true;
    }

    public void turnOffTeepot() {
        isTrunOn = false;
    }

    abstract int getPrice();

    abstract String getName();
}
