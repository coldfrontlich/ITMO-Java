//32571
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Honchkrow("Bibich", 1));
        b.addAlly(new Bounsweet("Bubech", 3));
        b.addFoe(new Tsareena("Jesus", 4));
        b.addFoe(new Komala("Jake", 3));
        b.go();
    }
}