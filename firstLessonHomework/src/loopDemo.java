public class loopDemo {
    public static void main(String[] args){

        //For loop
        for(int i=1;i<=10;i+=2){
            System.out.print(i + " " );
        }
        System.out.println("For dongusu bitti.");

        //While loop
        int i = 1;
        while(i<10){
            System.out.print(i + " ");
            i++;
        } 
        
        System.out.println("While dongusu bitti.");

        //Do While dongusu
        int j = 10;
        do{
            System.out.print(j + " ");
            j+=2;
        }while(j<10);
        System.out.println("Do While dongusu bitti.");

    }
}