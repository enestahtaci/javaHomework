package homework;

public class mukemmelSayi {

	public static void main(String[] args) {
		int number = 27;
		int total = 0;
		for(int i=1;i<number;i++) {
			if(number % i == 0) {
				total= total + i;
			}
		}
		if(total == number) {
			System.out.println("mükemmel sayi");
		}
		else {
			System.out.println("mükemmel sayi degil");
		}
	}

}
