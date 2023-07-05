package practice;
import java.time.LocalDate;

public class DepositAccount extends BankAccount { //депозитный расчётный счёт
    // нельзя снимать деньги в течение одного месяца после последнего пополнения.
    private LocalDate lastIncome; // Переменная, в которой хранится дата последнего внесения

    @Override
    public void put(double amountToPut) {// метод зачисляет деньги на счет
        super.put(amountToPut);
        lastIncome = LocalDate.now();
    }

    @Override
    public void take(double amountToTake) {// метод списывает деньги со счета
        if (LocalDate.now().isAfter(lastIncome.plusMonths(1))) {
            super.take(amountToTake);
        } else {

        }
    }
}
