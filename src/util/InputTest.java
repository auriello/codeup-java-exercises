package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a min");
        int min = scanner.nextInt();
        System.out.println("Enter a max");
        int max = scanner.nextInt();
        System.out.println(Input.getInt(min, max));
    }
}