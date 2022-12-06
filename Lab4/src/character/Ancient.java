package character;

import enums.LocationState;
import enums.PhysicalState;
import exceptions.AmountException;

import java.util.Objects;

public class Ancient extends Character{

    private int amount;
    private boolean withoutHeads;

    public boolean isWithoutHeads() {
        return withoutHeads;
    }

    public void setWithoutHeads(boolean withoutHeads) {
        this.withoutHeads = withoutHeads;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) throws AmountException {
        if (amount <= 1) {
            throw new AmountException(amount);
        }
        this.amount = amount;
    }



    private boolean reliefOK;

    public boolean isReliefOK() {
        return reliefOK;
    }

    public void setReliefOK(boolean reliefOK) {
        this.reliefOK = reliefOK;
    }
    public Ancient( LocationState location, PhysicalState physical, boolean withoutHeads) {
        super("Старцы", location, physical);
        this.amount = 4;
        reliefOK = true;
        System.out.println(getName() + " появились");
    }


    @Override
    public String toString() {
        return "Ancient{ " + "name = " + getName() +
                "; location = " + getLocation() +
                "; physical state = " + getPhysical() +
                "; condition state = " + getCondition() +
                "; reliefOK = " + isReliefOK() +
                "; amount = " + isReliefOK() +
                " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Ancient ancient = (Ancient) obj;
        return (this.getName()).equals(ancient.getName())
                && (this.getLocation()).equals(ancient.getLocation())
                && (this.getPhysical()).equals(ancient.getPhysical())
                && (this.getCondition()).equals(ancient.getCondition())
                && (this.isReliefOK() == (ancient.isReliefOK()))
                && (this.getAmount() == (ancient.getAmount()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getPhysical(), this.getLocation(), this.isReliefOK(), this.getCondition(), this.getAmount());
    }
}
