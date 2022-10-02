package homework;

public class sesliHarfler {

	public static void main(String[] args) {
		char harf = 'E';
		
		switch(harf){
		case 'A':
		case 'I':
		case 'U':
		case 'O':
			System.out.println("Kalın Sesli Harf");
			break;
			default:
				System.out.println("İnce Sesli Harf");
		}
		
	}

}
