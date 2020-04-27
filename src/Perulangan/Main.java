package Perulangan;

public class Main {
    public static void main(String[] args) {
        int isigelas= 0;
        int penuh = 255;

        System.out.println("Isi Gelas Sekarang :" + isigelas + "ml");
        System.out.println("Isi gelas ketika penuh :" + penuh +"ml");

        while(isigelas !=penuh){
            isigelas++;
            System.out.println("sedang mengisi gelas..");
            System.out.println("Isi gelas Sekarang :" + isigelas +"ml");

        }
        System.out.println("Final Isi gelas Sekarang :" + isigelas +"ml");
    }
}
