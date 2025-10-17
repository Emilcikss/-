package EPN;
import java.util.Scanner;
public class Urok_3_Kalkulators {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		System.out.println("Здравствуйте! Я ваш калькулятор, прошу вас рассказать какое у вас имя? \n");
		String имя = scan.nextLine();
		
		System.out.println("Охх.. \t Здравствуй " + имя + "! А сколько вам лет? \n ");
		byte возраст = scan.nextByte();
		
		System.out.println("Вы уверены что вам " + возраст + "? ( напишите true или false - значения не имеет пока что) \n");
		boolean proverka = scan.nextBoolean();
		
		System.out.println("Вы выбрали: " + proverka);
		
		System.out.println("\n Замечательно " + имя + " Начнем работу, но заранее предупрежу что ввод чисел будет работать только 1 раз \n "
				+ "после придется запускать и вводить все по новой! \n");
		
		System.out.println("Введите 1 число которое хотите сложить/вычесть/умножить и разделить, а также получить остаток. \n");
		float num1 = scan.nextShort();
		System.out.println("Введите 2 число на которое вы будете складывать/вычетать/умножать и делить. \n");
		float num2 = scan.nextShort();
		
		float plus = num1 + num2;
		float minus = num1 - num2;
		float umnozit = num1 * num2;
		float delit = num1 / num2;
		float ostatok = num1 % num2;
		
		System.out.println("Выбранные вами числа " + num1 + " и " + num2 + " были успешно: \n"
				+ " \n сложенны," 
				+ " \n вычты," 
				+ " \n умноженны,"
				+ " \n поделенны,"
				+ " \n и выведен остаток.\n"
				+ " \n \t Результаты: \n++++++++++++++++++++++++++++++++++\n" 
				+ num1 + " + " + num2 + " = " + plus + "\n"
				+ num1 + " - " + num2 + " = " + minus + "\n"
				+ num1 + " * " + num2 + " = " + umnozit + "\n"
				+ num1 + " / " + num2 + " = " + delit + "\n"
				+ num1 + " % " + num2 + " = " + ostatok + "\n++++++++++++++++++++++++++++++++++");
		
	    System.out.println("\n Спасибо вам за мое использование " + имя + ", " + возраст + "-летний ДЕБИЛ");
	} 

}
