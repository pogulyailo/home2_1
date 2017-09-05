import java.util.Scanner;

public class home2_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ваше имя: ");
        String name = in.nextLine();
        System.out.println("Ваш город проживания: ");
        String town = in.nextLine();
        System.out.println("Ваш возраст:");
        String age = in.nextLine();
        System.out.println("Ваше хобби:");
        String hobby = in.nextLine();

        System.out.println("Ваше имя - " + name);
        System.out.println("Ваш город проживания - " + town);
        System.out.println("Ваш возраст - " + age);
        System.out.println("Ваше хобби - " + hobby);
    }
}
