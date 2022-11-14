public class Button {
    public String colour;

    public int radius;

    public Button(String colour, int radius) {
        this.radius = radius;
        this.colour = colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return ("Button  " + '\n' +
                "colour - " + colour + '\n' +
                " radius - " + radius);
    }
}


