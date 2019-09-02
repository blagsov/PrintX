import java.util.Scanner;
/*
 * code written
 * by Zoya Klocheva
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите желаемую высоту креста:");
        //------------------------------------------------------
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Введите корректное число больше нуля!");
        } else {
            // Создаем двумерный массив
            String[][] arrX = new String[number][number];

            // Цикл по первой размерности (первые квадратные скобки)
            for (int i = 0; i < number; i++) {
                // Цикл по второй размерности (вторые квадратные скобки)
                for (int j = 0; j < number; j++) {

                    arrX[i][j] = "";

                    if (i == j || i == arrX[i].length - 1 - j) {
                        arrX[i][j] = "X";
                    } else {
                        arrX[i][j] = " ";
                    }
                }
            }
        //------------------------------------------------------
            // Теперь выводим массив на экран
            // Цикл по первой размерности выводит строки
            for (int i = 0; i < number; i++) {
                // Цикл по второй размерности выводит колонки - вывод одной строки
                for (int j = 0; j < number; j++) {
                    System.out.print(arrX[i][j]);
                }
                // Переход на следующую строку
                System.out.println();
            }
        }
    }
}
