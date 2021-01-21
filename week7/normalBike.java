package week7;
//632115036 Wanatchaya Kaewwongwan 

public class normalBike extends bicycle{

    public normalBike(int currentSpeed){
        setCurrentSpeed(currentSpeed);
        System.out.println("Normal Bike!");
        if(checkSpeed(getCurrentSpeed())){
            setCurrentSpeed(getCurrentSpeed()-currentSpeed);
        }
    }
    public void speedup(){
        setCurrentSpeed(getCurrentSpeed()+5);
        if(checkSpeed(getCurrentSpeed())){
            setCurrentSpeed(getCurrentSpeed() - 5);
        }
    }
    public void Break(){
        setCurrentSpeed(getCurrentSpeed() - 5);
    }
}
