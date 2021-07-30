import java.io.*;
import java.util.*;

public class Bot_saves_princes {
    public static void displayPathtoPrince(int N,char arr[][])
    {
        int mr=0,mc=0,pr=0,pc=0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(arr[i][j]=='m')
                {
                    mr=i;
                    mc=j;
                }
                else if(arr[i][j]=='p')
                {
                    pr=i;
                    pc=j;
                }
                else continue;
            }
        }
        while(mr!=pr || mc!=pc)
        {
            if(pr>mr){System.out.println("DOWN");
                     mr++;}
            else if(pr<mr){System.out.println("UP");
                          mr--;}
            if(pc>mc){System.out.println("RIGHT");
            mc++;}
            else if(pc<mc){System.out.println("LEFT");
                 mc--;}
            }
       }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        
        char arr[][]=new char[N][N];
        for(int x=0;x<N;x++)
        {
        	arr[x]=br.readLine().trim().toCharArray();
        }
        displayPathtoPrince(N, arr);
        }
}