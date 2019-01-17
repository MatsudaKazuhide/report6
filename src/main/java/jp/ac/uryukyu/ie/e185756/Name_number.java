package jp.ac.uryukyu.ie.e185756;

import java.util.Scanner;
import java.io.Console;

public class Name_number {

    String[] player_name = new String[2];
    int[][] player_number = new int[2][3];

    Name_number() {
        Console console = System.console();
        for (int i=0; i<2; i++) {
            boolean miss = true;
            Scanner scan = new Scanner(System.in);
            int n = i+1;
            System.out.println("プレイヤー" + n + "の名前と3桁の数字を入力してください。");
            System.out.println("名前：");
            this.player_name[i] = scan.nextLine();
            while(miss == true) {
                char[] c = console.readPassword("3桁の数字： ");
                if (c.length != 3) {
                    System.out.println("入力された数字が3桁ではありません。");
                }
                else {
                    for (int j = 0; j < 3; j++) {
                        this.player_number[i][j] += Character.getNumericValue(c[j]);
                    }
                    if ((this.player_number[i][0] == this.player_number[i][1]) && (this.player_number[i][0] == this.player_number[i][2]) && (this.player_number[i][1] == this.player_number[i][2])) {
                        System.out.println("同じ数字が入力されています。");
                    }
                    else {
                        miss = false;
                    }
                }
            }
            //System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
    }

    public Name_number(int num, int num2) {

    }
}
