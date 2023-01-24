import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new java.util.Scanner(System.in);
        int i, x, y;
        x = input.nextInt();
        y = input.nextInt();
        if(x > y){
            for(i = y+1; i < x; i = i + 1){
                if(i % 5 == 2 || i % 5 == 3){
                    System.out.print(i+"\n");
                }
            }
        }
        else{
            for(i = x+1; i < y; i = i + 1){
                if(i % 5 == 2 || i % 5 == 3){
                    System.out.println(i);
                }
            } 
        }
        input.close();
    }
}
