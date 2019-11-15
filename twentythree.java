/*Напишите программу, которая вводит с клавиатуры
два непустых массива целых чисел в диапазоне от нуля до девяти, и,
считая эти массивы десятичным представлением двух чисел, печатает их
разность.*/
/*import java.util.Scanner;
public class twentythree {
  public static void main(String args[]) {
        Scanner hi = new Scanner(System.in);
        int x = hi.nextInt();
        int y = hi.nextInt();
        int A[];
        int B[];
        A = new int[x];
        B = new int[y];
        System.out.println("Заполняйте первый массив");
        for (int i = 0; i < x; i++) {
            A[i] = hi.nextInt();
        }
        System.out.println("Заполняйте второй массив");
        for (int i = 0; i < y; i++) {
            B[i] = hi.nextInt();
        }
        int x1 = 0;
        int x2 = 0;
        for (int i = 0; i < x; i++) {
            x1 += A[i] * Math.pow(10, x - i - 1);
        }
        for (int i = 0; i < y; i++) {
            x2 += B[i] * Math.pow(10, y - i - 1);
        }
        System.out.println(x1 - x2);
    }
}*/
