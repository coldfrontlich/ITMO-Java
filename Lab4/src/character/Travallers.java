package character;

import enums.ConditonState;
import enums.LocationState;
import enums.PhysicalState;
import environment.Environment;
import environment.WhiteSteam;
import exceptions.ExamineRemainsException;
import exceptions.FarewellException;
import interfaces.Goodable;

import java.util.Objects;

public class Travallers extends Character implements Goodable {

    public Travallers(String name, LocationState location, PhysicalState physical) {
        super(name, location, physical);
        System.out.println(getName() + " появились");
    }


    public void hear(Character character) {
        System.out.println(getName() + " расслышали " + character.getName());
    }

    public void rushAway() {
        System.out.println(getName() + " со всех ног неслись прочь");
    }

    public void runThrough(LocationState state) {
        setLocation(state);
        if (getLocation() == LocationState.DEFAULT) {
            System.out.println(getName() + " пробегаем");
        } else if (getLocation() == LocationState.GALLERY) {
            System.out.println(getName() + " пробегаем по галерее");
        } else if (getLocation() == LocationState.UNDERWATERWORLD) {
            System.out.println(getName() + " проплываем по подводному миру");
        } else if (getLocation() == LocationState.PEAK) {
            System.out.println(getName() + " карабкаются в сторону вершины");
        }
    }

    public void checkCover() {
        if (getLocation() == LocationState.GALLERY) {
            System.out.println("В галерее невозможно укрыться");
        } else {
            System.out.println("Можно укрыться");
        }
    }

    public void knowHow(Character character) {
        System.out.println(getName() + " знали как быстро " + character.getName() + " перемещаются в пространстве");
    }

    public void hope() {
        System.out.println(getName() + " смутно надеялись");
    }

    public void useFlashlights(Environment environment) {
        if (environment instanceof WhiteSteam) {
            if (environment.isExists()) {
                System.out.println("Лучи фонариков рассеивают облако пара");
            } else {
                System.out.println("Лучи фонариков никак не помогли");
            }
        } else {
            System.out.println(getName() + " освещаем фонарями путь");
        }
    }

    public void look(Character character) {
        if (character instanceof Pursuer) {
            if (character.getPhysical() == PhysicalState.INJURED) {
                System.out.println(getName() + " не решились посмотреть");
            }
        } if (character instanceof Ancient) {
            Ancient ancient = (Ancient) character;
            System.out.println(getName() + " увидели " + ancient.getAmount() + " мертвых звездоголовых");
        } else {
            System.out.println(getName() + " не осмеялись взглянуть на " + character.getName());
        }
    }

    public void regret(Character character) {
        System.out.println("Жалко оставлять " + character.getName() + " на верную смерть");
    }

    public void examineRemains(Ancient ancient) throws ExamineRemainsException {
        if (ancient.isWithoutHeads()) {
            System.out.println(getName() + " увидели изуродованные останки тел без голов");
        } else {
            throw new ExamineRemainsException("Исследуя останки путешественники могли найти только звездоголовых без головы");
        }
    }

    public void climb(Environment environment) {
        System.out.println(getName() + " карабкаются в сторону " + environment.getName());
    }


    public void farewell() throws FarewellException {
        if (getLocation() == LocationState.PEAK) {
            System.out.println(getName() + " прощаются с городом");
        } else {
            throw new FarewellException("Путешественники не могут прощаться с городом не с вершины");
        }
    }



    @Override
    public String toString() {
        return "Travallers{ " + "name = " + getName() +
                "; location = " + getLocation() +
                "; physical state = " + getPhysical() +
                "; condition state = " + getCondition() +
                " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Travallers travallers = (Travallers) obj;
        return (this.getName()).equals(travallers.getName())
                && (this.getLocation()).equals(travallers.getLocation())
                && (this.getCondition()).equals(travallers.getCondition())
                && (this.getPhysical()).equals(travallers.getPhysical());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getPhysical(), this.getLocation(), this.getCondition());
    }

    @Override
    public void makeGoodThings(Character character) {
        if (character instanceof Pursuer) {
            Pursuer pursuer = (Pursuer) character;
            pursuer.setCondition(ConditonState.CURIOSITY);
            System.out.println(pursuer.getName() + " - проявление любознательности");
        } else {
            character.setCondition(ConditonState.GOODINTENSIONS);
            System.out.println(character.getName() + " - с добрыми намерениями");
        }
    }
}
