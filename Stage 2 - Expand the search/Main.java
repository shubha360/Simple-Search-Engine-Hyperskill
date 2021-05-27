package search;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of people:");
        int input = scanner.nextInt();
        scanner.nextLine();
        String[] peopleStorage = new String[input];

        System.out.println("Enter all people:");

        for (int i = 0; i < input; i++) {
            peopleStorage[i] = scanner.nextLine();
        }

        System.out.println("\nEnter the number of search queries:");
        int queries = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < queries; i++) {
            System.out.println("\nEnter data to search people:");
            String query = scanner.nextLine().toUpperCase();
            boolean matchFound = false;

            for (String people : peopleStorage) {
                if (people.toUpperCase().contains(query)) {

                    if (!matchFound) {
                        System.out.println("\nFound people:");
                        matchFound = true;
                    }
                    System.out.println(people);
                }
            }

            if (!matchFound) {
                System.out.println("No matching people found.");
            }
        }
    }
}
