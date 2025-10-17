package EPN;

import java.util.Scanner;


public class Urok_3_DatiNoLietotaja_MatUzd {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// Ввод данных и взоимодействие
	System.out.print("Введите ваше имя:");
	String Username = scan.nextLine(); // ждет данные от пользователя ( ввод как строку_) scan.nextLine();
	System.out.println("Здарова " + Username + " !");
 
	
	System.out.println("Введите свой возраст:");
	int vozrast = scan.nextInt(); // для получения числа
	System.out.println("Ваш возраст: " + vozrast);
	
	// Чтобы ввести byte надо сделать это
	System.out.println("Введите возраст до 127 лет: ");
	byte vozrastbyte = scan.nextByte(); // для получения byte
	
	System.out.println("У вас настроение хорошее? ");
	boolean b = scan.nextBoolean();
	
	// для каждой переменной есть свой Next
	
	}

}
