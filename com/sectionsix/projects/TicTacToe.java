package com.sectionsix.projects;
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
            runGame();
    }
    public static void runGame(){
         String winner="";
         boolean xTurn =true;

         String[][] gameBoard = new String[3][3];
         initializeGameBoard(gameBoard);
         printCurrentBoard(gameBoard);
         while (winner.equals("")){
             if(xTurn){
                 System.out.println("It is x's Turn");
             }
             else{
                 System.out.println("It is o's turn");
             }
             getUserInput(xTurn,gameBoard);
             System.out.println();

             printCurrentBoard(gameBoard);
             winner=getWinner(gameBoard);
             xTurn=!xTurn;

             if(winner.equals("") && isBoardFull(gameBoard)){
                 winner="c";
             }
         }
        System.out.println();

         if(winner.equals("c")){
             System.out.println("It is the cat's game! No winner");
         }
         else {
             System.out.println("The winner is "+winner);
         }
    }
    public static void initializeGameBoard(String[][] gameBoard){
            for(int row=0;row<gameBoard.length;row++){
                for(int column=0;column<gameBoard[row].length;column++){
                    gameBoard[row][column]=" ";
                }
            }
    }
    public static void printCurrentBoard(String[][] gameBoard){
        for(int row=0;row<gameBoard.length;row++){
            for(int column=0;column<gameBoard[row].length;column++){
                System.out.print(gameBoard[row][column]);
                if(column<2){
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if(row<2){
                System.out.print("- - - - -");
            }
            System.out.println();
        }
    }
    public static void  getUserInput(boolean xTurn,String[][] gameBoard){
        Scanner keyBoard = new Scanner(System.in);
        int row =-1;
        int column = -1;
        boolean required = true;

        while (required){
            System.out.println("Please enter row and then coloumn"
            +"each from 0 ,1 or 2"+"seperated by a space");
            row=keyBoard.nextInt();
            column=keyBoard.nextInt();
            keyBoard.nextLine(); //to consumeNewLine

            if(row>=0 && row<=2 && column>=0 && column<=2){
                if(!cellAlreadyOccupied(gameBoard,row,column)){
                    required=false;
                }
                else{
                    System.out.println("The cell is already occupied");
                }
            }
        }
        if(xTurn){
            gameBoard[row][column]="x";
        }
        else {
            gameBoard[row][column]="o";
        }
    }
    public static boolean isBoardFull(String[][] gameBoard){
        int count=0;
        for(int row=0;row<gameBoard.length;row++){
            for(int column=0;column<gameBoard[row].length;column++){
                if(!gameBoard[row][column].equals(" ")){
                    count++;
                }
            }
        }
        return count==9;
    }
    public static String getWinner(String[][] gameBoard){
        final int ROWS =gameBoard.length;
        final  int COLUMNS = gameBoard[0].length;
        for (int row=0;row<ROWS;row++){
            if(!gameBoard[row][0].equals(" ")&& gameBoard[row][0].equals(gameBoard[row][1])
            && gameBoard[row][1].equals(gameBoard[row][2])){
                return gameBoard[row][0];
            }
        }
        for (int column=0;column<COLUMNS;column++){
            if(!gameBoard[0][column].equals(" ")&& gameBoard[0][column].equals(gameBoard[1][column])
                    && gameBoard[1][column].equals(gameBoard[2][column])){
                return gameBoard[0][column];
            }
        }
        if(!gameBoard[0][0].equals(" ") && gameBoard[0][0].equals(gameBoard[1][1])
        && gameBoard[1][1].equals(gameBoard[2][2])){
            return gameBoard[0][0];
        }
        if(!gameBoard[2][0].equals(" ") && gameBoard[2][0].equals(gameBoard[1][1])
                && gameBoard[1][1].equals(gameBoard[0][2])){
            return gameBoard[2][0];
        }
        return "";
    }
    public static boolean cellAlreadyOccupied(String[][] gameBoard,int row,int column){
        return gameBoard[row][column]!= " ";
    }

}
