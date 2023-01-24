package Masai.CardGame_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = 1;
        int[] arr1 = new int[]{6};
        int n2 = 2;
        int[] arr2 = new int[]{6, 8};
        cardGame(n1, arr1, n2, arr2);
    }

    public static void cardGame(int n1, int[] arr1, int n2, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(arr1[arr1.length - 1] >= arr2[arr2.length - 1] ? "Ram" : "Shyam");
    }
}
