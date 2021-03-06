package by.mikem.jonline.module4.simpleclass.task06;

/* Составьте описание класса для представления времени. Предусмотрте возможности установки времени
 * и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
 * В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения
 * времени на заданное количество часов, минут и секунд.
*/

public class Main6 {//для тестирования класса Time

	public static void main(String[] args) {
		Time time = new Time(52, 65, 63);
		
		TimeLogic timeLogic = new TimeLogic();				
		
		timeLogic.increaseTime(time, 12, 2, 8);		

		System.out.println(time.toString());
		
		timeLogic.decreaseTime(time, 12, 2, 8);	
		
		System.out.println(time.toString());		
	}
}
