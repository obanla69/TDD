public class AccessBank {
    int deposit;
    private int  accountNumber;
    private double balance;
    private String customerAccount;
    private String name;
    private int pin;

    public AccessBank(String name,int pin,int balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getpin() {
        return pin;
    }
    public void setPin(int pin){
        this.pin = pin;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public String addContact(String addContact) {
        return addContact;
    }
}
