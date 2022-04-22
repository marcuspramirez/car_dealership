package car_dealership;// Write a program to simulate a car dealership sales process.  We'll have employees, working selling vehicals to customers
// Classes:  Employee, Cars, car_dealership.Customer

public class Dealership {

    public static void main(String[] args) {

        Customer cust1 = new Customer("Tom", "123 Any St.", 45000, 79);
        Customer cust2 = new Customer("Jerry", "321 Jackson St.", 5000000, 79);

       Employee employee1 = new Employee("Sal The Seller", "Sales");
        Employee employee2 = new Employee("Rick'", "Finance");

       Vehicle vehicle1 = new Vehicle("Ford", "Mustang", "Red", 2022, 45000);
        Vehicle vehicle2 = new Vehicle("Honda", "Accord", "Red", 2021, 28000);

//       employee1.handleCustomer(cust1, true, vehicle1);
//       employee1.handleCustomer(cust2, true, vehicle1);

        // Tom and Jerry both enter the dealership
        cust1.enterDealership(cust1);
        cust2.enterDealership(cust2);

        System.out.println("--------------------");

        // Employee approaches whoever has more cash on hand
        employee1.chooseBestCustomer(cust1, cust2, employee1);

        System.out.println("--------------------");

        //
       cust1.purchaseCar(vehicle1, employee1, true);

        System.out.println("--------------------");

        cust2.financeOrNot(cust2, true);

        // if customer wants to finance we will check their credit score.  less than 600 can't help ya
        employee1.handleCustomer(cust2, true, vehicle1);





    }

}
