package character;

import enums.LocationState;
import enums.PhysicalState;
import interfaces.Goodable;

import java.util.Objects;

public class Penguins extends Character implements Goodable {
    public Penguins(String name, LocationState location, PhysicalState physical) {
        super(name, location, physical);
    }

    @Override
    public void makeGoodThings(Character character) {
        System.out.println(getName() + " оказали помощь " + character.getName());
    }

    private void polish() {
        System.out.println(getName() + " отполировали пол до блеска");
    }
    private class Nest {
        public Nest(LocationState location, int amountOfPenguins) {
            this.location = location;
            this.amountOfPenguins = amountOfPenguins;
        }
        private final LocationState location;

        private final int  amountOfPenguins;

        @Override
        public String toString() {
            return "Nest{" +
                    "location=" + location +
                    ", amountOfPenguins=" + amountOfPenguins +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Nest nest = (Nest) o;
            return amountOfPenguins == nest.amountOfPenguins && location == nest.location;
        }

        @Override
        public int hashCode() {
            return Objects.hash(location, amountOfPenguins);
        }
    }

    public class Floor{
        private boolean floorPolish;

        public boolean isFloorPolish() {
            return floorPolish;
        }

        public void setFloorPolish(boolean floorPolish) {
            this.floorPolish = floorPolish;
        }

        public void polish() {
            setFloorPolish(true);
            Penguins.this.polish();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Floor floor = (Floor) o;
            return floorPolish == floor.floorPolish;
        }

        @Override
        public int hashCode() {
            return Objects.hash(floorPolish);
        }

        @Override
        public String toString() {
            return "Floor{" +
                    "floorPolish=" + floorPolish +
                    '}';
        }
    }

    public void scream(Character character){
        System.out.println(getName() + " кричали на " + character.getName());
    }

    public void click(LocationState location){
        Nest nest = new Nest(location, 9);
        if (nest.location == LocationState.DEFAULT) {
            System.out.println(getName() + " щелкали клювами так как охраняли гнездо c " + nest.amountOfPenguins + " пингвинами");
        }
    }

    @Override
    public String toString() {
        return "Penguins{ " + "name = " + getName() +
                "; location = " + getLocation() +
                "; physical state = " + getPhysical() +
                "; condition state = " + getCondition() +
                " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Penguins penguins = (Penguins) obj;
        return (this.getName()).equals(penguins.getName())
                && (this.getLocation()).equals(penguins.getLocation())
                && (this.getCondition()).equals(penguins.getCondition())
                && (this.getPhysical()).equals(penguins.getPhysical());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getPhysical(), this.getLocation(), this.getCondition());
    }
}
