import java.util.Arrays;

public class Body {
    private String name;
    private Button[] button;
    private String diskDrive;
    private String colour;

    Body(String name, Button[] button, String diskDrive, String colour) {
        this.name = name;
        this.button = button;
        this.diskDrive = diskDrive;
        this.colour = colour;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    private void setColour(String colour) {
        this.colour = colour;
    }

    private String getColour() {
        return colour;
    }

    private void setButton(Button[] button) {
        this.button = button;
    }

    private Button[] getButton() {
        return button;
    }

    private void setDiskDrive(String diskDrive) {
        this.diskDrive = diskDrive;
    }

    private String getDiskDrive() {
        return diskDrive;
    }

    @Override
    public String toString() {
        return ("Bode name - " + getName() + '\n' +
                "Buttons: " + Arrays.toString(button) + "\n" +
                "Disk drive - " + getDiskDrive() + '\n' +
                "Colour - " + getColour()
        );
    }
}