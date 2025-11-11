Here’s a curated list of Java practice programs ranging from beginner to advanced, along with runnable examples for a few.
You can try them in any Java IDE (Eclipse, IntelliJ, VS Code) or online compiler.

Beginner Level
Hello World program
Sum of two numbers
Check if a number is even or odd
Find the largest of three numbers
Reverse a string
Factorial of a number (iterative & recursive)
Fibonacci series up to n terms
Palindrome check (string & number)
Count vowels and consonants in a string
Simple calculator using switch
Intermediate Level
Prime number check
Armstrong number check
LCM and GCD of two numbers
Sort an array (Bubble sort, Arrays.sort)
Remove duplicates from an array
Find second largest element in an array
Matrix addition and multiplication
File read/write operations
Count frequency of characters in a string
Implement a basic bank account class
Advanced Level
Implement a stack and queue (using arrays & LinkedList)
Binary search & linear search
Merge sort & quick sort
Linked list operations (insert, delete, traverse)
Binary tree traversal (inorder, preorder, postorder)
Exception handling with custom exceptions
Multithreading example (Thread class & Runnable)
Producer-consumer problem
JDBC connection to a database
Simple chat application using sockets
Example: Prime Number Check in Java
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // Validate input
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }

        int num = sc.nextInt();
        sc.close();

        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}

