
public class Player {
	private String  PlayerName;
	private  String weapon;
	private String PlayerNumber;
	private String GunNumber;
	private boolean armour;
	private Integer health;
	 Player(String PlayerName, String PlayerNumber, String weapon, Integer health,boolean armour){
		 this.PlayerName=PlayerName;
		 this.PlayerNumber = PlayerNumber;
		 this.weapon=weapon;
		 this.health=health; 
		 this.armour=armour;
	 }

		public void damageByGun() {
			if(PlayerNumber.equalsIgnoreCase("Player1" ) && !armour) {
				health-=30;
				if(health > 0) 
					System.out.println("Got hit by gun.Health is reduced by 30.New health is"+health);
			}else if(PlayerNumber.equalsIgnoreCase("Player1" ) && armour) {
					 health-=20;
					 if (health>0) 
					 System.out.println("Armour is on.Got hit by gun.Health is reduced by 20"+".New Health is "+health);
				}else if (health<0) {
					 
						 System.out.println("You are dead, game over");
				}
			if(PlayerNumber.equalsIgnoreCase("Player2" ) && !armour) {
				health-=50;
				if(health > 0) 
					System.out.println("Got hit by gun.Health is reduced by 50.New health is"+health);
			}else if(PlayerNumber.equalsIgnoreCase("Player2" ) && armour) {
					 health-=40;
					 if (health>0) 
					 System.out.println("Armour is on.Got hit by gun.Health is reduced by 40"+".New Health is "+health);
				}else if (health<0){
					 
						 System.out.println("You are dead, game over");
			}
		}
		
	

	 public void heal( ){
		 if(health>0) {
			System.out.println("Player is  not dead . Healing is  possible ");
		 }else {
				System.out.println("Healing is not possible");
			}

	}
}


