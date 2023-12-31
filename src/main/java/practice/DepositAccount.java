package practice;
import java.time.LocalDate;

public class DepositAccount extends BankAccount { //депозитный расчётный счёт
    private LocalDate lastIncome; // Переменная, в которой хранится дата последнего внесения

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
        lastIncome = LocalDate.now();
    }

    @Override
    public void take(double amountToTake) {
        // нельзя снимать деньги в течение одного месяца после последнего пополнения
        if (LocalDate.now().isAfter(lastIncome.plusMonths(1))) {
            super.take(amountToTake);
        }
    }
}
