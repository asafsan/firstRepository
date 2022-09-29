package exercise;

public class Main {

	public static void main(String[] args) {
		int[] sayılar=new int[] {1,2,3,5,6,};
		int aranacak=11;
		
		boolean varMı=sayıBul(sayılar,aranacak);
		mesajVer(varMı,aranacak);
	}
		
		
	public static void mesajVer(boolean varMı,int aranacak) {
		String mesaj="";
		if (varMı==true) {
			mesaj="Sayı mevcuttur: "+aranacak;
			System.out.println(mesaj);
		}
		else {
			mesaj="Sayı mevcut değildir : "+aranacak;
			System.out.println(mesaj);
			}
	}
	public static boolean sayıBul(int[] sayılar,int aranacak) {
		boolean varMı=false;
		for(int sayı:sayılar) {
			if(sayı==aranacak) {
				varMı=true;
				break; 
			}
		}
		return varMı;

	}

	}


