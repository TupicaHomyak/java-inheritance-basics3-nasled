package practice;

public class BankAccount { // пополнение и списание происходит без комиссии
  protected double amount; //заполненность карты

  public BankAccount(double amount) {
    this.amount = amount;
  }

  public double getAmount() {
    // верните значение количества денег не счету
    return amount;
  }

  public void put(double amountToPut) {
    // метод зачисляет деньги на счет
    if (amountToPut < 0) { // Если передать в метод пополнения отрицательное значение,
      amount = amount + 0; // сумма на счёте не должна измениться.
    }
    amount += amountToPut;
  }

  public void take(double amountToTake) {
    // метод списывает деньги со счета
    if (amountToTake > amount) {// При попытке снять большую сумму, чем есть на счёте,
      amount = amount + 0;// сумма не списывается со счёта, сумма на счёте не изменяется.
    }
    amount -= amountToTake;
  }
}
