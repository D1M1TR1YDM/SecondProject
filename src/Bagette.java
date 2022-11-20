public class Bagette extends Bread {
    double length;
    int amountCut;

    public Bagette(int value, double weight, double length, int amountCut) {
        super(value, weight);
        this.length = length;
        this.amountCut = amountCut;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setAmountCut(int amountCut) {
        this.amountCut = amountCut;
    }

    public int getAmountCut() {
        return amountCut;
    }

    public String makeCuts() {
        return amountCut + " cuts made" + "\n";
    }

    @Override
    public String packing(boolean readiness) {
        if (!readiness) return ("impossible to pack because is not ready" + "\n");
        else return ("bread is packed only in eco package" + "\n");
    }

    @Override
    public String toString() {
        return "BAGETTE " + "\n" +
                "weight - " + weight + "\n" +
                "value - " + value + "\n" +
                "length - " + length + "\n" +
                "amount of cuts : " + amountCut + "\n";
    }
}
