package CoreJava;
import java.util.*;
public class ArtisticPattern {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        //System.out.println("Enter Size of Diamond ");
        //int size=sc.nextInt();
        int size=7;
        int r=2*size+1;
        int c=2*size+2;
        for(int i=0; i<r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0) {
                    if(j==0 || j==c-1)
                    {
                        System.out.print("+");
                    }
                    else
                        System.out.print("-");

                }
               else if(i==r-1)
                {
                    if(j==0 || j==c-1)
                    {
                        System.out.print("+");
                    }
                    else
                        System.out.print("-");
                }
                else if(j==0 || j==c-1)
                {
                    System.out.print("|");
                }
               else if((r-1)/2==i)
                {
                    if(j==1)
                        System.out.print("<");
                    else if(j==c-2)
                        System.out.print(">");
                    else
                    {
                        if(i%2==0)
                            System.out.print("-");
                        else
                            System.out.print("=");
                    }
                }
               /* else if(i%2==0)
                {
                    System.out.print("-");
                }
                else if(i!=0 && i!=r-1)
                {
                    if(i%2==1)
                        System.out.print("=");
                }*/
               else if((i+j)%(size+1)==0)
                {
                    if(i<r/2 && j<c/2)
                    System.out.print("/");
                    else
                        System.out.print(" ");
                }
               else if((i+j)%size*3==0)
                {
                    if(i>r/2 && j>=c/2)
                        System.out.print("/");
                    else
                        System.out.print(" ");
                }
               else if((i-j)%(size-1)==0 )
                {
                    if(i>r/2 && j<=c/2)
                      System.out.print("\\");
                    else
                        System.out.print(" ");
                }
               else if((j-i)%size==0)
                {
                        if(i<r/2 && j>=c/2 )
                        System.out.print("\\");

                        else
                            System.out.print(" ");

                }


                else
                    System.out.print(" ");
            }
            System.out.println();
        }



    }
}
