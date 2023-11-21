/****************************************************************************************************
Homework 6: Player VS Enemy
Program By: Dylan Raguseo
File Name: Enemy.java
Function: This program creates player and enemy combatants
******************************************************************************************************/

import java.util.Scanner;

public class Enemy extends Player {
    private String type;

    // Default Constructor
    public Enemy() {
        super();
        this.type = "Undefined";
    }

    // Constructor with parameters
    public Enemy(String name, String type) {
        super(name, 0, 0, 0);
        setType(type);
        setEnemyStatsBasedOnType();
    }

    /* Setters and Getters for each new field */
    // Type
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    // Override characterCreate() to create enemy
    @Override
    public void characterCreate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your enemy`s name:");
        setName(scanner.nextLine());

        try {
            System.out.println("Please enter your enemy`s type (Minion/Brawler/Elite):");
            setType(scanner.nextLine());

            setEnemyStatsBasedOnType();

            System.out.println("Your Enemy has been saved with the following information:");
            System.out.println("Name: " + getName());
            System.out.println("Health: " + getHealth());
            System.out.println("Damage: " + getDamage());
            System.out.println("Defense: " + getDefense());
            System.out.println("Type: " + getType());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid enemy type entered. \nTry again.");
            characterCreate();  // recreate enemy
        }
        finally {
            scanner.close();  // Clean up scanner
        }
    }

    // Set fields based on enemy type
    private void setEnemyStatsBasedOnType() {
        switch (type.toLowerCase()) {
            case "minion":
                setHealth(10);
                setDamage(2);
                setDefense(1);
                break;
            case "brawler":
                setHealth(30);
                setDamage(10);
                setDefense(5);
                break;
            case "elite":
                setHealth(100);
                setDamage(20);
                setDefense(20);
                break;
            default:
                throw new IllegalArgumentException("Invalid enemy type.");
        }
    }
}
