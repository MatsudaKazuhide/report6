package jp.ac.uryukyu.ie.e185756;

import java.util.Scanner;

/**
 * Name_numberクラス。
 * String[] player_name; //プレイヤーの名前。
 * int[][] player_number //プレイヤーがセットした番号。
 */
public class Name_number {

    private String[] player_name;
    private int[][] player_number;

    /**
     * コンストラクタ。名前。番号をセットする。
     * @param player_name プレイヤーの名前。
     * @param player_number プレイヤーがセットした番号。
     */
    Name_number(String[] player_name,int[][] player_number) {
        this.player_name = player_name;
        this.player_number = player_number;
    }

    /**
     * プレイヤーのターンを決めるメソッド。
     * ランダムで決める機能あり。
     */
    public void Turn(){
        System.out.println("先攻と後攻を決めてください。ランダムで決めますか？ 1：はい　2：いいえ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num == 1) {
            int order = (int) (Math.random() * 2);
            if (order == 0) {
                System.out.println(this.player_name[0] + "さんが先攻です。");
            } else {
                System.out.println(this.player_name[1] + "さんが先攻です。");
                Conversion();
            }
        } else {
            System.out.println("どちらが先攻ですか？　 1：" + this.player_name[0] + "　2：" + this.player_name[1]);
            num = scan.nextInt();
            if (num == 2) {
                Conversion();
            }
        }
    }

    /**
     * プレイヤーの名前と番号を並び変えるメソッド。
     */
    public void Conversion() {
        String a = this.player_name[1];
        this.player_name[1] = this.player_name[0];
        this.player_name[0] = a;
        int b[] = this.player_number[1];
        this.player_number[1] = this.player_number[0];
        this.player_number[0] = b;
    }

    /**
     * 答えを出力するメソッド。
     */
    public void Answer(){
        System.out.println("答え");
        for (int i = 0; i < 2; i++) {
            System.out.print(this.player_name[i] + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print(this.player_number[i][j]);
            }
            System.out.print("\n");
        }
    }

    /**
     * player_nameのgetterメソッド。
     * @return player_name プレイヤーの名前。
     */
    public String[] getPlayer_name(){
        return this.player_name;
    }

    /**
     * player_numberのgetterメソッド。
     * @return player_number プレイヤーがセットした番号。
     */
    public int[][] getPlayer_number(){
        return this.player_number;
    }
}
