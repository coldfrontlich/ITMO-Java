//32571
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Honchkrow("Bibich", 2));
        b.addAlly(new Murkrow("Bubech", 1));
        b.addFoe(new Tsareena("Jesus", 3));
        b.addFoe(new Murkrow("Jake", 3));
        b.go();
    }
}