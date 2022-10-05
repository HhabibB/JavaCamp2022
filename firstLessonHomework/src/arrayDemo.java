public class arrayDemo{
    public static void main(String[] args) {
        String ogrenci1 = "Hebib";
        String ogrenci2 = "Musa";
        String ogrenci3 = "Pervin";

        System.out.println(ogrenci1 + " " + ogrenci2 + " " + ogrenci3);
 
        System.out.println("--------------------------\nsimple for :");
 
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Hebib";
        ogrenciler[1] = "Musa";
        ogrenciler[2] = "Pervin";
        ogrenciler[3] = "Elgun";
        //ogrenciler[4] = "Elvin";
        
        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("--------------------------\nforeach :");
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}