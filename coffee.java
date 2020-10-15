public class coffee {
	public static void main(String[] args){
		int passcode = 629;
		String coffeeType;
		switch (passcode){
			case 555: coffeeType ="Espresso";
			break;
			case 312: coffeeType ="Vanilla Coffee";
			break;
			case 629: coffeeType ="Drip Coffee";
			break;
			default : coffeeType ="Unknown";
			break;
		}
		System.out.println(coffeeType);
	}
}