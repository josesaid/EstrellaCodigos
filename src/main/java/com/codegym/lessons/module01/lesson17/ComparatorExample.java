package com.codegym.lessons.module01.lesson17;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    //https://www.baeldung.com/java-comparator-comparable

    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player();
        player1.setAge(59);
        Player player2 = new Player();
        player2.setAge(67);
        Player player3 = new Player();
        player3.setAge(45);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        System.out.println("Before Sorting : " + footballTeam);
        //Collections.sort(footballTeam, new PlayerAgeComparator());
        PlayerAgeComparator comparadorUsado = new PlayerAgeComparator();
        Collections.sort(footballTeam, comparadorUsado);
        System.out.println("After Sorting : " + footballTeam);
    }

}


class PlayerAgeComparator implements Comparator<Player> {

    @Override
    public int compare(Player firstPlayer, Player secondPlayer) {
        //return Integer.compare(secondPlayer.getAge(), firstPlayer.getAge());
        return Integer.compare(firstPlayer.getAge(), secondPlayer.getAge());
    }
    // -1 - FirstPlayer
    // 0 - Equals both players
    // 1 - Second player

}

@Data
class Player{
    private int age;
}