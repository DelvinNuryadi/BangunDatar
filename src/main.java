import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;

        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.print("Pilihan  : ");
        a = input.nextInt();

        if (a == 1){
            Persegi p1 = new Persegi();
            System.out.print("Masukkan sisi : ");
            a = input.nextInt();
            p1.setSisi(a);
            p1.display();
        }

        else if (a == 2){
            int t;
            Segitiga s1 = new Segitiga();
            System.out.print("Masukkan alas : ");
            a = input.nextInt();
            s1.setAlas(a);
            System.out.print("Masukkan tinggi : ");
            t = input.nextInt();
            s1.setTinggi(t);
            s1.display();
        }
        
    }

}