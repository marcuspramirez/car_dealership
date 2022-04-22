package car_dealership;

public class Customer {

    private String name;
    private String address;
    private double cashOnHand;
    private int creditScore;

    public Customer(String name, String address, double cashOnHand, int creditScore) {
        this.name = name;
        this.address = address;
        this.cashOnHand = cashOnHand;
        this.creditScore = creditScore;

    }

    public void enterDealership(Customer customer){
        System.out.println(customer.name + " ENTERS THE DEALERSHIP");
    }

    public void purchaseCar(Vehicle vehicle, Employee emp, Boolean finance){
        System.out.println("Hi " + emp.name + " I'm looking to purchase a car! " + "I like the look of that " + vehicle.make );

        if(vehicle.color.equals("Red")) {
            System.out.println("I like that it's red!");
        } else{
            System.out.println("I wish it were red though!");
        }

    }

    public void financeOrNot(Customer customer, boolean finance){

        if(finance){
            System.out.println("I'm looking to finance, my credit score is " + creditScore);
        } else {
            System.out.println("I don't plan on financing... ");
        }
    }


    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }



}
