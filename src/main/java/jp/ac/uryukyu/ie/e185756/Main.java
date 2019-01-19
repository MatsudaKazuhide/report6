package jp.ac.uryukyu.ie.e185756;

public class Main {
    public static void main(String[] args) {
        Judgment.op();

        Name_number player = new Name_number();

        player.turn();

        Judgment.Judge(player);

        player.answer();
    }
}


//        Scanner scan = new Scanner(System.in);
//        System.out.println("これからヌメロンのルール説明をします。");
//        System.out.println("スキップしますか？　1：スキップする　2：説明をきく");
//        int num = scan.nextInt();
//        scan.nextLine();
//        if (num == 2) {
//            String text[] = {"ヌメロンは2人対戦ゲームでプレイヤーはそれぞれ相手に教えないで3桁の数字を決めます。",
//                    "次に先攻後攻を決めて先攻から相手の決めた数字を予想し入力します。",
//                    "そのあと予想した数字がどれだけ当たっているかのヒントをもらいます。",
//                    "これを交互に行い先に相手の数字を当てた人の勝ちです。"};
//            for (int i = 0; i < text.length; i++) {
//                System.out.print(text[i]);
//                scan.nextLine();
//            }
//        }
//        System.out.println("それでは対戦を開始します！");
//        scan.nextLine();



//        System.out.println("先攻と後攻を決めてください。ランダムで決めますか？ 1：はい　2：いいえ");
//        num = scan.nextInt();
//
//        if (num == 1) {
//            int order = (int) (Math.random() * 2);
//            if (order == 0) {
//                System.out.println(player.player_name[0] + "さんが先攻です。");
//            } else {
//                System.out.println(player.player_name[1] + "さんが先攻です。");
//                conversion(player);
//            }
//        } else {
//            System.out.println("どちらが先攻ですか？　 1：" + player.player_name[0] + "　2：" + player.player_name[1]);
//            num = scan.nextInt();
//            if (num == 2) {
//                conversion(player);
//            }
//        }

//        System.out.println("答え");
//        for (int i = 0; i < 2; i++) {
//            System.out.print(player.player_name[i] + ":");
//            for (int j = 0; j < 3; j++) {
//                System.out.print(player.player_number[i][j]);
//            }
//            System.out.print("\n");
//        }
//        System.out.print(player.player_name[0] +":"+ player.player_number[0]);
//        System.out.println(player.player_name[1] +":"+ player.player_number[1]);


//    public static void conversion(Name_number player) {
//        String a = player.player_name[1];
//        player.player_name[1] = player.player_name[0];
//        player.player_name[0] = a;
//        int b[] = player.player_number[1];
//        player.player_number[1] = player.player_number[0];
//        player.player_number[0] = b;
//    }



//    public static void Judgment(Name_number player){
//        boolean game = false;
//        int player_turn = 0, sw = 1, a = 0;
//        int[] yosou = new int[100];
//
////        int[] player1 = new int[3], player2 = new int[3];
////        int[][] p_num = new int[2][3];
////        p_num[0] = contents(player1,player.player_number[0]);
////        p_num[1] = contents(player2,player.player_number[1]);
//
//        while(game == false){
//            Scanner scan = new Scanner(System.in);
//            int eat = 0, bite = 0;
//            System.out.println(player.player_name[player_turn] + "さんのターンです。数字を入力してください。");
//            int number = scan.nextInt();
//            yosou[a] = number;
//            a++;
//
//            int[] data = new int[3];
//            data = contents(data, number);
//            for(int j=0; j<3; j++){
//                if(data[j] == player.player_number[sw][j]){
//                    eat++;
//                }
//            }
//
//            for(int j=0; j<3; j++){
//                for(int n=0; n<3; n++) {
//                    if (data[j] == player.player_number[sw][n]) {
//                        bite++;
//                    }
//                }
//            }
//            bite = bite - eat;
//
//            System.out.println(eat + "EAT " + bite + "BITE");
//
//            if(eat == 3){
//                System.out.println("対戦終了！" + player.player_name[player_turn] + "さんの勝利です！！！");
//                game = true;
//            }
//
//            if(player_turn == 0){
//                player_turn = 1;
//                sw = 0;
//            }
//            else{
//                player_turn = 0;
//                sw = 1;
//            }
//        }
//    }
//
//
//
//    public static int[] contents(int num[], int n){
//        for(int i=2; i>=0; i--){
//            int x = n % 10;
//            num[i]=x;
//            n = n / 10;
//        }
//        return num;
//    }
//}
