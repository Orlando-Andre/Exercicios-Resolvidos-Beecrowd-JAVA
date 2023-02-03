import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int T, PA, PB,cont = 1;
        double G1, G2;
        T = input.nextInt();
        for(int i = 0; i < T; i++){
            PA = input.nextInt();
            PB = input.nextInt();
            G1 = input.nextDouble();
            G2 =input.nextDouble();
            PA = PA + ((int)(PA * (G1/100)));
            PB = PB + ((int)(PB * (G2/100)));
            while(PA<=PB){
                cont++;
                PA = PA + ((int)(PA * (G1/100)));
                PB = PB + ((int)(PB * (G2/100)));
            }
            if(cont > 100){
                System.out.println("Mais de 1 seculo.");
            }
            else{
                System.out.println(cont+" anos.");
            }
            cont = 1;
        }
    }
}
