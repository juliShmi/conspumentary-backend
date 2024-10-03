package juli_shmi.conspumentary.model;

public class Attributes {
    private int badAss;
    private int smartAss;
    private int eggHead;
    private int tinFoilHat;

    public int getBadAss() {
        return badAss;
    }

    public void setBadAss(int badAss) {
        this.badAss = badAss;
    }

    public int getSmartAss() {
        return smartAss;
    }

    public void setSmartAss(int smartAss) {
        this.smartAss = smartAss;
    }

    public int getEggHead() {
        return eggHead;
    }

    public void setEggHead(int eggHead) {
        this.eggHead = eggHead;
    }

    public int getTinFoilHat() {
        return tinFoilHat;
    }

    public void setTinFoilHat(int tinFoilHat) {
        this.tinFoilHat = tinFoilHat;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "badAss=" + badAss +
                ", smartAss=" + smartAss +
                ", eggHead=" + eggHead +
                ", tinFoilHat=" + tinFoilHat +
                '}';
    }
}
