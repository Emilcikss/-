package EPN;

public class Urok_2_MainigieUnTipi {
public static void main(String[] args) {
	System.out.println("Переменные и типы данных");
	
	int Возраст; // int только целые числа - можно дать значение
	Возраст = 45;
	
	System.out.println("int = "+ Возраст);
	Возраст = 22;
	System.out.println("Новый int = " + Возраст);
	
	// Пример:
	
	System.out.println("\tВаш возраст равен ровно:\n"+Возраст+"\t Поздравляю");
	
	// Byte - от -128 до 127 - для экономии занимает 1 байт
	// short - от -32768 до 32767 - занимает 2 байта
	// int - ( много ) - занимает 4 байта 
	// long - ( еще больше ) - занимает 8 байтов
	
	byte vozrast = 45;
	short prostajametematika = -32745;
	int bolshiedannie = 20000000;
	long pizdecmnogovsego = 12387417284711231l;
	
	// byte age = 128; ухе ошибка и так сразу со всеми переменными
	
	
	float tocka = 4.12341231f; // всегда надо писать в конце f чтобы показать что это число с точкой. 
	double stockoi = 88.9191902; // можно в 2 раза больше поставить чисел после точки. // много занимает
	
	
	char ch = '3'; // Именно создает символ и хранит ток единсвенный символ
	String FIO = "Emils Glotovs 17 годиков"; // Можно ввести от слова одного до больщого параграфа!
	
	boolean TiRadostnij = true; // В целом говорит да или нет
	boolean TIGrustnij = false;
	
	System.out.println("Вывод: \nByte - \t лучшее для возраста переменная: " + vozrast + "\n Short = " + prostajametematika +
	"\n int = " + bolshiedannie + "\n\tИ ПИПЕЕЦ БОЛЬШИЕ ЛЯ НАСА ЧИСЛА LONG = " + pizdecmnogovsego + "\n И щас вы видите \t десятичные с нормальным для всех переменной float = " +
	tocka + "\n + с тем что нас учил Равалд double = " + stockoi + "\n Вот тебе симвов char = " + ch + 
	"и вот тебе текстик с String: \t "+ FIO + " | Счастлив ли ты? " + TiRadostnij + " | Может грустный? " + TIGrustnij);
} 


}
