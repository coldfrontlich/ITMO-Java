//32571
import exceptions.BounsweetException;
import exceptions.KomalaException;
import exceptions.MurkrowException;
import ru.ifmo.se.pokemon.*;
import pokemons.*;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        ArrayList<Pokemon> pokemonsInBattle = new ArrayList<>();
        int[] pokemonsExistArray = new int[]{0, 0, 0, 0};
        try {
            Honchkrow p1 = new Honchkrow("Bibich", -1);
            b.addAlly(p1);
            pokemonsInBattle.add(p1);
            pokemonsExistArray[0] = 1;
        } catch (MurkrowException e) {
            System.out.println("Honchkrow не может участвовать в бою");
        }

        try {
            Bounsweet p2 = new Bounsweet("Bubech", -1);
            b.addFoe(p2);
            pokemonsInBattle.add(p2);
            pokemonsExistArray[1] = 1;
        } catch (BounsweetException e) {
            System.out.println("Bounsweet не может участвовать в бою");
        }

        try {
            Tsareena p3 = new Tsareena("Jesus", -1);
            b.addAlly(p3);
            pokemonsInBattle.add(p3);
            pokemonsExistArray[2] = 1;
        } catch (BounsweetException e) {
            System.out.println("Tsareena не может участвовать в бою");
        }

        try {
            Komala p4 = new Komala("Jake", -1);
            b.addFoe(p4);
            pokemonsInBattle.add(p4);
            pokemonsExistArray[3] = 1;
        } catch (KomalaException e) {
            System.out.println("Komala не может участвовать в бою");
        }

        if(pokemonsInBattle.size() == 0) {
            System.out.println("Никто из покемонов не готов к бою!");
        } else if (pokemonsInBattle.size() == 1) {
            System.out.println("У покемона нет соперника!");
        } else if (((pokemonsExistArray[0] == 1 && pokemonsExistArray[2] == 1) && (pokemonsExistArray[1] != 1 && pokemonsExistArray[3] != 1))
                || ((pokemonsExistArray[1] == 1 && pokemonsExistArray[3] == 1) && (pokemonsExistArray[0] != 1 && pokemonsExistArray[2] != 1))){
            System.out.println("Покемоны в одной команде");
        } else {
            b.go();
        }
    }
}