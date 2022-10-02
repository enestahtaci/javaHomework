package homework;

public class sayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[]{1,2,5,7,9,0};
		int aranacak = 11;
		boolean sayiVar = false;
		
		for(int i=0;i<6;i++) {
			if (sayilar[i] == aranacak) {
				sayiVar = true;
			}
		}
		if(sayiVar == true) {
			System.out.println("Sayı mevcuttur");			
		}
		else {
			System.out.println("Sayı mevcut değildir");
		}
	}

}
