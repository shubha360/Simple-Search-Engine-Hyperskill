package search;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of people:");
        int totalInput = scanner.nextInt();
        scanner.nextLine();
        String[] peopleList = new String[totalInput];

        System.out.println("Enter all people:");

        for (int i = 0; i < totalInput; i++) {
            peopleList[i] = scanner.nextLine();
        }

        while (true) {

            int selection = printMenu();

            switch (selection) {

                case 1:
                    find(peopleList);
                    break;

                case 2:
                    printList(peopleList);
                    break;

                case 0:
                    System.out.println("\nBye!");
                    return;

                default:
                    System.out.println("\nIncorrect option! Try again.");
                    break;
            }
        }
    }

    static int printMenu() {

        System.out.println("\n=== Menu ===\n" +
                "1. Find a person\n" +
                "2. Print all people\n" +
                "0. Exit");

        int selection = scanner.nextInt();
        scanner.nextLine();
        return selection;
    }

    static void printList(String[] list) {

        System.out.println("\n=== List of people ===");
        for (String person : list) {
            System.out.println(person);
        }
    }

    static void find(String[] arr) {

        System.out.println("\nEnter a name or email to search all suitable people.");
        String key = scanner.nextLine();

        boolean matchFound = false;

        for (String people : arr) {
            if (people.toUpperCase().contains(key.toUpperCase())) {
                matchFound = true;
                System.out.println(people);
            }
        }

        if (!matchFound) {
            System.out.println("No matching people found.");
        }
    }
}
