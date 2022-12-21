import java.util.LinkedList;
import java.util.Scanner;

class Queue
{	
	static int dequeue(LinkedList<Integer> array)
	{
		int element = array.getFirst();
		array.removeFirst();
		return element;
	}

	static LinkedList<Integer> enqueue(LinkedList<Integer> array)
	{
		array.addLast((int)(Math.random() * 100));
		return array;
	}	

	static int first(LinkedList<Integer> array)
	{
		int element = array.getFirst();
		return element;
	}
}
public class TSK_2
{
	static int CheckNumbers(String param)
    {
        Scanner iScanner = new Scanner(System.in);
        while (true)
        {
            System.out.printf(param + ": ");
            if (iScanner.hasNextInt() == true)
            {
                int number = iScanner.nextInt();
                if (number > 0)
                {
                    iScanner.close();
                    return number;
                }
                else System.out.println("Число введено неправильно.");
            }
            else System.out.println("Число введено неправильно.");
            iScanner.next();
        }
    }

	static LinkedList<Integer> ArrayGen(int number)
    {
        LinkedList<Integer> array = new LinkedList<Integer>();
        for (int i = 0; i < number; i++)
        {
            array.add((int)(Math.random() * 100));
        }
        return array;
    }
	public static void main (String[] args)
	{
		int number = CheckNumbers("Введите число элементов в списке");
		LinkedList<Integer> q = ArrayGen(number);
		System.out.println("Сгенерирована очередь:");
		System.out.println(q);
		q = Queue.enqueue(q);
		int last = q.getLast();
		System.out.printf("В очередь добавлен элемент %d.\n", last);
		System.out.println("Очередь после изменения:");
		System.out.println(q);
		int param1 = Queue.dequeue(q);
		System.out.printf("Первый элемент очереди %d удалён.\n", param1);
		System.out.println("Очередь после удаления:");
		System.out.println(q);
		int param2 = Queue.first(q);
		System.out.println("Первый элемент очереди: " + param2);
	}
}