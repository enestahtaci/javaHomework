package homework;

public class methods2 {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int  sayi = topla(15,7);
		System.out.println(sayi);
		int sayi2 = topla2(2,5,6,5,4,2,2,345,67,6,4,43);
		System.out.println(sayi2);
	}
	
	 public static void ekle() {
		 System.out.println("Eklendi");
	 }
	 
	 public static void sil() {
		 System.out.println("Silindi");
		 }	 
	 public static void güncelle() {
		 System.out.println("Güncellendi");
		 }
	 public static int topla(int sayi1,int sayi2) {
		 return sayi1+sayi2;
		 }
	 public static int topla2(int...sayilar) {
		 int toplam = 0;
		 for(int sayi:sayilar) {
			 toplam+=sayi;
		 }
		 return toplam;
	 }

	 public static String sehirVer() {
		 return "Ankara";
		 }
}
