package character;

import enums.LocationState;
import enums.PhysicalState;
import interfaces.Goodable;

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
}
