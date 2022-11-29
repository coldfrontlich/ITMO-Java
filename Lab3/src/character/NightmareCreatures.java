package character;

import enums.LocationState;
import enums.PhysicalState;

import java.util.Objects;

public class NightmareCreatures extends Character{

    public NightmareCreatures(PhysicalState physical){
        super("Кошмарные существа", LocationState.UNDERWATERWORLD, physical);
        System.out.println("Кошмарные существа появились");
    }

    public void showDescription() {
        System.out.println(getName() + " - горы зловонной, изрыгающей слизь протоплазмы, покорившие подводный мир и направившие посланцев на сушу");
    }

    @Override
    public String toString() {
        return "NightmareCreatures{ " + "name = " + getName() +
                "; location = " + getLocation() +
                "; physical state = " + getPhysical() +
                " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        NightmareCreatures nightmareCreatures = (NightmareCreatures) obj;
        return (this.getName()).equals(nightmareCreatures.getName())
                && (this.getLocation()).equals(nightmareCreatures.getLocation())
                && (this.getPhysical()).equals(nightmareCreatures.getPhysical());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getPhysical(), this.getLocation());
    }
}
