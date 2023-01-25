import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);
        int z, z2, z3, z4, n, totalNumeros;
        n = input.nextInt();
        totalNumeros = n * 4;
        for(z = 1; z < totalNumeros ; z = z4 + 1){
            z2 = z+1;
            z3 = z+2;
            z4 = z+3;
            System.out.print(z + " " + z2 + " " + z3 +" PUM\n");
        }
        
        input.close();
    }
}

