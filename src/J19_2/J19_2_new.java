package J19_2;

import java.util.Scanner;

public class J19_2_new {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] game = new int[3][3];

        int player = 1;
        int x, y;

        System.out.println();
        System.out.println("Welcome in Tic-Tac-Toe game");
        System.out.println();

        while (true) {

            for (int i = 0; i < game.length; i++) {
                for (int j = 0; j < game[i].length; j++) {
                    System.out.print("  " + game[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            System.out.print("Player " + player + ": give X: ");
            x = sc.nextInt();
            System.out.print("Player " + player + ": give Y: ");
            y = sc.nextInt();

            if (game[x][y] == 0) {
                game[x][y] = player;
                if (player == 1) {
                    player = 2;
                } else {
                    player = 1;
                }
            } else {
                System.out.println();
                System.out.println("This field is already occupied, player " + player + " lost the turn");
                if (player == 1) {
                    player = 2;
                } else {
                    player = 1;
                }
            }

            if (game[0][0] == 1 && game[0][1] == 1 && game[0][2] == 1 ||
                    game[1][0] == 1 && game[1][1] == 1 && game[1][2] == 1 ||
                    game[2][0] == 1 && game[2][1] == 1 && game[2][2] == 1 ||
                    game[0][0] == 1 && game[1][0] == 1 && game[2][0] == 1 ||
                    game[0][1] == 1 && game[1][1] == 1 && game[2][1] == 1 ||
                    game[0][2] == 1 && game[1][2] == 1 && game[2][2] == 1 ||
                    game[0][0] == 1 && game[1][1] == 1 && game[2][2] == 1 ||
                    game[0][2] == 1 && game[1][1] == 1 && game[2][0] == 1) {

                System.out.println();
                System.out.println("Player 1 won !!!");
                System.out.println();

                for (int i = 0; i < game.length; i++) {
                    for (int j = 0; j < game[i].length; j++) {
                        System.out.print("  " + game[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println("The end of the game");
                break;

            } else if (game[0][0] == 2 && game[0][1] == 2 && game[0][2] == 2 ||
                    game[1][0] == 2 && game[1][1] == 2 && game[1][2] == 2 ||
                    game[2][0] == 2 && game[2][1] == 2 && game[2][2] == 2 ||
                    game[0][0] == 2 && game[1][0] == 2 && game[2][0] == 2 ||
                    game[0][1] == 2 && game[1][1] == 2 && game[2][1] == 2 ||
                    game[0][2] == 2 && game[1][2] == 2 && game[2][2] == 2 ||
                    game[0][0] == 2 && game[1][1] == 2 && game[2][2] == 2 ||
                    game[0][2] == 2 && game[1][1] == 2 && game[2][0] == 2) {

                System.out.println();
                System.out.println("Player 2 won !!!");
                System.out.println();

                for (int i = 0; i < game.length; i++) {
                    for (int j = 0; j < game[i].length; j++) {
                        System.out.print("  " + game[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println("The end of the game");
                break;
            }
            System.out.println();
        }
    }
}

