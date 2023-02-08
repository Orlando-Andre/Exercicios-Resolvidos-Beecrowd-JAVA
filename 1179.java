import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int PAR[] = new int[5];
        int IMPAR[] = new int[5];
        int n;
        int x = 0, w = 0;
        for(int i = 0; i < 15 ; i++){
            n = input.nextInt();
            if(n % 2 == 0){
                PAR[x] = n;
                x++;
                if(x == 5){
                    for( int z = 0; z < 5;z++){
                        System.out.printf("par[%d] = %d\n",z,PAR[z]);
                        PAR[z]= 0;
                    }
                    x = 0;
                }
            }
            else{
                IMPAR[w] = n;
                w++;
                if(w == 5){
                    for( int t = 0; t < 5;t++){
                        System.out.printf("impar[%d] = %d\n",t,IMPAR[t]);
                        IMPAR[t]= 0;
                    }
                    w = 0;
                }

            }
        }
        for(int h = 0; h < 5; h++){
            if(IMPAR[h]!=0){
                System.out.printf("impar[%d] = %d\n",h,IMPAR[h]);
            }
        }
        for( int h = 0 ; h<5;h++){
            if(PAR[h]!=0){
                System.out.printf("par[%d] = %d\n",h,PAR[h]);
            }
        }
        input.close();
    }
}
 