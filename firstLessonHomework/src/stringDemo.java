public class stringDemo {
    public static void main(String[] args){
        String mesaj = "Bugun hava cok guzel.";
        System.out.println(mesaj);

        //Stringdeki karakterlerin sayini bulmak icin stringName.length() kullanilir: 
        System.out.println("Stringdeki karakterlerin sayi : " + mesaj.length());
        //Stringdeki n-ci karakterin ne oldugunu bulmak icin stringName.charAt(n) kullanilir:
        System.out.println("Stringdeki n-ci karakter : " + mesaj.charAt(4));
        //2 Farkli stringi birlestirmek icin stringName.concat(secondString) kullanilir.
        System.out.println(mesaj.concat("Gezmeye gedek?"));
        //Stringin hangi karakterle basladigini bulmak icin stringName.startWith() kullanilir, netice boolean olarag geri qayidar:
        System.out.println(mesaj.startsWith("b"));
        //Stringin hangi karakterle sonlandigini bulmak icin stringName.endWith() kullanilir, netice boolean olarag geri qayidar:
        System.out.println(mesaj.endsWith("."));
        //Stringdeki karakterleri char arraye donusturmek icin kullaniliyo stringName.getChars()
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        //indexOf 
        System.out.println(mesaj.indexOf('a'));
        //lastIndexOf
        System.out.println(mesaj.lastIndexOf('a'));


    }
}
