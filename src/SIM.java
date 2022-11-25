import java.util.Objects;
import java.util.Scanner;

public class SIM {
    private int balance = 0;
    private int costRing;
    private int costSms;
    private int costMobileInternet;
    private int mobileInternet;
    private String yourOperator;
    private String otherOperator;
    private int count;

    public SIM() {
    }

    public SIM(int costMobileInternet, int balance, int costRing, int costSms, int mobileInternet, String yourOperator, String otherOperator) {
        this.yourOperator = yourOperator;
        this.otherOperator = otherOperator;
        this.balance = balance;
        this.costRing = costRing;
        this.costSms = costSms;
        this.costMobileInternet = costMobileInternet;
        this.mobileInternet = mobileInternet;
    }

    public void setMobileInternet(int mobileInternet) {
        this.mobileInternet = mobileInternet;
    }

    public int getCount() {
        return count;
    }

    public double getMobileInternet() {
        return mobileInternet;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setCostRing(int costRing) {
        this.costRing = costRing;
    }

    public double getCostRing() {
        return costRing;
    }

    public void setCostSms(int costSms) {
        this.costSms = costSms;
    }

    public double getCostSms() {
        return costSms;
    }

    public void setCostMobileInternet(int costMobileInternet) {
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

    public void addBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("HOW MANY BALANCE YOU WANT TO ADD?");
        int balance = sc.nextInt();
        this.balance = balance + this.balance;
    }

    public void buyInternet() {
        if (balance == 0) System.out.println("YOUR BALANCE IS 0 ERROR");
        else {
            Scanner sc = new Scanner(System.in);
            System.out.println("HOW MANY GB YOU WANT TO BUY?");
            int buyGb = sc.nextInt();
            if (balance - (costMobileInternet * buyGb) < 0)
                System.out.println("NOT ENOUGH BALANCE");
            else balance = balance - (costMobileInternet * buyGb);
        }
    }

    public void toSms() {
        if (balance == 0) System.out.println("YOUR BALANCE IS 0 ERROR");
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("WRITE STOP TO STOP MESSAGING");

            for (int i = 0; balance >= costSms; i++) {
                String message = scanner.nextLine();
                if (Objects.equals(message, "STOP")) {
                    break;
                } else if (balance < costSms) {
                    System.out.println("NOT ENOUGH BALANCE");
                    break;
                } else {
                    System.out.println(message);
                    balance = balance - costSms;
                }


            }
        }


    }

    public void toRing() {
        if (this.balance == 0) System.out.println("YOUR BALANCE IS 0 ERROR");
        else {
            Scanner sc = new Scanner(System.in);
            System.out.println("WHAT TIME DO YOU TALK (MIN) ?");
            int time = sc.nextInt();
            if (0 > this.balance - (costRing * time)) System.out.println("BALANCE IS TOO LOW");
            else {
                this.balance = this.balance - (costRing * time);
            }
        }
    }

    public void beelineYourOperator() {
        this.yourOperator = "BEELINE";
        this.costMobileInternet = 30;
        count = 1;
    }

    public void beelineOtherOperator(int otherOperator) {
        if (otherOperator == 0) {
            this.otherOperator = "MEGACOM";
            this.costSms = 2;
            this.costRing = 1;
            System.out.println("COST OF SMS - " + costSms + "\n" +
                    "COST TO RING - " + costRing);
        }
        if (otherOperator == 1) {
            this.otherOperator = "BEELINE";
            this.costRing = 0;
            this.costSms = 0;
            System.out.println("COST OF SMS - " + costSms + "\n" +
                    "COST TO RING - " + costRing);
        }
        if (otherOperator == 2) {
            this.otherOperator = "0!";
            this.costSms = 2;
            this.costRing = 1;
            System.out.println("COST OF SMS - " + costSms + "\n" +
                    "COST TO RING - " + costRing);
        }
    }


    public void oYourOperator() {
        this.costMobileInternet = 30;
        this.yourOperator = "O!";
        count = 2;

    }

    public void oOtherOperator(int otherOperator) {
        if (otherOperator == 0) {
            this.otherOperator = "MEGACOM";
            this.costSms = 2;
            this.costRing = 1;
            System.out.println("COST OF SMS - " + costSms + "\n" +
                    "COST TO RING - " + costRing);
        }
        if (otherOperator == 1) {
            this.otherOperator = "BEELINE";
            this.costRing = 1;
            this.costSms = 1;
            System.out.println("COST OF SMS - " + costSms + "\n" +
                    "COST TO RING - " + costRing);
        }
        if (otherOperator == 2) {
            this.otherOperator = "0!";
            this.costSms = 0;
            this.costRing = 0;
            System.out.println("COST OF SMS - " + costSms + "\n" +
                    "COST TO RING - " + costRing);
        }

    }

    public void megacomYourOperator() {
        this.costMobileInternet = 40;
        yourOperator = "MEGACOM";
        count = 1;

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
            this.costRing = 1;
            this.costSms = 1;
            System.out.println("COST OF SMS - " + costSms + "\n" +
                    "COST TO RING - " + costRing);
        }
        if (otherOperator == 2) {
            this.otherOperator = "0!";
            this.costSms = 2;
            this.costRing = 1;
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
