import java.util.Locale;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int qtdExeperimentos,qtdCobaia,totalCobaia;
        int coelho = 0, rato = 0, sapo = 0; 
        char tipoCobaia;
        double perSapo, perCoelho,perRato;

        qtdExeperimentos = input.nextInt();
        for(int i = 0; i < qtdExeperimentos; i++){
            qtdCobaia = input.nextInt();
            tipoCobaia = input.next().charAt(0);
            if(tipoCobaia == 'C'){
                coelho += qtdCobaia;
            }
            else{
                if(tipoCobaia == 'R'){
                    rato += qtdCobaia;
                }
                else{
                    sapo += qtdCobaia;
                }
            }
        }
        totalCobaia = coelho + rato + sapo;
        perCoelho= (coelho * 100.0f)/totalCobaia;
        perRato  = (rato * 100.0f)/totalCobaia;
        perSapo  = (sapo * 100.0f)/totalCobaia;
        System.out.printf("Total: %d cobaias\n",totalCobaia);
        System.out.printf("Total de coelhos: %d\n",coelho);
        System.out.printf("Total de ratos: %d\n",rato);
        System.out.printf("Total de sapos: %d\n",sapo);
        System.out.printf("Percentual de coelhos: %.2f %%\n",perCoelho);
        System.out.printf("Percentual de ratos: %.2f %%\n",perRato);
        System.out.printf("Percentual de sapos: %.2f %%\n",perSapo);
        input.close();
    }
}