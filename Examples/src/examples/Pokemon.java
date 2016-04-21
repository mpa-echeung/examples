package examples;

import java.util.Random;

abstract class Pokemon {
    private int attack, defense, HP, speed;
    private int level;
    private String type;
    protected String name;

    public int getAttack() {
        return attack;
    }

    public int getSpeed() {
        return speed;
    }
    
    public int getDefense() {
        return defense;
    }

    public int getLevel() {
        return level;
    }
    
    public Pokemon(int attack,int defense, int level, String type){
        this.attack = attack;
        this.defense = defense;
        this.level = level;
        this.type = type;
        this.speed = level;
        this.HP = level + (defense * defense);
    }
   
    public String damageType(){
        Random RNG = new Random();
        int choice = RNG.nextInt(2);
        System.out.println(choice);
        if (choice == 0){
            return this.type;
        } 
        else {
            return "Normal";
        }
    }
    
    public String getType(){
        return this.type;
    }
    
    public void recieveDamage(int amount){
        this.HP = this.HP - amount;
    }
    
    public int getHP(){
        return this.HP;
    }
   
    public boolean checkValid(){
        if ((attack > level) && (defense > level) && (HP > level)){
            return false;
        }
        else {
            return true;
        }
    }
}