class Bank {
    int balance = 5000;

    void withdraw(int amount) {
        try {
            if (amount > balance) {
                throw new ArithmeticException("Insufficient Balance");
            }

            balance = balance - amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Bank b = new Bank();

        b.withdraw(2000);
        b.withdraw(5000);
    }
}

