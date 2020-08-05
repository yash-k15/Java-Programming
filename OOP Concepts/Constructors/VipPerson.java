public class VipPerson {

    private String name;
    private double creditLimit;
    private String emailAddress;
    
    // Constructor to create a default VIP user
    public VipPerson() {
        this("Default Name", 5000.0, "default@email.com" );
    }
    
    // Constructor to create a VIP person with no email address
    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }
    
    // Constructor to create a VIP person with all parameters
    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    
    // Getters for every variable
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
