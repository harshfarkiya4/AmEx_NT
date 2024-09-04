class Account{
    Double bankBalance;
    String name;
    public Account(String name ,Double initialBalance){
        bankBalance = initialBalance;
        this.name = name;
    }
    Double credit(Double amount){
        bankBalance += amount;
        return bankBalance;
    }
    Double debit(Double amount){
        if(bankBalance >= amount){
            bankBalance -= amount;
        }
        else{
            System.out.println("Insufficient Funds in Account");
        }
        return bankBalance;
    }
    public void transferTo(Account toTransfer, Double amount){
        this.debit(amount);
        toTransfer.credit(amount);
    }

    public static void main(String args[]){
        Account harshAccount = new Account("Harsh Farkiya",100.0);
        Account sagarAccount = new Account("Sagar", 1000.0);
        System.out.println(harshAccount.bankBalance);
        System.out.println(sagarAccount.bankBalance);
        harshAccount.transferTo(sagarAccount,20.0);
        System.out.println(harshAccount.bankBalance);
        System.out.println(sagarAccount.bankBalance);
    }
}