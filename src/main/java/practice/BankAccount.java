package practice;

public class BankAccount { // пополнение и списание происходит без комиссии
  protected double amount = 0 ; //заполн. карты

  public double getAmount() {
    return amount;
  }

  public void put(double amountToPut) {
    // метод зачисляет деньги на счет
    if (amountToPut >= 0) {
      amount += amountToPut;
    }
  }

  public void take(double amountToTake) {
    // метод списывает деньги со счета
    if (amountToTake <= amount) {
      amount -= amountToTake;
    }
  }
}
