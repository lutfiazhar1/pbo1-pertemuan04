package Perulangan;

public class dowhile {
    public static void main(String[] args) {
        int isigelas = 0;
        int penuh = 255;

        System.out.println("Isi Gelas Sekarang :" + isigelas + "ml");
        System.out.println("Isi gelas ketika penuh :" + penuh + "ml");

        do {
            isigelas++;
            System.out.println("sedang mengisi gelas..");
            System.out.println("isi gelas sekarang : " + isigelas + "ml");
        } while (isigelas != penuh);


        System.out.println("Final Isi gelas Sekarang :" + isigelas + "ml");
    }
}

