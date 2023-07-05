package practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount { //депозитный расчётный счёт
    // нельзя снимать деньги в течение одного месяца после последнего пополнения.
    private LocalDate lastIncome; // Переменная, в которой хранится дата последнего внесения

    public DepositAccount(double amount) {
        super(amount);
    }

    @Override
    public void put(double amountToPut) {// метод зачисляет деньги на счет
        super.put(amountToPut);
        lastIncome = LocalDate.now();
    }

    @Override
    public void take(double amountToTake) {// метод списывает деньги со счета
        long diff = ChronoUnit.MONTHS.between(LocalDate.now(), lastIncome);

        if (diff <= 1) {
            amount = amount + 0;
        } else {
            super.take(amountToTake);
        }
    }
}
