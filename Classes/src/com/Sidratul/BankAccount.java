package  com.Sidratul;
public class BankAccount {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phone;

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone(int phone){
        this.phone = phone;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public int getPhone(){
        return this.phone;
    }

    public double depositeFund(double money){
        this.balance = this.balance + money;
        System.out.println("Deposit of " + money + " made. " + "New balance " +balance);
        return this.balance;
    }
    public void withdrawFund(double money){
        if(this.balance >= money){
             this.balance = this.balance - money;
            System.out.println("Withdraw of " + money + " proceed. " + "Remaining balance " + balance);
        }else System.out.println("only " + balance + " avaliable. Withdraw not proceed");
    }

}
