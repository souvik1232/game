package com.java.game;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    static Scanner scanner = new Scanner(System.in);

    //UserCase1
    public static char[] createBoard() {
        char[] board = new char[10];

        for (int i = 1; i < board.length; i++) {
            board[i] = ' '; //Assign each board value as space
        }
        return board;
    }
    //UserCase2
    public static String[] inputBoard(String player,String computer)
    {
        String[] Choice = new String[2];
        System.out.println("Choose Between X or O");
        player = scanner.next().toUpperCase();//Asking user input choice
        if(player.equals("X")) {
            computer = "O";
        }
        else if (player.equals("O")) {
            computer = "X";
        }
        Choice[0] = player;
        Choice[1] = computer;
        return Choice;
    }
    //UserCase3
    public static void displayBoard(char[] Board)
    {
        for(int i = 1 ; i < Board.length ;i++)
        {
            System.out.print("|_"+Board[i] + "_|"); //Printing the board
            if(i%3 == 0)
                System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe");
        String player = null;
        String computer = null;
        char[] board = createBoard();
        String[] input = inputBoard(player,computer);
        displayBoard(board);
    }
}