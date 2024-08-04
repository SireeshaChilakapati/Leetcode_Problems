import java.util.Arrays;
import java.util.Scanner;
public class Range_Sum_of_Sorted_Subarray_Sums {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size n:");
        int n=sc.nextInt();
        System.out.println("enter the left and right: ");
        int left=sc.nextInt();
        int right=sc.nextInt();
        System.out.println("enter the elements with n size: ");
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(rangeSum(nums,n,left,right));
    }
    public static  int rangeSum(int[] nums, int n, int left, int right) {
        int sumArr[]=new int[(n*(n+1))/2];
        int idex=0;
        for(int i=0;i<n;i++)
        {
            
            int start=i;
            
            for(int j=start;j<n;j++)
            {
                int sum=0;
                int end=j;
                for(int k=start;k<=end;k++)
                {
                   // System.out.print(nums[k]);
                    sum+=nums[k];
                    
                }
               // System.out.println(sum);
                 sumArr[idex]=sum;
                    idex++;
            }

        }
        
        Arrays.sort(sumArr);

    
        int resul=0;
        for(int i=left-1;i<right;i++)
        {
            resul=(sumArr[i]+resul)%(1000000000+7);
        }
        
        return resul;
    }
    
    
}
