package EPN;

import java.util.Scanner;

public class Urok_3_Programma {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
short num1 = 50, num2 = 23;
int res = num1 + num2;
System.out.println("Rezultats: " + res);

/* Если использовать щас деление / то тогда получится что будет выводится целое число из деления, поэтому надо 
* бует просто использовать float или же double
*/

float num = 22.64f, numm = 4.52f;
float ress = num / numm;
ress -= 2.4f;
// ress *= 2; ress += 2; ress -= 22; ress /= 2;  это работа с тем же числом что вышло просто ты добавляешь или умножаешь к уже имеющемся числу то что желаешь

// тоесть к примеру мне надр добавить 1 к res я могу сделать это сокращенно res += 1 либо res++ / res--

// Чтобы найти остаток при делении нам надо использовать как раз % 

float resp = num1 % num2;
System.out.println("Atlikums: " + resp);

res += 20;


	}

	
	
}
