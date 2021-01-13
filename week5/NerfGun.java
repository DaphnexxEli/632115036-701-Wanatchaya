package week5;

// 632115036 Wanatchaya Kaewwongwan

public class NerfGun {
	
	private int ammunition;
	private int GunID;
	

	public NerfGun(){
		ammunition = 0;
		GunID++;
		
	}

	public NerfGun (int bullet) {
		this.ammunition = bullet;
		GunID++;
		
	}

	public void fire() {
        if (ammunition > 0){
			System.out.println("BANG !!!");
			ammunition--;
		}
		else
		System.out.println("There is no ammunition");
		
	}

	public void reload(int bullet) {
		if (ammunition + bullet <= 15)
			ammunition += bullet;
		else
			System.out.println("Error!! the ammunition is overload");
	}

	public void displayNumOfAmmunition() {
		System.out.println(ammunition + " bullet left");
	}

	public void displayGunID() {
		System.out.println("The ID of this gun is " + GunID);
	}

}
