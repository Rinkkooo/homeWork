public class Main {
    public static void main(String[] args) throws LimitException{
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(8000);
        System.out.println(bankAccount.getAmount());
        while (true) {
            try {
                bankAccount.withDraw(6000);
                System.out.println(bankAccount.getAmount());
            } catch (LimitException le) {
                System.out.println("Недостаточно средств");
                System.out.println("Остаток на счете: " + bankAccount.getAmount());
                while (bankAccount.getAmount() > 0) {
                    System.out.println("Снято: " + bankAccount.getAmount());
                    bankAccount.withDraw((int) bankAccount.getAmount());
                    System.out.println("Остаток на счете: " + bankAccount.getAmount());

                    
                }
                break;
            }
        }
    }
}