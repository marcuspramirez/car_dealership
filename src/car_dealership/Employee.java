package car_dealership;

public class Employee {

    String name;
    String role;


    public void chooseBestCustomer(Customer cust, Customer cust2, Employee employee1){
        // See which customer has more cash and better credit

        Customer betterCustomer;
        Employee salesman = employee1;

        if(cust.getCashOnHand() > cust2.getCashOnHand()){
            betterCustomer = cust;
        } else {
            betterCustomer = cust2;
        }

//        sayCongrats(betterCustomer);
        introduction(salesman, betterCustomer);


    }

    public void sayCongrats(Customer cust){
        System.out.println("I'll be happy to help you today " + cust.getName() + "!");
    }

    public void introduction(Employee emp, Customer cust){
        System.out.println("Hi " + cust.getName() + " I'm " + emp.name + " I spoke to you on the phone earlier");
    }


    public void runCreditHistory(Customer cust){
        System.out.println("We'd love to help you finance, let me run the numbers... ");
        if(cust.getCreditScore() < 600){
            System.out.println("Sorry " + cust.getName() + ", you do not qualify for financing");
        } else {
            System.out.println("Good news, you qualify for financing!");
            sayCongrats(cust);
        }
    }

    public void processTransaction(Customer cust, Vehicle vehicle){
        System.out.println("Processing Transaction... ");
    }

    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle){
        if(finance){
            runCreditHistory(cust);
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
