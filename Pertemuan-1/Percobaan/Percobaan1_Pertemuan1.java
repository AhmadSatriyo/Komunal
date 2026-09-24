import java.util.Scanner;

public class myFaktorial {
    public static void main(String[] args) {
        
        Scanner masukan = new Scanner(System.in);
        
        int n;
        long a, b;
        
        System.out.println("=== Program Penghitung Faktorial Secara Rekursif dan Iteratif ===");
        System.out.println();
        
        do {
            System.out.print("Masukkan nilai N : ");
            n = masukan.nextInt();
            
            if (n < 0 || n > 20) {
                System.out.println("Nilai N harus berada di antara 0 dan 20");
                System.out.println();
            }
        } while (n > 20 || n < 0);
        
        System.out.println();
        
        a = faktorialIteratif(n);
        System.out.println("Nilai faktorial iteratif dari " + n + " adalah  : " + a);
        
        b = faktorialRekursif(n);
        System.out.println("Nilai faktorial rekursif dari " + n + " adalah  : " + b);
        
        System.out.println();
        
        if(a == b) {
            System.out.println("Kedua metode memiliki hasil sama");
        }
        else {
            System.out.println("Terdaapat kesalahan dalam program");
        }
        
        System.out.println();
    }
    
    public static long faktorialIteratif(int n) {
        
        long sum, i;
        sum = n;
        
        if(n == 0) 
            return 1;
            
        for(i = n-1; i >= 1; i--) {
            sum = sum*i;
        }
     return sum;
    }
    
    public static long faktorialRekursif(int n) {
        
        if (n == 0) {
            return 1;
        }
        else 
            return n * faktorialRekursif(n-1);
    } 
}