package com.company;

public class TestDriver {
    public static void run() {

        testPerson();
        testShop();
        testCar();

        testInvoice();
        testInvoiceItem();
    }

    public static void testPerson(){

        Person p = new Person("Dorset Man");// create an instance of the class => it becomes an object

        System.out.println("The person is "+p.getName());
        p.setAge(1050);
        System.out.println("The age is "+p.getAge());

    }

    public static void testCar(){

        Car c = new Car ("Volvo");

        //System.out.println("The manufacturer is "+c.getManufacturer());
        System.out.println(c.toString());

        Car c2 = new Car ("BMW");

        //System.out.println("The manufacturer is "+c2.getManufacturer());
        System.out.println(c2.toString());
    }

    public static void testShop(){
        Shop s = new Shop("Centra");

        System.out.println("The Shop is "+s.getName());

    }

    private static void testInvoice(){
        Invoice i = new Invoice("1234");

        System.out.println("The Invoice number is "+i.getNumber());
    }
    private static void testInvoiceItem(){
        InvoiceItem i = new InvoiceItem("Apple");
        System.out.println("The Invoice item is "+ i.getName());

        InvoiceItem item2 = new InvoiceItem("Orange", 3,4);
        System.out.println(item2.toString());
    }

}
