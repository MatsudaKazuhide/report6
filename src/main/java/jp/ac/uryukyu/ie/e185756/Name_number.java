package jp.ac.uryukyu.ie.e185756;

import java.util.Scanner;

public class Name_number {

    String[] player_name = new String[2];
    int[] player_number = new int[2];

    public Name_number() {
        for (int i=0; i<2; i++) {
            Scanner scan = new Scanner(System.in);
            int n = i+1;
            System.out.println("プレイヤー" + n + "の名前と3桁の数字を入力してください。");
            System.out.println("名前：");
            this.player_name[i] = scan.nextLine();
            System.out.println("3桁の数字：");
            this.player_number[i] = scan.nextInt();
            //System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
    }

    public Name_number(int num, int num2) {

    }
}
