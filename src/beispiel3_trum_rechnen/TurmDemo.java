package beispiel3_trum_rechnen;

public class TurmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 2;
		int y = 2;
		while(x<=9){
			System.out.println(y+"*"+x+"="+y*x);
			y=y*x;
			x++;
		}
		x=2;
		while(x<=9){
			System.out.println(y+"/"+x+"="+y/x);
			y=y/x;
			x++;
		}
	}

}
