

public class Main {
    public static void main(String[] args) {
        Bread bread = new Bread(15, 14.5);
        RoundBread roundBread = new RoundBread(20, 20.3, 14.2);
        Bagette bagette = new Bagette(25, 26.7, 1.2, 7);
        System.out.println(bread + bread.packing(true) + roundBread + roundBread.packing(true) + roundBread.paint(true) + bagette + bagette.makeCuts() + bagette.packing(false));


    }

}

