//It is a solution for google kick start round G 2022( Walktober problem).
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t,m,n,p;
        int needs=0;
        t=sc.nextInt();
        int k=0;
        while(t-->0){
            k++;
            needs=0;
            m=sc.nextInt();
            n=sc.nextInt();
            p=sc.nextInt();
            int[][] arr=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int[] need=new int[n];
            for(int i=0;i<n;i++){
                need[i]=Integer.MIN_VALUE;
            }
            for(int i=0;i<m;i++) {
                for (int j = 0; j < n; j++) {
                    if (i == p - 1) {
                        continue;
                    } else {

                        if (need[j] < arr[i][j]) {
                            need[j] = arr[i][j];
                        }
                    }

                }
            }


                for(int j=0;j<n;j++){
                    if(need[j]<arr[p-1][j])
                        continue;
                    int s=(need[j]-arr[p-1][j]);
                    needs=needs+s;
                }

              /* for(int j=0;j<n;j++){
                    System.out.print(need[j]+" ");
                }*/
            //System.out.println();
                System.out.println("Case #"+(k)+": "+needs);


            }
        }
    }

