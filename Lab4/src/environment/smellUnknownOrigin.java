package environment;

public class SmellUnknownOrigin extends Environment {

    public SmellUnknownOrigin(String name) {
        super(name);
    }

    public static class FormerSmell {
        private boolean ousted;
        private final String name;

        public boolean isOusted() {
            return ousted;
        }

        public void setOusted(boolean ousted) {
            this.ousted = ousted;
        }

        public String getName() {
            return name;
        }

        public FormerSmell(String name) {
            this.name = name;
            this.ousted = false;
        }
    }

    @Override
    public void appear() {
        setExists(true);
        System.out.println("Появился " + getName());
    }

    public void pushedOut(FormerSmell formerSmell) {
        formerSmell.setOusted(true);
        System.out.println(getName() + " вытеснил " + formerSmell.getName());
    }

    public void checkStanding() {
        if (isExists()) {
            System.out.println("В возздухе висел " + getName());
        }
    }
}
