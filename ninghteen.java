
/*Напишите программу, которая вводит с клавиатуры
непустой массив целых чисел, циклически сдвигает элементы массива
вправо на одну позицию, и печатает результат. Цикличность означает,
что последний элемент массива становится самым первым его элементом.*/
/*import java.util.Scanner;
public class ninghteen {
        public static void main(String args[]) {
            Scanner hi = new Scanner(System.in);
            int x = hi.nextInt();
            int A[];
            A = new int[x];
            for (int i = 0; i < x; i++) {
                A[i] = hi.nextInt();
            }
            int x2 = A[x-1];
            for (int i = x - 1; i > 0; i--) {
                A[i] = A[i - 1];
            }
            A[0] = x2;
            for (int i = 0; i < x; i++) {
                System.out.println(A[i]);
            }
        }
}*/
