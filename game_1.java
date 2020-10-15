public class game_1{
	public static void main (String[] args){
		boolean canSeePlayer = true;
		boolean playerPowerUp = false;
		if (canSeePlayer){
			if (!playerPowerUp){
				System.out.println("Attack");
			} else {
				System.out.println("Run Away");
			}
		}
		else{
			System.out.println("Wander.");
		}
	}
}