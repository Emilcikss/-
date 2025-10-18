package EPN;

public class Urok_4_IfElse {

	public static void main(String[] args) {
		// Условные конструкци if-else
		int a = 26, b = 25;
	
		/*
		if (a > b) {
			System.out.println("А больше чем Б");
		}
		
		if (a < b) {
			System.out.println("А меньше чем Б");
		}
		
		if (a == b) { // равенство пишится через 2x =, потому что если написать 1 то получится что я присваиваю числу а какое то значение
			System.out.println("А равен Б");
			}
		
	    if (a != b) { // Если переменная а не ровна переменной b то тогда все заработает
			System.out.println("Переменная А не ровна Переменной Б");
		}
	    
		if (a >= b) {
			System.out.println("А больше или равно Б");
		}
		
		if (a <= b) {
			System.out.println("А меньше или равно Б");
		}
	
		*/
		
		char symb1 = 'A', symb2 = 'a';
		boolean EtoMasina = false;
		if (symb1 != symb2) {
			System.out.println("Символы не равны!");
		}
		if (EtoMasina) { // если записать в таком виде то в любом случае идет проверка на true ( EtoMasina == true )
			// и если надо false то тогда впереди ставим восклецательный знак. ( !EtoMasina )
			// ЕСЛИ Я ВВЕДУ EtoMasina = true то тогда остальные будут проигнорированны
			System.out.println("Да, верно");
		} else if(a >= b) { // Просто дополнительное условие. Тоесть если 1 if оказался не верным то тогда он переходит ко 2 проверке
			// else if(), и после если даже она не верна то тогда к else
			System.out.println("Тест 2.");
		} else 
			System.out.println("Нет, неверно");
		
		
	if (EtoMasina || a == b) { // || - или , && - и ( если хоть 1 переменная будет не правильная в проверке то тогда не сработает ничего )

	}
	}
}

