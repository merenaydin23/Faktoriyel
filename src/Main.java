import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Girilen sayının faktoriyelini veren programa hoş geldiniz");
        int carpim=1;
        Scanner klavye=new Scanner(System.in);
        int sayi= klavye.nextInt();
        while (sayi<0){
            System.out.println("Lütfen pozitif bir sayı giriniz");
            sayi= klavye.nextInt();
        }
if (sayi==1^sayi==0){
    System.out.println( "faktoriyel=1");
}
else {
    for (int i=1;i<=sayi;i++) {
     carpim=carpim*i;
    }

System.out.println("Faktoriyeli hesaplanan sayının faktoriyeli="+carpim);
}

    }
}