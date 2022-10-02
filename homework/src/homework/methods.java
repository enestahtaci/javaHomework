package homework;

public class methods {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[]{1,2,5,7,9,0};
		int aranacak = 11;
		boolean sayiVar = false;
		
		for(int i=0;i<6;i++) {
			if (sayilar[i] == aranacak) {
				sayiVar = true;
			}
		}
		if(sayiVar == true) {
			mesajVer("Sayı mevcuttur: " + aranacak);			
		}
		else {
			mesajVer("Sayı mevcut değildir: " + aranacak);		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
		
	}
	
}
