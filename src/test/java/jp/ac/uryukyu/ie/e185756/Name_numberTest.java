package jp.ac.uryukyu.ie.e185756;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Name_numberTest {


    @Test
    void conversion() {
        int[][] number = new int[2][3];
        String[] name = {"A","B"};
        for(int i=0; i<2; i++) {
            for (int j = 0; j < 3; j++) {
                number[i][j] =i;
            }
        }
        Name_number player = new Name_number(name, number);

        player.Conversion();

        assertEquals(name,player.getPlayer_name());
        assertEquals(number,player.getPlayer_number());
    }

}