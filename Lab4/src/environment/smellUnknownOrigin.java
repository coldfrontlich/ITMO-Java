package environment;

import java.util.Objects;

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

        @Override
        public String toString() {
            return "FormerSmell{" +
                    "ousted=" + ousted +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FormerSmell formerSmell = (FormerSmell) o;
            return ousted == formerSmell.ousted && Objects.equals(name, formerSmell.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(ousted, name);
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
            System.out.println("В воздухе висел " + getName());
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.isExists());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        SmellUnknownOrigin smellUnknownOrigin = (SmellUnknownOrigin) obj;
        return (this.getName()).equals(smellUnknownOrigin.getName())
                && ((this.isExists()) == (smellUnknownOrigin.isExists()));
    }

    @Override
    public String toString() {
        return "SmellUnknownOrigin{ " + "name = " + getName() +
                "; Exists = " + isExists() +
                " }";
    }
}
