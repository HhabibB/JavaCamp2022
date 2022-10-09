package Methods;

public class UnderstandingMethods {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber(){
        int[] numbers = new int[]{1,2,5,6,8,0};
        int numberToBeFound = 6;
        boolean state = false;

        for(int number : numbers){
            if(number == numberToBeFound){
                state = true;
                break;
            }
        }
        if(state){
            giveMessage("Number exists: " + numberToBeFound);
        }else{
            System.out.println("Number doesnt exist." + numberToBeFound);
        }
    }

    public static void giveMessage(String message){
        System.out.println(message);
    }


}
