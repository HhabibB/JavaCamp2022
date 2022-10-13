public class Main {
    public static void main(String[] args) {

        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{10,8,6};

        sayilar1=sayilar2;
        sayilar2[0] = 100;

        System.out.println(sayilar1[0]);
    }
}
