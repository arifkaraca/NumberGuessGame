package Package;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		
		int guess, heart = 5, i = 0;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int num = rand.nextInt(100);
		//System.out.println(num);
		boolean gameSituation = false, mistake = false;
		int[] gues = new int[5];
		System.out.println("Sayı Tahmin Oyununa Hoşgeldiniz !");
		System.out.println("0 - 99 arasında bir sayı tuttum ?");
		while(heart > 0) {
			System.out.print("Tahmininiz : ");
			guess = scan.nextInt();
			
			if((guess < 0) || (guess > 100)) {
				if(mistake) {
					System.out.println("Çok Fazla Hatalı Giriş Yaptınız 1 Can Kaybettiniz.");
					System.out.println("Kalan Can : " + --heart);
				}else {
					mistake=true;
					System.out.println("Lütfen 0-99 arası bi sayı giriniz .");
				}
				continue;
			}
			gues[i++] = guess;
			if(guess == num) {
				gameSituation = true;
				break;
			}else {
				System.out.println("Yanlış Tahmin !! TEKRAR DENEYİNİZ. Kalan Can : " + --heart);
			}
		}
		if(gameSituation) {
			System.out.println("Tebrikler Doğru Tahmin");
			System.out.println("Tuttuğum Sayı : " + num);
			System.out.println("Kalan Can : " + heart);
		}else {
			System.out.println("Başaramadınız !");
			System.out.println("Tuttuğum Sayı : " + num);
		}
		System.out.print("Tahminleriniz : ");
		for(int value : gues) {
				if(value != 0)
			System.out.print(value + " ,");
		}
	}

}
