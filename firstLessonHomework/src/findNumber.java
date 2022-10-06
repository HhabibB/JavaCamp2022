public class findNumber {
    public static void main(String[] args) {
        int[] number = new int[]{1,2,5,7,9,0};
        int numberToBeFind = 10;
        boolean answer = false;

        for(int i=0;i<number.length;i++){
            if(number[i] == numberToBeFind){
                answer = true;
                break;
            }
        }

        if(answer){
            System.out.println("There is " + numberToBeFind + " in array.");
        }else{
            System.out.println("There is not " + numberToBeFind + " in array.");
        }
    }
}
