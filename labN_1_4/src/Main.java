import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество: ");
        int N = in.nextInt();
        int i = 1;
        while (N <= 0) {
            if (N <= 0) {
                System.out.println("Ошибка, введите число больше 0");
                System.out.print("Количество: ");
                N = in.nextInt();
            }
        }
        System.out.print("Радиус: ");
        int R = in.nextInt();
        while (R < 0) {
            if (R < 0) {
                System.out.println("Ошибка, введите число больше или равное 0");
                System.out.print("Радиус: ");
                R = in.nextInt();
            }
        }
        int kol = 0;
        while (i <= N) {
            System.out.print("X");
            System.out.print(i);
            System.out.print(": ");
            int X = in.nextInt();
            System.out.print("Y");
            System.out.print(i);
            System.out.print(": ");
            int Y = in.nextInt();
            i = i + 1;
            if (X * X + Y * Y <= R * R) {
                kol = kol + 1;
            }
        }
        System.out.print(kol);
        System.out.println(" точек попали в окружность");
    }
}