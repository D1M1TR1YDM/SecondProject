public class VideoCard {
    String name;
    int gpuPower;

    public VideoCard(String name, int gpuPower) {
        this.gpuPower = gpuPower;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGpuPower(int gpuPower) {
        this.gpuPower = gpuPower;
    }

    public int getGpuPower() {
        return gpuPower;
    }

    @Override
    public String toString() {
        return ("VideoCard name - " + name + "\n" +
                "GPU power - " + gpuPower);
    }
}