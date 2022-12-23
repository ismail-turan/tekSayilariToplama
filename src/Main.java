import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, toplam = 0;
        do {
            System.out.print("bir sayı giriniz :");
            n=scanner.nextInt();
            if (n%2==1){
                toplam+=n;
            }
        }while (n>0);
        System.out.println("Toplam Sonuc :"+toplam);
    }
}