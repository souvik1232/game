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
    public static String[] inputBoard(String player, String computer) {
        String[] Choice = new String[2];
        System.out.println("Choose Between X or O");
        player = scanner.next().toUpperCase();//Asking user input choice
        if (player.equals("X")) {
            computer = "O";
        } else if (player.equals("O")) {
            computer = "X";
        }
        Choice[0] = player;
        Choice[1] = computer;
        return Choice;
    }

    //UserCase3
    public static void displayBoard(char[] Board) {
        for (int i = 1; i < Board.length; i++) {
            System.out.print("|_" + Board[i] + "_|"); //Printing the board
            if (i % 3 == 0)
                System.out.println();
        }
    }
    //UserCase4
    public static void userInput(char[] Board, String player) {

        System.out.println("Players Turn");
        System.out.println("Enter the location u want to make a move(1-9)");
        int move = scanner.nextInt();
        if (Board[move] == ' ') //UserCase5
        {
            Board[move] = player.charAt(0);
        } else {
            System.out.println("Wrong move");
        }
        displayBoard(Board);
    }
    //UserCase6
    public static int toss()
    {
        Random random = new Random();
        int toss = random.nextInt(2);//Random Value Created
        return toss;

    }
    //UserCase7
    public static String checkWinner(char[] board)
    {
        for (int a =1 ; a < 9; a++) {
            String line = null;
            switch (a) {
                case 1:
                    line = String.valueOf(board[1]) +String.valueOf(board[2])+ String.valueOf(board[3]);
                    break;
                case 2:
                    line = String.valueOf(board[4]) + String.valueOf(board[5]) + String.valueOf(board[6]);
                    break;
                case 3:
                    line = String.valueOf(board[7]) + String.valueOf(board[8]) + String.valueOf(board[9]);
                    break;
                case 4:
                    line = String.valueOf(board[1]) + String.valueOf(board[4]) + String.valueOf(board[7]);
                    break;
                case 5:
                    line = String.valueOf(board[2]) + String.valueOf(board[2]) + String.valueOf(board[8]);
                    break;
                case 6:
                    line = String.valueOf(board[3]) + String.valueOf(board[6]) + String.valueOf(board[9]);
                    break;
                case 7:
                    line = String.valueOf(board[1]) + String.valueOf(board[5]) + String.valueOf(board[9]);
                    break;
                case 8:
                    line = String.valueOf(board[3]) + String.valueOf(board[5]) + String.valueOf(board[7]);
                    break;
            }
            if (line.equals("XXX")) {
                return "X";
            }
            else if (line.equals("OOO")) {
                return "O";
            }
        }
        for (int a = 1; a <= 9; a++) {
            if (board[a]==' ') {
                break;
            }
            else if (a == 8) {
                return "draw";
            }
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe");
        String player = null;
        String computer = null;
        char[] board = createBoard();
        String[] input = inputBoard(player,computer);
        displayBoard(board);
        userInput(board,input[0]);
    }
}