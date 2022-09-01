import java.util.Scanner;

public class Game {
	
	DatabaseRepositries dataRepo = new DatabaseRepositries();
	DatabaseRepositoriesDisplay dataRepoDis=new DatabaseRepositoriesDisplay();
	
	
	public void executeGame() {
		String PlayerNumber = null;
		String Player = null;
		String weapon = null;
		boolean armour=false;
	    int health;
		String choice;
		String ch;
		Scanner sc=new Scanner( System.in);
		System.out.println("Are you Player1 or Player2 press yes  or no accordingly");
		choice=sc.nextLine();
		
		if (choice.equalsIgnoreCase("yes" )){
			System.out.println("You have entered yes.That  means you are player1") ;

						System.out.println("Enter name of Player1:");
						PlayerNumber= "Player1";
						Player = sc.nextLine();
						System.out.println("Enter your weapon:");
						 weapon=sc.nextLine( );
			}
			else if( choice.equalsIgnoreCase("no")){
			System.out.println("You have entered no.That means you are player2");
						System.out.println("Enter name of Player2:");
						PlayerNumber= "Player2";
						Player =sc.nextLine();
						System.out.println("Enter your weapon:");
						 weapon=sc.nextLine( );
	
			}
			else{

			System.out.print("You can't continue the game further,unless you enter the right choice");
			Player =null;
			System.out.println("Are you Player1 or Player2 press yes  or no accordingly");
			choice=sc.nextLine();
			if(choice.equalsIgnoreCase("yes")) {
				System.out.println("Enter name of Player1:");
				PlayerNumber= "Player1";
				Player =sc.nextLine();
			}else {
				System.out.println("Enter name of Player2:");
				PlayerNumber= "Player2";
				Player =sc.nextLine();
			}
			System.out.println("Enter your weapon:");
			 weapon=sc.nextLine( );
			}
		if(Player != null) {
			System.out.println("Do you want an armour?");
			ch=sc.nextLine();
			 switch(ch){
				case "yes": 
					armour=true;
					System.out.println("You have selected armour ") ;
					break;
					
				case "no":
					armour=false;
					System.out.println("That means you don't want an armour");	
					break;
			}
			
			System.out.println("Enter your health status:");
			health=sc.nextInt( );
			Player player=new Player(Player,PlayerNumber, weapon, health,armour); 
			 player.damageByGun();
			// player.damageByGun();
			 player.heal( );
			dataRepo.addPlayer( 1,"Dean","Sword","yes", 76);
			 //dataRepoDis.addPlayer2(2,"John","Sword","no", 80);
			 dataRepo.showData();
	}
	}

}
