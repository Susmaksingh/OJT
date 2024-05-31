/*2.	Write a program that uses the Scanner class to read a line of text and then counts the number of words in the line. Assume words are separated by spaces */
import java.util.*;

public class CountWord{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text");

        String input = sc.nextLine();

        String[] words = input.trim().split("\\s+");

        int CountWord = words.length;

        System.out.println("Words in line:" + CountWord);
    }
}