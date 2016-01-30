package beispiel2_winterreifen;

public class WinterreifenpflichtDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(isWinterreifenPflicht(3, true) == true){
			System.out.println("Bitte Winterreifen verwenden");
		}
		else System.out.println("Winterreifen sind nicht erforderlich");
		
		if(isWinterreifenPflicht(9, true) == true){
			System.out.println("Bitte Winterreifen verwenden");
		}
		else System.out.println("Winterreifen sind nicht erforderlich");
		
		if(isWinterreifenPflicht(9, false) == true){
			System.out.println("Bitte Winterreifen verwenden");
		}
		else System.out.println("Winterreifen sind nicht erforderlich");
		}
	
	public static boolean isWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn){
		if(temperatur < 4){
			return true;
		}
		else if(temperatur < 10 && rutschigeFahrbahn == true ){
			return true;
		}
		else return false;
		
	}

}
