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
            System.out.print("名前：");
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
        }
    }



    public void turn(){
        System.out.println("先攻と後攻を決めてください。ランダムで決めますか？ 1：はい　2：いいえ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num == 1) {
            int order = (int) (Math.random() * 2);
            if (order == 0) {
                System.out.println(this.player_name[0] + "さんが先攻です。");
            } else {
                System.out.println(this.player_name[1] + "さんが先攻です。");
                conversion();
            }
        } else {
            System.out.println("どちらが先攻ですか？　 1：" + this.player_name[0] + "　2：" + this.player_name[1]);
            num = scan.nextInt();
            if (num == 2) {
                conversion();
            }
        }
    }


    public void conversion() {
        String a = this.player_name[1];
        this.player_name[1] = this.player_name[0];
        this.player_name[0] = a;
        int b[] = this.player_number[1];
        this.player_number[1] = this.player_number[0];
        this.player_number[0] = b;
    }

    public void answer(){
        System.out.println("答え");
        for (int i = 0; i < 2; i++) {
            System.out.print(this.player_name[i] + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print(this.player_number[i][j]);
            }
            System.out.print("\n");
        }
    }
}
