public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Delong Kahve makinesi");
        product1.setUnitPrice(1500);
        product1.setDiscount(8);
        product1.setUnitsInStock(3);
        product1.setImageUrl("asdgfghfhg.jpg");


        Product product2 = new Product();
        product2.setName("Usese Kahve makinesi");
        product2.setUnitPrice(1300);
        product2.setDiscount(9);
        product2.setUnitsInStock(5);
        product2.setImageUrl("ighgohdsd.jpg");


        Product product3 = new Product();
        product3.setName("Kalie Kahve makinesi");
        product3.setUnitPrice(1900);
        product3.setDiscount(6);
        product3.setUnitsInStock(10);
        product3.setImageUrl("itrgjxjdfsd.jpg");



        Product[] products = {product1,product2,product3} ;

        for (Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setPhoneNumber("0552351234");
        individualCustomer.setFirstName("Pervin");
        individualCustomer.setLastName("Allahverdiyev");


        CorporateCustomer corporateCustomer = new CorporateCustomer();

        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kapital Bank");
        corporateCustomer.setCustomerNumber("54234");
        corporateCustomer.setCustomerNumber("0772344367");
        corporateCustomer.setTaxNumber("6402030506");

        Customer[] customers = {individualCustomer, corporateCustomer};

        for (Customer customer : customers) {
            System.out.println(customer.getId());
        }
    }
}