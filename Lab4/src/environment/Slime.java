package environment;

import character.Ancient;

public class Slime extends Environment {
    private Ancient owner;

    public Ancient getOwner() {
        return owner;
    }

    public void setOwner(Ancient owner) {
        this.owner = owner;
    }

    public Slime(String name, Ancient owner) {
        super(name);
        this.owner = owner;
    }

    @Override
    public void appear() {
        setExists(true);
        System.out.println(getName() + " плотно обволакивает " + owner.getAmount() + " мертвых тела " + owner.getName());
    }

    public void giveOffOdor(Environment environment) {
        if (environment instanceof SmellUnknownOrigin) {
            System.out.println(getName() + " и являлась источником " + environment.getName());
        }
    }
}
