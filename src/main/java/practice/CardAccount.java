package practice;

public class CardAccount extends BankAccount { // карточный счёт, в дополнение к условиям BankAccount
    private double commission = 0.01; // при снятии денег должна взиматься комиссия 1% от суммы списания.

    @Override
    public void take(double amountToTake) {
        amountToTake = amountToTake + (amountToTake * commission);
        super.take(amountToTake);
    }
}
