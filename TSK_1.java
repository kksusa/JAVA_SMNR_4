import java.util.LinkedList;
import java.util.Scanner;

public class TSK_1
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

    static LinkedList<Integer> ArrayReverse(LinkedList<Integer> array)
    {
        for (int i = 0; i < array.size() - 1; i++)
        {
            array.add(array.get(array.size() - 2 - i));
            array.remove(array.size() - 3 - i);
        }
        return array;
    }

    public static void main(String[] args)
    {
        int number = CheckNumbers("Введите число элементов в списке");
        LinkedList<Integer> array = ArrayGen(number);
        System.out.println("Сгенерирован список:");
        System.out.println(array);
        System.out.println("Перевернутый список:");
        System.out.println(ArrayReverse(array));
    }
}