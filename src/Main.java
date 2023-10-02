import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, turkish, music, physics, chem, history;

        System.out.print("Fizik Dersi Notunuz: ");
        physics = input.nextInt();
        System.out.print("Matematik Dersi Notunuz: ");
        math = input.nextInt();
        System.out.print("Kimya Dersi Notunuz: ");
        chem = input.nextInt();
        System.out.print("Türkçe Dersi Notunuz: ");
        turkish = input.nextInt();
        System.out.print("Tarih Dersi Notunuz: ");
        history = input.nextInt();
        System.out.print("Müzik Dersi Notunuz: ");
        music = input.nextInt();

        int totalPoint = math + turkish + music + physics + chem + history;
        double avaragePoint = totalPoint / 6;
        System.out.println("Ortalama notunuz: " + avaragePoint);

    }
}