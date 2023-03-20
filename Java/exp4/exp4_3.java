class Account {
  String name;
  double amount;

  Account(String n, double a) {
    name = n;
    amount = a;
  }

  void deposit(double a) {
    amount += a;
  }

  void withdraw(double a) {
    amount -= a;
    System.out.println("Balance = " + amount);
  }
}

class SavingsAccount extends Account {
  double interest;

  SavingsAccount(String name, double amm) {
    super(name, amm);
    interest = 2.5;
  }

  void addInterest() {
    super.amount = super.amount + super.amount * interest / 100;
  }
}

class CurrentAccount extends Account {
  double limit;

  CurrentAccount(String name, double amm) {
    super(name, amm);
    limit = 10000;
  }

  void deposit(double a) {
    amount += a;
    // checkOverdraft();
    System.out.println("Balance = " + amount);
  }

  void withdraw(double a) {
    amount -= a;
    // checkOverdraft();
    System.out.println("Balance = " + amount);
  }

  void checkOverdraft() {
    if (amount > limit || amount < 0) {
      System.out.println("Overdraft limit reached.");
    }
  }
}

class Bank {
  Account arr[] = new Account[10];

  void update() {
    System.out.println("Account Details");
    for (Account act : arr) {
      if (act == null)
        continue;
      System.out.println("Name:" + act.name);
      if (act instanceof SavingsAccount) {
        SavingsAccount savings_account = ((SavingsAccount) act);
        savings_account.addInterest();
      } else if (act instanceof CurrentAccount) {
        CurrentAccount current_account = ((CurrentAccount) act);
        current_account.checkOverdraft();
      }
      System.out.println("Balance:" + act.amount);
    }
  }

  void initialize() {
    arr[0] = new Account("Harshit", 2000);
    arr[1] = (Account) new SavingsAccount("Shubham", 2500);
    arr[2] = new CurrentAccount("Aditya", 3000);
    // SavingsAccount a = (SavingsAccount) arr[1];
    CurrentAccount b = (CurrentAccount) arr[2];
    System.out.println("At Initialization: ");
    for (int i = 0; i < 3; i++) {
      System.out.println(arr[i].name);
      System.out.println(arr[i].amount);
    }
    // System.out.println(arr[1].name);
    // a.addInterest();
    // System.out.println(a.amount);
    b.deposit(5000);
    b.withdraw(15000);
  }

  public static void main(String[] args) {
    Bank b = new Bank();
    b.initialize();
    b.update();
  }
}