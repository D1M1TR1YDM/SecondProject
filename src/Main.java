import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerB = new Scanner(System.in);
        Scanner scannerI = new Scanner(System.in);
        boolean change = true;
        String bodyName = "cool body";
        String firstButtonColour = "blue";
        String secondButtonColour = "red";
        int firstButtonRadius = 2;
        int secondButtonRadius = 2;
        Button buttonFirst = new Button(firstButtonColour, firstButtonRadius);
        Button buttonSecond = new Button(secondButtonColour, secondButtonRadius);
        Button[] buttonAmount = new Button[2];
        buttonAmount[0] = buttonFirst;
        buttonAmount[1] = buttonSecond;
        String diskDrive = "LG";
        String bodyColour = "black";
        Body body = new Body(bodyName, buttonAmount, diskDrive, bodyColour);
        String computerName = "Cool";
        int cpuCores = 8;
        String cpuName = "intel";
        CPU cpu = new CPU(cpuName, cpuCores);
        String videoCardFirstName = "rtx 4020";
        String videoCardSecondName = "rtx 2020";
        int videoCardFirstPower = 500;
        int videoCardSecondPower = 250;
        VideoCard videoCardFirst = new VideoCard(videoCardFirstName, videoCardFirstPower);
        VideoCard videoCardSecond = new VideoCard(videoCardSecondName, videoCardSecondPower);
        VideoCard[] videoCardAmount = new VideoCard[2];
        videoCardAmount[0] = videoCardFirst;
        videoCardAmount[1] = videoCardSecond;
        Computer computer = new Computer(computerName, body, cpu, videoCardAmount);
        System.out.println(computer);
        for (boolean i; change; ) {
            System.out.println("do you want to change true or false");
            change = scannerB.nextBoolean();
            if (change) {
                System.out.println("what do yo want to change? CPU = 0 Video Card = 1");
                int chose = scannerI.nextInt();
                if (chose != 0 && chose != 1) {
                    System.out.println("error");
                    break;
                } else computerNew(chose);

            }

        }

    }

    public static CPU cpuNew(int chose) {
        CPU cpu = new CPU();
        if (chose == 0) {
            cpu.name = "asus";
            cpu.core = 16;
        } else {
            cpu.name = "intel";
            cpu.core = 8;
        }
        return cpu;
    }

    public static VideoCard[] videoCardNew(int chose) {
        VideoCard[] videoCardAmount = new VideoCard[2];
        String videoCardFirstName = "rtx 4020";
        String videoCardSecondName = "rtx 2020";
        int videoCardFirstPower = 500;
        int videoCardSecondPower = 250;

        if (chose == 1) {
            videoCardFirstName = "rtx 5050";
            videoCardSecondName = "rtx 3040";
            videoCardFirstPower = 1000;
            videoCardSecondPower = 600;

        }
        VideoCard videoCardFirst = new VideoCard(videoCardFirstName, videoCardFirstPower);
        VideoCard videoCardSecond = new VideoCard(videoCardSecondName, videoCardSecondPower);
        videoCardAmount[0] = videoCardFirst;
        videoCardAmount[1] = videoCardSecond;
        return videoCardAmount;
    }

    public static void computerNew(int chose) {
        String bodyName = "cool body";
        String firstButtonColour = "blue";
        String secondButtonColour = "red";
        int firstButtonRadius = 2;
        int secondButtonRadius = 2;
        Button buttonFirst = new Button(firstButtonColour, firstButtonRadius);
        Button buttonSecond = new Button(secondButtonColour, secondButtonRadius);
        Button[] buttonAmount = new Button[2];
        buttonAmount[0] = buttonFirst;
        buttonAmount[1] = buttonSecond;
        String diskDrive = "LG";
        String bodyColour = "black";
        Body body = new Body(bodyName, buttonAmount, diskDrive, bodyColour);
        String computerName = "Cool";


        Computer computer = new Computer(computerName, body, cpuNew(chose), videoCardNew(chose));
        System.out.println(computer);
    }

}

