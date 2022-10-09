import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Komala("Bibich", 1));
        Pokemon p2 = new Pokemon("Хищник", 1);
        b.addFoe(p2);
        b.go();
    }
}