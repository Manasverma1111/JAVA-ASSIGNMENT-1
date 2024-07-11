import java.util.Scanner;
public class Binarysearch {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size:");
    int size = sc.nextInt();
    int[] array=new int[size];
    System.out.println("Enter sorted array elements:");
    for (int i=0; i<size; i++){
        array[i]=sc.nextInt();
    }
    System.out.println("Enter target element:");
    int target = sc.nextInt();

    int pos = bins(array, target);
    if (pos!= -1){
        System.out.println("Element found at index:" + pos);
    } else {
        System.out.println("Element not found");
    }
    sc.close();
}
public static int bins(int[] array, int target){
    int left=0;
    int right = array.length-1;

    while (left <+ right){
        int mid = left+(right-left)/2;

        if (array[mid] == target){
            return mid;
        } else if (array[mid] < target){
            left = mid+1;
        } else {
            right = mid-1;
        }
    }
    return -1;
}
}
