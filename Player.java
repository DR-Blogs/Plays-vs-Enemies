/****************************************************************************************************
Homework 6: Player VS Enemy
Program By: Dylan Raguseo
File Name: Player.java
Function: This program creates player and enemy combatants
******************************************************************************************************/

import java.util.Scanner;

public class Player {

    // Create fields
    private String name;
    private int health;
    private int damage;
    private int defense;

    // Default Constructor
    public Player() {
        name = "Undefined";
        health = 100;
        damage = 1;
        defense = 1;
    }

    // Constructor with parameters
    public Player(String name, int health, int damage, int defense) {
        this.name = (!name.isBlank()) ? name : "Undefined";
        this.health = (health > 0 && health < 101) ? health : 100;
        this.damage = (damage > 0 && damage < 101) ? damage : 1;
        this.defense = (defense > 0 && defense < 101) ? defense : 1;
    }
 
    /* Setters and Getters for each field */
    // Name
    public void setName(String name) {
        this.name = (!name.isBlank()) ? name : "Undefined";
    }

    public String getName() {
        return name;
    }
    // Health
    public void setHealth(int health) {
        this.health = (health > 0 && health < 101) ? health : 100;
    }

    public int getHealth() {
        return health;
    }
    // Damage
    public void setDamage(int damage) {
        this.damage = (damage > 0 && damage < 101) ? damage : 1;
    }

    public int getDamage() {
        return damage;
    }
    // Defense
    public void setDefense(int defense) {
        this.defense = (defense > 0 && defense < 101) ? defense : 1;
    }

    public int getDefense() {
        return defense;
    }

    // Create character
    public void characterCreate() {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter your player`s name:");
            setName(scanner.nextLine());
        
        try {
            System.out.println("Please enter your player`s health:");
            setHealth(Integer.parseInt(scanner.nextLine()));

            System.out.println("Please enter your player`s damage:");
            setDamage(Integer.parseInt(scanner.nextLine()));

            System.out.println("Please enter your player`s defense:");
            setDefense(Integer.parseInt(scanner.nextLine()));

            System.out.println("Your Player has been saved with the following information:");
            System.out.println("Name: " + getName());
            System.out.println("Health: " + getHealth());
            System.out.println("Damage: " + getDamage());
            System.out.println("Defense: " + getDefense());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.\n Try again.");
            characterCreate();  // Restart character Create
        }
    }
}
