package reus_act4;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 1, B = 2, C = 3, D = 4;

		System.out.println("valores iniciales= A: "+ A +" B: " +B+" C: "+ C +" D: "+D);
		
		B = C;
		C = A;
		A = D;
		D = B;
		
		System.out.println("valores cambiados= A: "+ A +" B: " +B+" C: "+ C +" D: "+D);
		
	}

}
