package character;

import enums.LocationState;
import enums.PhysicalState;

public class NightmareCreatures extends Character{

    public NightmareCreatures(PhysicalState physical){
        super("Кошмарные существа", LocationState.UNDERWATERWORLD, physical);
        System.out.println("Кошмарные существа появились");
    }

    public void showDescription() {
        System.out.println(getName() + " - горы зловонной, изрыгающей слизь протоплазмы, покорившие подводный мир и направившие посланцев на сушу");
    }
}
