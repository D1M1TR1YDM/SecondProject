public class RoundBread extends Bread {
    double radius;

    public RoundBread(int value, double weight, double radius) {
        super(value, weight);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String paint(boolean readiness) {
        if (!readiness) return super.packing(readiness) + "impossible to paint" + "\n";
        else return super.packing(readiness) + "bread is painted " + "\n";
    }

    @Override
    public String toString() {
        if (weight > 0)
            return "ROUNDBREAD" + "\n" +
                    "weight of bread - " + weight + "\n" +
                    "value - " + value + "\n";
        else return "no weight impossible to do anything" + "\n";

    }

}
