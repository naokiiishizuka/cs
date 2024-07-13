package csMiddle.object.bankaccount;

class BankAccount {
    private final String bankName;
    private final String ownerName;
    private int savings;

    public BankAccount(String bankName, String ownerName, int savings) {
        this.bankName = bankName;
        this.ownerName = ownerName;
        this.savings = savings;
    }

    public int depositMoney(int depositAmount) {
        if (savings < 20000) {
            savings -= 100;
        }
        savings += depositAmount;
        return savings;
    }

    public int withdrawMoney(int withdrawAmount) {
        if(savings * 0.2 < withdrawAmount) savings *= 0.8;
        else savings -= withdrawAmount;
        return savings;
    }

    public double pastime(int days) {
        return savings + 0.25 * days;
    }
}

class MyClass{
    public static void main(String[] args){
        BankAccount user1 = new BankAccount("Chase", "Claire Simmmons", 30000);
        System.out.println(user1.withdrawMoney(2000));
        System.out.println(user1.depositMoney(10000));
        System.out.println(user1.pastime(93));

        BankAccount user2 = new BankAccount("Bank Of America", "Remy Clay", 10000);
        System.out.println(user2.withdrawMoney(5000));
        System.out.println(user2.depositMoney(12000));
        System.out.println(user2.pastime(505));
    }
}
