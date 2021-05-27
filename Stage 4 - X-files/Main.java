package search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> peopleList = new ArrayList<>();

        try (Scanner fileReader = new Scanner(new File(args[1]))) {

            while (fileReader.hasNextLine()) {
                peopleList.add(fileReader.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
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

    static void printList(ArrayList<String> list) {

        System.out.println("\n=== List of people ===");
        for (String person : list) {
            System.out.println(person);
        }
    }

    static void find(ArrayList<String> list) {

        System.out.println("\nEnter a name or email to search all suitable people.");
        String key = scanner.nextLine();

        boolean matchFound = false;

        for (String people : list) {
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
