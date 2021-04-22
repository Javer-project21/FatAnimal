package fatAnimal;
//주소값을 알면 그 객체의 모든 것을 활용할 수 있다. 
import java.util.Scanner;

public class fatAnimalMain {

	public static void main(String[] args) {
		Animal apple = new Apple();
		Animal joonie = new Joonie();
		Animal cutie = new Cutie();
		
		Animal[] animals = {apple, joonie, cutie};
		
		Animal fatAni = null;
		
		/*
		String[] fatApple = {apple.eating(), apple.sleeping(), apple.pooping(), apple.aHobby(), apple.doHobby()};
		String[] fatJoonie = {joonie.eating(), apple.sleeping(), apple.pooping(), apple.aHobby(), apple.doHobby()};
		String[] fatCutie = {apple.eating(), apple.sleeping(), apple.pooping(), apple.aHobby(), apple.doHobby()};
		*/
		
		PrintScript scripts = new PrintScript();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(scripts.start);
		
		for(int i=0; i<animals.length; i++) {
			System.out.printf("%d. %s\n", (i+1), animals[i]);
		}
		
		System.out.print("선택 > ");
		
		int choice = scan.nextInt();
		
		for(int i=0; i<animals.length; i++) {
			if ((i+1)==choice) {
				System.out.println(scripts.hello(animals[i].getaName()));
				fatAni = animals[i];
			} 
		}
		
		int noHobby = 0;
		while (fatAni.getaFat() < 10) {
			Scanner scan2 = new Scanner(System.in);
			System.out.print("선택 > ");
			
			int choice2 = scan2.nextInt();
			switch(choice2) {
			case 1 : System.out.println(fatAni.eating()); noHobby++; break;
			case 2 : System.out.println(fatAni.sleeping()); break;
			case 3 : System.out.println(fatAni.pooping()); break;
			case 4 : System.out.println(fatAni.hobby()); noHobby = 0; break;
			}
			
			if (noHobby == 3) {
				fatAni.doHobby();
				noHobby = 0;
			}
		}
		
		System.out.printf(" <알림> %s 살찌우기 성공! \n  <알림> 게임종료.", fatAni.getaName());
	}

}
