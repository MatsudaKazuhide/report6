package jp.ac.uryukyu.ie.e185756;

import java.util.Scanner;

public class Judgment {

    public static void op(){
        Scanner scan = new Scanner(System.in);
        System.out.println("これからヌメロンのルール説明をします。");
        System.out.println("スキップしますか？　1：スキップする　2：説明をきく");
        int num = scan.nextInt();
        scan.nextLine();
        if (num == 2) {
            String text[] = {"ヌメロンは2人対戦ゲームでプレイヤーはそれぞれ相手に教えないで3桁の数字を決めます。",
                    "次に先攻後攻を決めて先攻から相手の決めた数字を予想し入力します。",
                    "そのあと予想した数字がどれだけ当たっているかのヒントをもらいます。",
                    "これを交互に行い先に相手の数字を当てた人の勝ちです。"};
            for (int i = 0; i < text.length; i++) {
                System.out.print(text[i]);
                scan.nextLine();
            }
        }
        System.out.println("それでは対戦を開始します！");
        scan.nextLine();
    }


    public static void Judge(Name_number player){
        boolean game = false;
        int player_turn = 0, sw = 1;

        Scanner scan = new Scanner(System.in);

        while(game == false){
            int eat = 0, bite = 0;
            System.out.println(player.getPlayer_name()[player_turn] + "さんのターンです。数字を入力してください。");
            int number = scan.nextInt();


            int[] data = new int[3];
            data = contents(data, number);
            for(int j=0; j<3; j++){
                if(data[j] == player.getPlayer_number()[sw][j]){
                    eat++;
                }
            }
            for(int j=0; j<3; j++){
                for(int n=0; n<3; n++) {
                    if (data[j] == player.getPlayer_number()[sw][n]) {
                        bite++;
                    }
                }
            }
            bite = bite - eat;

            System.out.println(eat + "EAT\t" + bite + "BITE");

            if(eat == 3){
                System.out.println("対戦終了！" + player.getPlayer_name()[player_turn] + "さんの勝利です！！！");
                game = true;
            }

            if(player_turn == 0){
                player_turn = 1;
                sw = 0;
            }
            else{
                player_turn = 0;
                sw = 1;
            }
            scan.nextLine();
            scan.nextLine();
        }
    }
    public static int[] contents(int num[], int n){
        for(int i=2; i>=0; i--){
            int x = n % 10;
            num[i]=x;
            n = n / 10;
        }
        return num;
    }
}

