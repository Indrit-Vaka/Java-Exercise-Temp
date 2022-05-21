
import java.util.Scanner;

/**
 * By Indrit Vaka
 */
public class Hello {

    public static void main(String[] args) {
        // Ushtrimi1();
        // Ushtrimi2();
        // System.out.println(contains(new int[] { 2, 7, 10, 20 }, 1));
        // //Ushtrimi 4
        // GuessWord("Indrit");

        // // Ushtrimi 5
        // Employee employee = new Employee(5577, "Indrit", "Vaka",2000);
        // System.out.println("New salary is: " + employee.raiseSalary(40));
        // System.out.println(employee.toString());
        // System.out.println("Annual salary is: " + employee.getAnnualSalary());

        // Ushtrimi 6
        var author = new Author("Indrit Vaka", "info@indirtvaka.com", 'M');

        Book book = new Book(".Net", 250, author, 5);
        System.out.println("Price is: " + book.getPrice());
        System.out.println(book.toString());

    }

    static void GuessWord(String word) {

        char[] output = new char[word.length()];

        for (int i = 0; i < output.length; i++) {
            output[i] = '_';
        }
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        int trial = 0;
        while (!found) {

            System.out.print("\nKey in one character or your guess word: ");
            char c = sc.next().charAt(0);
            trial++;
            System.out.println("trial " + trial + ": ");
            for (int i = 0; i < output.length; i++) {
                if (word.toLowerCase().charAt(i) == c)
                    output[i] = c;
            }
            System.out.print(output);

            if (!contains(output, '_')) {
                found = true;
                System.out.println("\n---------------------------------------------------");
                System.out.println("Congratulation!\nYou have got in " + trial + " trials");
                System.out.println("---------------------------------------------------");
            }

        }

    }

    static boolean contains(char[] output, char c) {
        for (int i = 0; i < output.length; i++) {
            if (output[i] == c)
                return true;
        }
        return false;
    }

    /**
     * Ushtrimi 3 Kontrollon nese ndodhet vl x ne arrey
     * 
     * @param a Arrey qe duam te kontrollojme vl
     * @param x Vlera qe duam te kontrollojme
     * @return True nese ekziston x ne arrey
     */
    static boolean contains(int[] a, int x) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x)
                return true;
        }
        return false;
    }

    static void Ushtrimi2() {
        int numStudents = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ju lutem vendosni nr e studenteve: ");
        numStudents = sc.nextInt();
        int[] grades = new int[numStudents];
        System.out.println("Ju lutem vendosni piket 0-100");

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Ju lutem vendosni pket per studentin: " + (i + 1));
            grades[i] = sc.nextInt();
            while (grades[i] < 0 || grades[i] > 100) {
                System.out.println("Piket duhet te jene ndermjet 0 - 100");
                grades[i] = sc.nextInt();
            }
        }

        int sum = 0, max = grades[0], min = grades[0];
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
            if (max < grades[i])
                max = grades[i];
            if (min > grades[i])
                min = grades[i];
        }
        double avg = (double) sum / numStudents;
        System.out.printf("The average is: %1.2f\n", avg);
        System.out.println("The Max is: " + max);
        System.out.println("The MIn is: " + min);

    }

    static void Ushtrimi1() {

        int count = 0;
        for (int i = 1; i < 110; i++) {
            if (count == 11) {
                count = 0;
                System.out.println();
            }
            count++;
            if (i % 3 == 0)
                System.out.print("Coza ");
            else if (i % 5 == 0)
                System.out.print("Loza ");
            else if (i % 7 == 0)
                System.out.print("Woza ");
            else if (i % 3 == 0 && i % 5 == 0)
                System.out.print("CozaLoza ");
            else
                System.out.print(i + " ");
        }

    }

}