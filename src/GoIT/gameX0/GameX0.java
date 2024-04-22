package GoIT.gameX0;

import java.util.Scanner;

public class GameX0 {

    private static final int size = 3;
    private static String[][] board = new String[size][size];

    public static boolean isWinn(String playerChar){

        for (int i = 0; i < size; i++) {
            if (playerChar.equals(board[i][0]) &&  playerChar.equals(board[i][1]) && playerChar.equals(board[i][2])) {
                return true;
            }
        }
        for (int j = 0; j < size; j++) {
            if (playerChar.equals(board[0][j]) &&  playerChar.equals(board[1][j]) && playerChar.equals(board[2][j])) {
                return true;
            }
        }
        if (playerChar.equals(board[0][0]) && playerChar.equals(board[1][1]) && playerChar.equals(board[2][2])){
            return true;
        }
        if (playerChar.equals(board[0][2]) && playerChar.equals(board[1][1]) && playerChar.equals(board[2][0])){
            return true;
        }


        return false;

    }
    public static void printBoard(String[][] board){
        System.out.println("  \t0 \t\t1\t\t2");
        System.out.println("0 \t"+board[0][0]+"\t|\t"+board[0][1]+"\t|\t"+board[0][2]);
        System.out.println("1 \t"+board[1][0]+"\t|\t"+board[1][1]+"\t|\t"+board[1][2]);
        System.out.println("2 \t"+board[2][0]+"\t|\t"+board[2][1]+"\t|\t"+board[2][2]);

    }

    private static void initBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = "-";
            }
        }
    }
    private static boolean checkTie() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ("-".equals(board[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String currentPlayer="X";
        boolean gameOver=false;
        byte rowIndwx;
        byte collIndex;

        boolean result;

initBoard();;
        printBoard(board);



        while (!gameOver) {
            System.out.print("Гравець " + currentPlayer + ", введіть рядок та стовпець (наприклад, '0 0'): ");
            rowIndwx=scan.nextByte();
            collIndex=scan.nextByte();
            if (rowIndwx < 0 || rowIndwx >= size || collIndex < 0 || collIndex >= size || board[rowIndwx][collIndex] != "-") {
                System.out.println("Некоректний хід. Спробуйте ще раз.");
                continue;
            }
            board[rowIndwx][collIndex]=currentPlayer;

            printBoard(board);

            if (isWinn(currentPlayer)) {
                System.out.println("Гравець " + currentPlayer + " переміг!");
                gameOver = true;
            }
            else if (!checkTie()) {
                System.out.println("Гра закінчилася в нічию!");
                gameOver = true;
            }


            currentPlayer = (currentPlayer.equals("X")) ? "0" : "X";
        }

scan.close();




    }









}
