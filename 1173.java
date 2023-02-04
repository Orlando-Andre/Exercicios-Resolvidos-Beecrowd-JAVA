import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long v[] = new long[10];
        int valor;
        valor = input.nextInt();
        v[0] = valor;
        System.out.printf("N[0] = %d\n",v[0]);
        for(int i = 1; i < 10 ; i++){
            v[i] = v[i-1] * 2;
            System.out.printf("N[%d] = %d\n",i,v[i]);
        }

        input.close();
    }
}
 