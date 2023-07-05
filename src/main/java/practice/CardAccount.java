package practice;

public class CardAccount extends BankAccount { // карточный счёт, в дополнение к условиям BankAccount
    private double commission = 0.01; // при снятии денег должна взиматься комиссия 1% от суммы списания.

    public CardAccount(double amount) {
        super(amount);
    }

    @Override
    public void take(double amountToTake) {
        super.take(amountToTake);
        amount = amount - (amountToTake * commission);
    }
}
