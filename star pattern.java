import java.util.Scanner;
public class practice
{
      public static void  main(String[] args)
      {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt(); 
           int i,j,k;
           for(i=1;i<=n;i++)
           {
                 for(k=1;k<=n-i;k++)
                 {
                       System.out.print("   ");
                 }
                 for(j=1;j<=i*2-1;j++)
                 {
                       System.out.print(" * ");
                 }
                 System.out.println();
           } 
           for(i=n-1;i>0;i--)
           {
                 for(k=1;k<=n-i;k++)
                 {
                       System.out.print("   ");
                 }
                 for(j=1;j<=i*2-1;j++)
                 {
                       System.out.print(" * ");
                 }
                 System.out.println();
           }
      }
}
