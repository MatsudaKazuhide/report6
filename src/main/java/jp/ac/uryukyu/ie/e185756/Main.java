package jp.ac.uryukyu.ie.e185756;

/**
 * ヌメロン対戦サポート機
 */
public class Main {
    public static void main(String[] args) {
        Judgment.op();

        String[] player_name = new String[2];
        int[][] player_number = new int[2][3];

        for (int i=0; i<2; i++) {
            player_name  = Judgment.Name_setting(i, player_name);
            player_number = Judgment.Number_setting(i, player_number);
        }

        Name_number player = new Name_number(player_name, player_number);

        player.Turn();

        Judgment.Judge(player);

        player.Answer();
    }
}
