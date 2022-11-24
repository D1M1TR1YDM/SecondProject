import java.util.Scanner;

public class SIM {
    private double balance;
    private double costRing;
    private double costSms;
    private double costMobileInternet;
    private double mobileInternet;
    private String yourOperator;
    private String otherOperator;

    public SIM() {
    }

    ;

    public SIM(double costMobileInternet, double balance, double costRing, double costSms, double mobileInternet, String yourOperator, String otherOperator) {
        this.yourOperator = yourOperator;
        this.otherOperator = otherOperator;
        this.balance = balance;
        this.costRing = costRing;
        this.costSms = costSms;
        this.costMobileInternet = costMobileInternet;
        this.mobileInternet = mobileInternet;
    }

    public void setMobileInternet(double mobileInternet) {
        this.mobileInternet = mobileInternet;
    }

    public double getMobileInternet() {
        return mobileInternet;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setCostRing(double costRing) {
        this.costRing = costRing;
    }

    public double getCostRing() {
        return costRing;
    }

    public void setCostSms(double costSms) {
        this.costSms = costSms;
    }

    public double getCostSms() {
        return costSms;
    }

    public void setCostMobileInternet(double costMobileInternet) {
        this.costMobileInternet = costMobileInternet;
    }

    public double getCostMobileInternet() {
        return costMobileInternet;
    }

    public void setYourOperator(String yourOperator) {
        this.yourOperator = yourOperator;
    }

    public String getYourOperator() {
        return yourOperator;
    }

    public void setOtherOperator(String otherOperator) {
        this.otherOperator = otherOperator;
    }

    public String getOtherOperator() {
        return otherOperator;

    }

    public void buyInternet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("how");
    }

    public void toSms() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WRITE STOP TO STOP MESSAGING");

        for (int i = 0; balance >= costSms; i++) {
            String message = scanner.nextLine();
            if (message == "STOP") {
                System.out.println(balance);
                break;
            } else {
                System.out.println(message);
                balance = balance - costSms;
                System.out.println(balance);
            }
            if (balance < costSms) {
                System.out.println("NOT ENOUGH BALANCE");
                break;
            }

        }


    }

    public void toRing() {
        Scanner sc = new Scanner(System.in);
        System.out.println("WHAT TIME DO YOU TALK (MIN) ?");
        int time = sc.nextInt();
        if (balance < balance - (costRing * time)) System.out.println("BALANCE IS TOO LOW");
        else {
            balance = balance - (costRing * time);
            System.out.println("YOUR BALANCE - " + balance);
        }
    }

    public void beelineYourOperator() {
        this.yourOperator = "BEELINE";
        this.costMobileInternet = 30.0;
        System.out.println("COST TO BUY 1 GB INTERNET - " + costMobileInternet );
    }

    public void beelineOtherOperator(int otherOperator) {
        if (otherOperator == 0) {
            this.otherOperator = "MEGACOM";
            this.costSms = 1.7;
            this.costRing = 1.05;
            System.out.println("COST OF SMS - " + costSms + "\n" +
                    "COST TO RING - " + costRing);
        }
        if (otherOperator == 1) {
            this.otherOperator = "BEELINE";
            this.costRing = 0.0;
            this.costSms = 0.0;
            System.out.println("COST OF SMS - " + costSms + "\n" +
                    "COST TO RING - " + costRing);
        }
        if (otherOperator == 2) {
            this.otherOperator = "0!";
            this.costSms = 2.0;
            this.costRing = 0.95;
            System.out.println("COST OF SMS - " + costSms + "\n" +
                    "COST TO RING - " + costRing);
        }
    }


    public void oYourOperator() {
        this.costMobileInternet = 30.0;
        this.yourOperator = "O!";
        System.out.println("COST TO BUY 1 GB INTERNET - " + costMobileInternet );

    }

    public void oOtherOperator(int otherOperator) {
        if (otherOperator == 0) {
            this.otherOperator = "MEGACOM";
            this.costSms = 1.7;
            this.costRing = 1.05;
            System.out.println("COST OF SMS - " + costSms + "\n" +
                    "COST TO RING - " + costRing);
        }
        if (otherOperator == 1) {
            this.otherOperator = "BEELINE";
            this.costRing = 1.0;
            this.costSms = 1.2;
            System.out.println("COST OF SMS - " + costSms + "\n" +
                    "COST TO RING - " + costRing);
        }
        if (otherOperator == 2) {
            this.otherOperator = "0!";
            this.costSms = 0.0;
            this.costRing = 0.0;
            System.out.println("COST OF SMS - " + costSms + "\n" +
                    "COST TO RING - " + costRing);
        }

    }

    public void megacomYourOperator() {
        this.costMobileInternet = 40.0;
        yourOperator = "MEGACOM";
        System.out.println("COST TO BUY 1 GB INTERNET - " + costMobileInternet );

    }

    public void megacomOtherOperator(int otherOperator) {

        if (otherOperator == 0) {
            this.otherOperator = "MEGACOM";
            this.costSms = 0;
            this.costRing = 0;
            System.out.println("COST OF SMS - " + costSms + "\n" +
                    "COST TO RING - " + costRing);
        }
        if (otherOperator == 1) {
            this.otherOperator = "BEELINE";
            this.costRing = 1.0;
            this.costSms = 1.2;
            System.out.println("COST OF SMS - " + costSms + "\n" +
                    "COST TO RING - " + costRing);
        }
        if (otherOperator == 2) {
            this.otherOperator = "0!";
            this.costSms = 2.0;
            this.costRing = 0.95;
            System.out.println("COST OF SMS - " + costSms + "\n" +
                    "COST TO RING - " + costRing);
        }

    }


    @Override
    public String toString() {
        return "YOUR OPERATOR - " + yourOperator + "\n" +
                "YOUR BALANCE - " + balance + " SOM" + "\n";

    }
}
