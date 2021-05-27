package search;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String wordToSearch = scanner.nextLine();

        String[] inputArr = input.split(" ");

        int i = 1;

        for (String s : inputArr) {
            if (wordToSearch.equals(s)) {
                System.out.println(i);
                return;
            }
            i++;
        }
        System.out.println("Not found");
    }
}
