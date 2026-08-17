package cn.kuinn.university;

public class AccountEncapsulation {
    private String name;
    private double balance;
    private String password;

    public AccountEncapsulation() {
    }

    public AccountEncapsulation(String name, double balance, String password) {
        setName(name);
        setBalance(balance);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public String info(){
        return "Name: " + name + ", Balance: " + balance + ", Password: " + password;
    }

    public void setName(String name) {
        if(name != null && name.length() >= 2 && name.length() <=4){
            this.name = name;
        }else{
            System.out.println("Name length should be between 2 and 4 characters. default name is jack");
            this.name = "jack";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20.0){
            this.balance = balance;
        }else{
            System.out.println("Balance should be greater than 20.0. default balance is 0.0");
            this.balance = 0.0;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password != null && password.length() == 6){
            this.password = password;
        }else{
            System.out.println("Password should be between 6 digits. default password is 123456");
            this.password = "123456";
        }
    }
}