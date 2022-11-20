public class Bread {
    int value;
    double weight;

    public Bread(int value, double weight) {
        this.weight = weight;
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }


    public String packing(boolean readiness) {
        if (!readiness) return ("impossible to pack because is not ready" + "\n");
        else return ("bread is packed" + "\n");
    }

    @Override
    public String toString() {
        return "CLASSIC BREAD" + "\n" +
                "weight od bread - " + weight + "\n" +
                "value of bread - " + value + "\n";
    }
}
