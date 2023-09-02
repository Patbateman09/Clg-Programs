import java.util.*;
class h{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int arr[] = new arr[100];
    System.out.println("Enter the size of array: ");
    int s = sc.nextInt();
    System.out.println("Enter the values: ");
    for(int i = 0; i < s; i++){
      arr[i] = sc.nextInt();
    }
    for(i = 0; i < s; i++){
      System.out.print("The array is: ", +arr[i]);
    }
  }
}
