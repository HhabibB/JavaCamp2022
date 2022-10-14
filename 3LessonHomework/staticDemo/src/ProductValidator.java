public class ProductValidator {
    static{
        System.out.println("Static blok calisti.");
    }

    public ProductValidator() {
        System.out.println("Product Validator.");
    }

    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public void bisey(){

    }

    public static class InnerClass{
        public void Sil(){

        }
    }
}
