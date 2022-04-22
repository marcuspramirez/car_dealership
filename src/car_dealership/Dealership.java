package car_dealership;// Write a program to simulate a car dealership sales process.  We'll have employees, working selling vehicals to customers
// Classes:  Employee, Cars, car_dealership.Customer

public class Dealership {

    public static void main(String[] args) {

        Customer cust1 = new Customer("Tom", "123 Any St.", 45000);
        Customer cust2 = new Customer("Jerry", "321 Jackson St.", 8000);

       Employee employee1 = new Employee("Jake", "Sales");

       Vehicle vehicle1 = new Vehicle("Ford", "Mustang", "Red", 2022, 45000);

       employee1.handleCustomer(cust1, false, vehicle1);
       employee1.handleCustomer(cust2, true, vehicle1);

        System.out.println(cust1.getCashOnHand());

    }

}
