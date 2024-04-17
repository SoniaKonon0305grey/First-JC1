package by.les2.server;

class Cub02 {

	public static void main(String[] args) {
		int reb = 8;
		int sgr;
		int spov ;
		int v  ;
		
		v =(int) Math.pow(reb, 3) ;
		sgr = (int) Math.pow(reb, 2);
		spov = (int) (6*Math.pow(reb, 2));
		System.out.println("Ploshad cuba = " + sgr);
		System.out.println("Plpshad poverhnosty = " + spov);
		System.out.println("Obyem cuba = " + v);
	}

}
