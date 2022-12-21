import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;
import java.util.Arrays;

public class TSK_3
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

    static Stack<Integer> StackAdd(int [] array)
    {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++)
        stack.push(array[i]);
        return stack;
    }

    static LinkedList<Integer> QueueAdd(int [] array)
    {
        LinkedList<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < array.length; i++)
        queue.add(array[i]);
        return queue;
    }

    static int[] ArrayGen(int number)
    {
        int[] array = new int[number];
        for (int i = 0; i < number; i++)
        {
            array[i] = (int)(Math.random() * 100);
        }
        return array;
    }
    
    public static void main(String[] args)
    {
        int number = CheckNumbers("Введите число элементов в списке");
        int[] array = ArrayGen(number);
        System.out.println("Сгенерирован массив:");
        System.out.println(Arrays.toString(array));
        Stack<Integer> stack = StackAdd(array);
        System.out.println("Массив переведен в стек. Содержимое стека:");
        System.out.println(stack);
        //System.out.println(stack.pop());
        //System.out.println(stack instanceof Stack<Integer>);
        LinkedList<Integer> queue = QueueAdd(array);
        System.out.println("Массив переведен в очередь. Содержимое очереди:");
        System.out.println(queue);
        //System.out.println(queue.poll());
        //System.out.println(queue instanceof LinkedList<Integer>);
    }
}
