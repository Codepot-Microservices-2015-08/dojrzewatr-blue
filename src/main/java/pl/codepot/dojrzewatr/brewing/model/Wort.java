package pl.codepot.dojrzewatr.brewing.model;

public class Wort{

    public Wort(int wort) {
        this.wort = wort;
    }

    public Wort() {
    }

    public int getWort() {
        return wort;
    }

    public void setWort(int wort) {
        this.wort = wort;
    }

    private int wort;

}
