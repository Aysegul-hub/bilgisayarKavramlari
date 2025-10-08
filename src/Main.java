//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Object ilkBosluk;

    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Hoşgeldin Ayşegül Delialioğlu");
        // unutmamak için yeniden çalışıyorum.
        /*deneme mesaj


         */


        int n = 5;
        int b = 2;
        int ayse;
        ayse = 15;
        System.out.println("merhaba ayse " + b);
        float pi = 3.14F; //float yapımında sonuna F yaz ya da double yap
        String name = "benim adım aysegul";
        System.out.println(name);
        double sayi = 3.14;
        System.out.println(sayi);
        name = name.toUpperCase();
        int ilkBosluk = name.indexOf(" ");
        System.out.println(ilkBosluk);

        String a = "benim adım aysegul";
        a = a.toUpperCase();
        a = a.toLowerCase();
        int firstGaps = a.indexOf('m'); //indexOf(" ") kalıbı int ile tanımlıdır çünkü bize bir sayı değeri döndürür.
        String firstWord = a.substring(0, firstGaps); //substring(something) kalıbı ilk boşluktan sonrasınık yazdırdı
        int lastGaps = a.lastIndexOf(" ");
        String lastWord = a.substring(lastGaps);

        System.out.println(lastWord);

        System.out.println(firstWord);
        System.out.println(firstGaps);
        System.out.println("8. karakter: " + a.charAt(8));
        System.out.println("8. karakter: ");
        System.out.println("8. karakter: ");



    }


}