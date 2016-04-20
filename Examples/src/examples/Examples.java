package examples;

public class Examples {

    public static void main(String[] args) {
        //This is the main arena
        Pokemon poke1= new Pidgey(5, 5, 10);
        Pokemon poke2= new Pidgey(2, 7, 10);
        Battlefield test = new Battlefield(poke1, poke2);
    }    
}
