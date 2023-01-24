import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);
        int qtdGolInter, qtdGolGremio, contadorGrenal, grenal, empate, interGanhou, gremioGanhou;
        contadorGrenal = 0;
        empate = 0;
        interGanhou = 0;
        gremioGanhou = 0;
        qtdGolInter = input.nextInt();
        qtdGolGremio = input.nextInt();
        System.out.println("Novo grenal (1-sim 2-nao)");
        grenal=input.nextInt();
        contadorGrenal = contadorGrenal + 1;
        if(qtdGolInter == qtdGolGremio){
            empate = empate + 1;
        }
        else{
            if(qtdGolInter>qtdGolGremio){
                interGanhou = interGanhou + 1;
            }
            else{
                gremioGanhou = gremioGanhou + 1;
            }
        }
        while(grenal == 1){
            if(qtdGolInter == qtdGolGremio){
                empate = empate + 1;
            }
            else{
                if(qtdGolInter>qtdGolGremio){
                    interGanhou = interGanhou + 1;
                }
                else{
                    gremioGanhou = gremioGanhou + 1;
                }
            }
            qtdGolInter=input.nextInt();
            qtdGolGremio=input.nextInt();
            System.out.println("Novo grenal (1-sim 2-nao)");
            grenal=input.nextInt();
            contadorGrenal = contadorGrenal + 1;
        }
        System.out.println(contadorGrenal +" grenais");
        System.out.println("Inter:"+ interGanhou);
        System.out.println("Gremio:"+ gremioGanhou);
        System.out.println("Empates:"+ empate);
        if(interGanhou > gremioGanhou){
            System.out.println("Inter venceu mais");
        }
        else{
            System.out.println("Gremio venceu mais");
        }
         input.close();
    }
}

