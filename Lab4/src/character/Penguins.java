package character;

import enums.LocationState;
import enums.PhysicalState;

public class Penguins extends Character{
    public Penguins(String name, LocationState location, PhysicalState physical) {
        super(name, location, physical);
    }
    private class Nest {
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
