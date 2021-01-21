package week7;
//632115036 Wanatchaya Kaewwongwan 

public class mountainBike extends bicycle{
    public mountainBike(int currentSpeed){
        setCurrentSpeed(currentSpeed);
        System.out.println("Mountain Bike!");
        if(checkSpeed(getCurrentSpeed())){
            setCurrentSpeed(getCurrentSpeed()-currentSpeed);
        }
    }
    public void speedup(int gear){
        setCurrentSpeed(getCurrentSpeed()+(gear*5));
        if(checkSpeed(getCurrentSpeed())){
            setCurrentSpeed(getCurrentSpeed()-(gear*5));
        }
    }
    public void Break(){
        setCurrentSpeed(getCurrentSpeed() - 5);
    }
}