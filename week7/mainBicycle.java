package week7;
//632115036 Wanatchaya Kaewwongwan 

public class mainBicycle {
    public static void main(String[] args) {
        normalBike nb = new normalBike(10);
        nb.speedup();
        nb.Break();
        nb.speedup();
        nb.displaySpeed();
        mountainBike mb = new mountainBike(10);
        mb.speedup(2);
        mb.Break();
        mb.displaySpeed();
        mb.speedup(3);
        mb.displaySpeed();
        mb.speedup(4);
        mb.displaySpeed();
    }
}
