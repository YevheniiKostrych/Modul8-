package GoIT.gameX0;

import java.util.Scanner;

public class TicTacToe {
    // Глобальна константа для розміру поля
    private static final int SIZE = 3;
    // Створення поля для гри
    private static char[][] board = new char[SIZE][SIZE];

    // Ініціалізація поля для гри
    private static void initBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Виведення поля для гри на екран
    private static void displayBoard() {
        System.out.println("  0 1 2");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + "      ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + "      ");
            }
            System.out.println();
        }
    }

    // Перевірка на перемогу
    private static boolean checkWin(char player) {
        // Перевірка по горизонталі
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        // Перевірка по вертикалі
        for (int j = 0; j < SIZE; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }
        // Перевірка по діагоналям
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    // Головний метод гри
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X'; // Початковий гравець
        boolean gameOver = false; // Прапорець завершення гри

        // Ініціалізація поля для гри
        initBoard();
        // Виведення поля для гри на екран
        displayBoard();

        // Основний цикл гри
        while (!gameOver) {
            // Запит на хід від гравця
            System.out.print("Гравець " + currentPlayer + ", введіть рядок та стовпець (наприклад, '0 0'): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // Перевірка на коректність ходу
            if (row < 0 || row >= SIZE || col < 0 || col >= SIZE || board[row][col] != '-') {
                System.out.println("Некоректний хід. Спробуйте ще раз.");
                continue;
            }

            // Виконання ходу
            board[row][col] = currentPlayer;
            // Виведення оновленого поля для гри на екран
            displayBoard();

            // Перевірка на перемогу поточного гравця
            if (checkWin(currentPlayer)) {
                System.out.println("Гравець " + currentPlayer + " переміг!");
                gameOver = true;
            }
            // Перевірка на нічию
            else if (!checkTie()) {
                System.out.println("Гра закінчилася в нічию!");
                gameOver = true;
            }

            // Зміна поточного гравця
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
        scanner.close();
    }

    // Перевірка на нічию
    private static boolean checkTie() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == '-') {
                    return true;
                }
            }
        }
        return false;
    }
}
