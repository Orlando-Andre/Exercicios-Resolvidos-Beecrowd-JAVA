import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new java.util.Scanner(System.in);
        int diaInicial, horaInicial, minutosIniciais, segundosIniciais, convDIA01seg, convDIA02seg;
        int diaFinal, horaFinal, minutosFinais, segundosFinais;
        int duracaoEvento;
        String doisPontos, dia;
        dia = input.next();
        diaInicial = input.nextInt();
        horaInicial = input.nextInt();
        doisPontos = input.next();
        minutosIniciais = input.nextInt();
        doisPontos = input.next();
        segundosIniciais = input.nextInt();
        dia = input.next();
        diaFinal = input.nextInt();
        horaFinal = input.nextInt();
        doisPontos = input.next();
        minutosFinais = input.nextInt();
        doisPontos = input.next();
        segundosFinais = input.nextInt();
        convDIA01seg = segundosIniciais + minutosIniciais *60 + horaInicial *60*60 + diaInicial *60*60*24;
        convDIA02seg = segundosFinais + minutosFinais *60 + horaFinal *60*60 + diaFinal *60*60*24;
        duracaoEvento = convDIA02seg - convDIA01seg;
        System.out.printf("%d dia(s)\n", duracaoEvento/(60*60*24));
        duracaoEvento = duracaoEvento % (60*60*24);
        System.out.printf("%d hora(s)\n", duracaoEvento/(60*60));
        duracaoEvento = duracaoEvento % (60*60);
        System.out.printf("%d minuto(s)\n", duracaoEvento/(60));
        duracaoEvento = duracaoEvento % (60);
        System.out.printf("%d segundo(s)\n", duracaoEvento);
        input.close();
    }        

}