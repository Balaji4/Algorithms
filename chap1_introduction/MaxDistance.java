package chap1_introduction;

import java.util.Scanner;

/**
 *
 * @author Balaji Dubey
 */

/**
 * 
 * @author Balaji Dubey
 */
public class MaxDistance {
    public static void main(String sd[]){
        Scanner s = new Scanner(System.in);
        int n,a[];
        System.out.println("Enter array size ");
        n=s.nextInt();
        if(n<2){
            System.out.println("Invalid args");
        System.exit(0);
        }
        a=new int[n];
        System.out.println("Enter array values ");
        for(int j=0;j<a.length;j++){
               a[j] = s.nextInt();
           }
        
        int max[] = maxDistance(a);
        System.out.println("Max distance = "+max[0]+" found between values "+max[1]+" and "+max[2]);
    }
    public static int[] maxDistance(int a[]){
        int max[] = new int[3];
        max[0]=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
               if(i!=j){
                   if(Math.abs(a[i]-a[j])>max[0]){
                       max[0]=Math.abs(a[i]-a[j]);
                       max[1]=a[i];
                       max[2]=a[j];
                   }
               }
           } 
        }
        return max;
    }
}
