package examples;

class Battlefield {
    public Battlefield(Pokemon poke1, Pokemon poke2){
        System.out.println("Welcomet to the battlefield");
        System.out.println("We have as Poke1: A " + poke1.getLevel() + " " + poke1.name);
        System.out.println("We have as Poke2: A " + poke2.getLevel() + " " + poke2.name);
        System.out.println("Pokemon 1 now has: " + poke1.getHP());
        System.out.println("Pokemon 2 now has: " + poke2.getHP());

        while( poke1.getHP()>0 && poke2.getHP()>0 ) {
            int damage1to2, damage2to1;
            
            damage1to2 = (int) Math.ceil((double) (poke1.getAttack()*3 / poke2.getDefense()))*poke1.getAttack();
            damage2to1 = (int) Math.ceil((double) (poke2.getAttack()*3 / poke1.getDefense()))*poke2.getAttack();
            
            System.out.println("Pokemon 1 deals: " + damage1to2 );
            System.out.println("Pokemon 2 deals: " + damage2to1 );
            poke1.recieveDamage(damage2to1);
            poke2.recieveDamage(damage1to2);
            
            System.out.println("Pokemon 1 now has: " + poke1.getHP());
            System.out.println("Pokemon 2 now has: " + poke2.getHP());
        }
        if (poke1.getHP() > 0){
            System.out.println("Poke1 wins!");
        }
        if (poke2.getHP() > 0){
            System.out.println("Poke2 wins!");
        }
    }
}
