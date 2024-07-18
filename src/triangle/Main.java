package triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        System.out.println("Nhap canh thu 1 :");
        double a = number.nextDouble();
        System.out.println("Nhap canh thu 2 :");
        double b = number.nextDouble();
        System.out.println("Nhap canh thu 3 :");
        double c = number.nextDouble();
        System.out.println("Nhap mau : ");
        String color = string.nextLine();
        System.out.println("Thong tin :");
        Triangle triangle1 = new Triangle(a , b, c , color) ;
        System.out.println(triangle1.toString());
    }
}
