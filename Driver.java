/****************************************************************************************************
Homework 6: Player VS Enemy
Program By: Dylan Raguseo
File Name: Driver.java
Function: This program creates player and enemy combatants
******************************************************************************************************/

public class Driver {
    public static void main(String[] args) {
        // Create instances 
        Player player = new Player();
        Enemy enemy = new Enemy();

        // Print title
        System.out.println("Player VS Enemy!");

        // Call characterCreate method for player and enemy
        player.characterCreate();
        enemy.characterCreate();

    }
}
