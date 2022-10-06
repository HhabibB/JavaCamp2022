public class vowels {
    public static void main(String[] args) {
        char character = 'e';

        char[] boldVowels = {'a','ı','o','u','A','I','O','U'};
        char[] thinVowels = {'e','i','ö','ü','E','İ','Ö','Ü'};

        for(int i=0;i<8;i++){
            if(character == boldVowels[i]){
                System.out.println(character + " is a bold vowels.");
            } else if (character == thinVowels[i]) {
                System.out.println(character + " is a thin vowels.");
            }
        }

    }
}
