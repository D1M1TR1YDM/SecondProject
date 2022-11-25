import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        process();


    }

    public static int chooseSim() {
        Scanner sc = new Scanner(System.in);
        int num = 2;
        for (int i = 1; i > 0; i++) {
            System.out.println("CHOSSE YOUR SIM 1 FOR FIRST 2 FOR SECOND");
            int choise = sc.nextInt();
            if (choise == 1) {
                num = 0;
                break;
            }
            if (choise == 2) {
                num = 1;
                break;
            } else System.out.println("WRONG NUMBER");
        }
        return num;
    }

    public static SIM[] setSimCards() {
        SIM[] simCards = new SIM[2];
        int[] iSimCards = new int[2];
        SIM beeline = new SIM();
        beeline.beelineYourOperator();
        SIM megacom = new SIM();
        megacom.megacomYourOperator();
        SIM o = new SIM();
        o.oYourOperator();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i > 0; i++) {
            System.out.println("CHOOSE YOUR FIRST SIM  0 FOR MEGACOM 1 FOR BEELINE 2 FOR O!");
            iSimCards[0] = sc.nextInt();
            if (iSimCards[0] >= 0 && iSimCards[0] <= 2) {
                if (iSimCards[0] == 0) simCards[0] = megacom;
                else if (iSimCards[0] == 1) simCards[0] = beeline;
                else   simCards[0] = o;
                System.out.println(simCards[0]);
                break;
            } else System.out.println("ERROR WRONG NUMBER");
        }
        for (int i = 1; i > 0; i++) {
            System.out.println("CHOOSE YOUR SECOND SIM  0 FOR MEGACOM 1 FOR BEELINE 2 FOR O!");
            iSimCards[1] = sc.nextInt();
            if (iSimCards[1] >= 0 && iSimCards[1] <= 2) {
                if (iSimCards[1] == 0) simCards[1] = megacom;
                else if (iSimCards[1] == 1) simCards[1] = beeline;
                else  simCards[1] = o;
                System.out.println(simCards[1]);
                break;
            } else System.out.println("ERROR WRONG NUMBER");
        }


        return simCards;

    }

    public static int checkNumber() {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        for (int i = 1; i > 0; i++) {
            for (int J = 1; J > 0; J++) {
                System.out.println("WRITE PARTNER NUMBER");
                int partnerNumber = sc.nextInt();
                if (partnerNumber > 999999999 || partnerNumber < 100000000)
                    System.out.println("error");
                else {
                    number = partnerNumber;
                    break;
                }
            }
            number = number / 1000000;
            if (number == 999 || number == 755 || number == 555) {
                number = 0;
                break;
            } else if (number == 771 || number == 225 || number == 220) {
                number = 1;
                break;
            } else if (number == 500 || number == 705) {
                number = 2;
                break;
            } else {
                System.out.println("NOT REAL NUMBER");
            }
        }
        return number;
    }

    public static void process() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        SIM[] simCards = new SIM[2];
        int count = 0;
        for (int i = 1; i > 0; i++) {
            System.out.println("YOUR ACTION:" + "\n" + " 0 TO STOP" + "\n" + "1 TO PHONE" + "\n" + "2  TO SMS" + "\n" + "3 TO ADD BALANCE" + "\n" + "4 TO CHOOSE SIM" + "\n" + "5 TO SET SIM" + "\n" + "6 WRITE PARTNER NUMBER" + "\n" + "7 TO BUY INTERNET");
            int choise = sc.nextInt();
            if (choise == 0) break;
            else if (choise == 5) {
                choise= 0;
                simCards = setSimCards();
                count++;
            } else if (choise == 4 && count >= 1) {
                choise = 1;
                num = chooseSim();
                System.out.println(simCards[0]);
                count++;
            } else if (choise == 6 && count >= 2) {
                int a = checkNumber();
                if (simCards[num].getCount() == 0) simCards[0].megacomOtherOperator(a);
                if (simCards[num].getCount() == 1) simCards[0].beelineOtherOperator(a);
                if (simCards[num].getCount() == 2) simCards[0].oOtherOperator(a);
                count++;
            } else if (choise == 1 && count >= 3) {
                simCards[num].toRing();
                System.out.println(simCards[num]);
            } else if (choise == 2 && count >= 3) {
                simCards[num].toSms();
                System.out.println(simCards[num]);
            } else if (choise == 7 && count >= 2) {
                simCards[num].buyInternet();
                System.out.println(simCards[num]);
            } else if (choise == 3 && count >= 2) {
                simCards[num].addBalance();
                System.out.println(simCards[num]);
            } else if (choise == 4 && count <= 0) System.out.println("ERROR YOU MUST SET SIMCARDS FIRST");
            else if ((choise == 3 || choise == 7) && count <= 1)
                System.out.println("ERROR YOU MUSE SET AND CHOOSE YOUR SIM FIRST");
            else if ((choise == 1 || choise == 2 || choise == 6) && count <= 2)
                System.out.println("ERROR YOU MUSE SET AND CHOOSE YOUR SIM FIRST AND PARTNER NUMBER ");

        }


    }
}

