public class BankDetail {
    private String name;
    private String mobileNumber;
    private double balance;
    private String email;
    private String citizenshipNumber;
    private String accountType; // "Saving" or "Current"
    private String province;
    // Constructor
    public BankDetail(String name, String mobileNumber, double balance, String email,
                      String citizenshipNumber, String accountType, String province) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.balance = balance;
        this.email = email;
        this.citizenshipNumber = citizenshipNumber;
        this.accountType = accountType;
        this.province = province;
    }
    // Getters and toString method for displaying details
    @Override
    public String toString() {
        return "Name: " + name + ", Mobile: " + mobileNumber + ", Balance: " + balance +
                ", Email: " + email + ", Citizenship: " + citizenshipNumber +
                ", Account Type: " + accountType + ", Province: " + province;
    }
}
