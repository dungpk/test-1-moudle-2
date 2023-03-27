import java.util.Scanner;
public class PrintPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen N can in ra gia tri: ");
        int value = scanner.nextInt();
        for(int i=0;i<value;i++){
            if(isPrime(i)){
                System.out.printf("%d\t",i);
            }
        }
    }
    public static boolean isPrime(int value){
        if(value==3||value==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(value);i++){
            if(value%i==0){
                return false;
            }
        }
        return true;
    }
}
