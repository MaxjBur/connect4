package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[][] gameBoard = new int[6][6];

        for (int i = 0; i < 6; i++) {
            System.out.println(Arrays.toString(gameBoard[i]));

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("What space would you like to go in");
        int rowChoice = scanner.nextInt();

        for (int i = 5; i >= 0; i--) {
            if (gameBoard[i][rowChoice] == 0) {
                gameBoard[i-1][rowChoice] = 2;
                break;
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(Arrays.toString(gameBoard[i]));
        }
    }
}
