import java.util.Scanner;
public class sayiBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double[] sayilar=new double[] {1, 2, 3, 4, 9, 9.1};
		System.out.print("Bir sayi giriniz : ");
		double sayi=input.nextDouble();
		boolean sayiVarMi=false;

		for (int i=0; i<sayilar.length; i++) {
			if (sayilar[i]==sayi) {	
				sayiVarMi=true;
			}
		}
		if (sayiVarMi) {
			System.out.println(sayi+" dizinin icinde mevcut.");
		}
		else {
			System.out.println(sayi+" sayisi dizinin icinde mevcut degil..");
		}

	}

}
