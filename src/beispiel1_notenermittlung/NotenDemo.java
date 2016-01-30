package beispiel1_notenermittlung;

public class NotenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Deine Note lautet: "+getNotentext(60));
		System.out.println("");
		System.out.println("Deine Note lautet: "+getNotentext(100));
		System.out.println("");
		System.out.println("Deine Note lautet: "+getNotentext(110));
		
	}
	
	public static String getNotentext(int punkte){
		String note = "";
		if(punkte <= 50){
			note = "ungenügend";
		}
		else if(punkte > 50 && punkte <65){
			note = "genügend";
		}
		else if(punkte > 64 && punkte < 78){
			note = "befriedigend";
		}
		else if(punkte > 77 && punkte < 90){
			note = "gut";
		}
		else if(punkte >= 90 && punkte < 101){
			note = "sehr gut";
		}
		else note = "Mehr als 100 Punkte sind nicht möglich";
		
		return note;
		
	}

}
