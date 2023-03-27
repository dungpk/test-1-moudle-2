/*Cau 2 va 3: */
import java.util.Scanner;
public class SumAndMaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap do dai cua mang: ");
        int arrLength = scanner.nextInt();
        int arr[] = new int[arrLength];
        for(int i=0;i<arr.length;i++){
            System.out.printf("Nhap gia tri cua phan tu thu %d: ",i+1);
            arr[i] = scanner.nextInt();
        }

        System.out.println("Mang gom cac phan tu:");
        for(int i =0;i<arr.length;i++){
            System.out.printf("%d\t",arr[i]);
        }


        System.out.printf("\nGia tri lon nhat trong mang la: %d\n",MaxArray(arr));
        System.out.printf("Tong cac phan tu trong mang la:  %d\n",SumArray(arr));

    }
    public static int MaxArray(int[] arr){
        int maxArr = arr[0];
        for(int i=0;i<arr.length;i++){
            if(maxArr<arr[i]){
                maxArr=arr[i];
            }
        }
        return maxArr;
    }

    public static int SumArray(int[] arr){
        int sumArr = 0;
        for(int i=0;i<arr.length;i++){
            sumArr+= arr[i];
        }
        return sumArr;
    }
}
