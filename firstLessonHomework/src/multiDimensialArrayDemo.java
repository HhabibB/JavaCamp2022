public class multiDimensialArrayDemo {
    public static void main(String[] args) {
        String[][] cities =new String[3][3];
        
        cities[0][0] = "Baki";
        cities[0][1] = "Sumqayit";
        cities[0][2] = "Abseron";
        cities[1][0] = "Quba";
        cities[1][1] = "Qusar";
        cities[1][2] = "Xacmaz";
        cities[2][0] = "Qazax";
        cities[2][1] = "Agstafa";
        cities[2][2] = "Tovuz";

        for(int i=0;i<=2;i++) {
            System.out.println("--------------------");
            for(int j=0;j<=2;j++){
                System.out.println(cities[i][j]);
            }
        }

    }   
}
