/*Напишите программу, которая вводит с клавиатуры
непустой массив целых чисел, заменяет все элементы массива, кроме
крайних, на полусумму соседей, и печатает результат.*/
import java.util.Scanner;
public class twentyone {
    public static void main(String args[]) {
        Scanner hi = new Scanner(System.in);
        int x = hi.nextInt();
        int A[];
        A = new int[x];
        for (int i = 0; i < x; i++) {
            A[i] = hi.nextInt();
            }
        System.out.println(A[0]);
        for (int i = 1; i < x - 1; i++) {
            A[i] = (A[i - 1] + A[i + 1]) / 2;
            System.out.println(A[i]);
        }
        System.out.println(A[x-1]);
    }
}
