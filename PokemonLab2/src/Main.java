//32571
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Komala("Bibich", 1));
        b.addFoe(new Bounsweet("Jesus", 100));
        b.go();
    }
}