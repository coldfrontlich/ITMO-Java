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
    public class Nest {
        public Nest(LocationState location) {
            this.location = location;
        }
        private LocationState location;

        public LocationState getLocation() {
            return location;
        }

        public void setLocation(LocationState location) {
            this.location = location;
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
    }

    public void scream(Character character){
        System.out.println(getName() + " кричали на " + character.getName());
    }

    public void click(LocationState location){
        Nest nest = new Nest(location);
        if (nest.getLocation() == LocationState.DEFAULT) {
            System.out.println(getName() + " щелкали клювами так как охраняли гнездо ");
        }
    }
}
