public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;
    
    // Empty Constructor to create a temporary person with a fix balance
    public Account() {
        this("00000", 100, "Temp Worker", "Temp Email", "Temp Phone no.");
        System.out.println("Temporary Account created");
    }
    
    // Constructor to create a temporary person along with the personal details
    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999", 100, customerName, customerEmailAddress, customerPhoneNumber);
        System.out.println("Temp Worker with info created");
    }
    
    // Constructor when all the parameters are passed
    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }
    
    // Method to deposit money
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. \nNew balance = " + this.balance);
    }
    
    // Method to withdraw money
    public void withdrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount < 0)
            System.out.println("Only " + this.balance + " available, cannot withdraw");
        
        else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed." + "\nNew Balance = " + this.balance);
        }
    }
    
    // Getters for every variable
    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }
    
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
    
}
