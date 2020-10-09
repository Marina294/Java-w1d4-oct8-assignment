import java.util.Scanner;

// Write a program that uses nested 
// for loops to display a multiplication table.



public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter multiple number: ");

        int x = input.nextInt();
        int y = input.nextInt();

        for (x = 1; x <= 9; x++) {
            for (y = 1; y <= 9; y++) {
                System.out.printf("%4d",x * y);
            }
            System.out.println();
        }

    }
}

// --------------------------------------------------------------------

// public class MultiplicationTable {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter multiple number: ");

//         int num = input.nextInt();
//         for (int i = 0; i < 9; i++) {
//             System.out.println(num + " x " + (i + 1) + " = " + 
//             (num * (i +1 )));
//         }

//     }
// }