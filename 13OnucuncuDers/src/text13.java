import java.util.Iterator;
import java.util.Scanner;

public class text13 {

	public static void main(String[] args) {
//------------------ASAL SAYILARI BULMA UYGULAMASI-----------------------
	Scanner scanner = new Scanner(System.in);
	boolean asalMi = false;
	System.out.println("Dizinin boyutunu giriniz:");
	int diziBoyut = scanner.nextInt();
	scanner.nextLine();
	
	String asalSayilar = "";
	int asalSayilarToplam = 0;
	
	String asalOlmayanSayilar = "";
	int asalOlmayanSayilarToplam = 0;
	
	int [] sayilar = new int[diziBoyut];
	
	for(int i = 0 ; i< diziBoyut; i++) {
		
		
		System.out.println(i + " Ýndexli sayýyý giriniz:");
		sayilar[i] = scanner.nextInt();
		scanner.nextLine();
		
	}
	for (int sayi : sayilar) {
		
		for(int j=2;j<sayi;j++) {
			
			if (sayi%j==0) {
				asalOlmayanSayilarToplam +=1;
				asalOlmayanSayilar += String.valueOf(sayi) +",";
				break;
				
			}
			else {
				asalMi = true;
				}
			
		}
		if (sayi == 1) {
			asalOlmayanSayilarToplam +=1;
			asalOlmayanSayilar += String.valueOf(sayi) +",";
		}
		if (sayi==2) {
			asalMi= true;
		}
		
		if (asalMi) {
			asalSayilarToplam+=1;
			asalSayilar += String.valueOf(sayi) + ",";
			asalMi = false;
		}
		
	}
	System.out.println("ASAL SAYI BÝLGÝLERÝ");
	System.out.println("**********************");
	System.out.println("TOPLAM ASAL SAYI:"+ asalSayilarToplam + " ASAL SAYILAR:" + asalSayilar);
	System.out.println("----------------------------------------------------------------------------");
	System.out.println("ASAL OLMAYAN SAYI BÝLGÝLERÝ");
	System.out.println("**********************");
	System.out.println("TOPLAM ASAL OLMAYAN SAYI:"+ asalOlmayanSayilarToplam + " ASAL OLMAYAN SAYILAR:" + asalOlmayanSayilar);
	
	
	
	
	}

}
