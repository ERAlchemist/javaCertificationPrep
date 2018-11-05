package com.Excercises;

public class DeclareWinner {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        System.out.println("The Fighters are " + fighter1.name + " and  " + fighter2.name);
        Fighter firstFighter = fighter1;
        Fighter secondFighter = fighter2;
        firstFighter = firstAttacker == fighter2.name ? fighter2 : fighter1;
        secondFighter = firstAttacker == fighter2.name ? fighter1 : fighter2;
        System.out.println("firstFighter= " + firstFighter.name);
        System.out.println("secondFighter= " + secondFighter.name);
        while(firstFighter.health >=0 && secondFighter.health >= 0){
            secondFighter.health -= firstFighter.damagePerAttack;
            System.out.println("Fighter1 health " + fighter1.health);
            System.out.println("firstFighter health " + firstFighter.health);
            if(secondFighter.health <=0) break;
            if(firstFighter.health <=0) break;
            firstFighter.health -= secondFighter.damagePerAttack;
            System.out.println("2 health " + fighter2.health);
            System.out.println("secondFighter health " + secondFighter.health);
            if(secondFighter.health <=0) break;
            if(firstFighter.health <=0) break;
        }
        System.out.println("firstFighter health is now= " + firstFighter.health);
        System.out.println("secondFighter health is now= " + secondFighter.health);
        String winner = "";
        winner = firstFighter.health > secondFighter.health ? firstFighter.name : secondFighter.name;
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("The Winner is " + winner);
        return winner;


    }

    public class Fighter {
        public String name;
        public int health, damagePerAttack;
        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }
}
