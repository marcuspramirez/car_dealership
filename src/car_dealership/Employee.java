package car_dealership;

public class Employee {

    String name;
    String role;


    public void runCreditHistory(Customer cust, double dollarAmount){
        System.out.println("Checking Credit History... ");
    }

    public void processTransaction(Customer cust, Vehicle vehicle){
        System.out.println("Processing Transaction... ");
    }

    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle){
        if(finance){
            runCreditHistory(cust, 10000);
        } else if (vehicle.getPrice() <= cust.getCashOnHand()){
            processTransaction(cust, vehicle);
        } else {
            System.out.println("Bring back more money! ");
        }
    }

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
