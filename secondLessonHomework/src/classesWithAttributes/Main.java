package classesWithAttributes;

public class Main {
    public static void main(String[] args){
        Product product = new Product(1,"Laptop","Lenova Legion Laptop",2200,4,"kara");

        /*Product product = new Product();

        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Lenevo Legion Laptop");
        product.setPrice(2200);
        product.setStockAmount(4);
        product.setRenk("Kara");*/

        ProductManager productManager = new ProductManager();
        productManager.Add(product);


        System.out.println(product.getName());
        System.out.println(product.getKod());
    }
}
