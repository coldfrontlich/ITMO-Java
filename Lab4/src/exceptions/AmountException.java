package exceptions;

public class AmountException extends RuntimeException{
    private int amount;

    public int getAmount() {
        return this.amount;
    }

    public AmountException(int amount) {
        super("Нельзя установить количество меньше 2");
        this.amount = 2;
    }


}
