import java.util.Arrays;

public class Computer {
    private String name;
    private Body body;
    private CPU cpu;
    private VideoCard[] videoCard;


    Computer(String name, Body body, CPU cpu, VideoCard[] videoCard) {
        this.body = body;
        this.name = name;
        this.cpu = cpu;
        this.videoCard = videoCard;

    }

    private void setName(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    private void setBody(Body body) {
        this.body = body;
    }

    private Body getBody() {
        return body;
    }

    private void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    private CPU getCpu() {
        return cpu;
    }

    private void setVideoCard(VideoCard[] videoCard) {
        this.videoCard = videoCard;
    }

    private VideoCard[] getVideoCard() {
        return videoCard;
    }


    @Override
    public String toString() {
        return ("Computer name - " + getName() + '\n' + '\n' +
                "Body options - " + getBody() + '\n' + '\n' +
                "CPU options - " + getCpu() + '\n' + '\n' +
                "Video card options - " + Arrays.toString(videoCard) + '\n' + '\n'
        );
    }


}