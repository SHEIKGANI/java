// // absolute program
// import java.util.*;
// public class Main1{
//     public static void main (String[] args) {
//         Scanner Sc = new Scanner(System.in);
//         int n = Sc.nextInt();
//         int arr[] = new int[n];


//         for (int i = 0;i<n;i++){
//             arr[i]=Sc.nextInt();
//         }
//         int mid,Sum1=0,Sum2=0;
//         if(n%2==0){
//             mid=n/2;
//         }
//         else{
//             mid=(n+1)/2;
//         }
//         for(int i=0;i<mid;i++){
//             Sum1=Sum1+arr[i];
//         }
//         for(int i=mid;i<n;i++){
//             Sum2=Sum2+arr[i];
//         }
//         System.out.println(Math.abs(Sum1-Sum2));
        
//     }
// }