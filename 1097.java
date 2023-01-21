public class Main {
    public static void main(String[] args){
        int i = 1, j = 7, x;
        while(i <= 9){
            for( x = 0; x < 3; x = x + 1){
                System.out.println("I=" + i + " J=" + j);
                j = j - 1;
            }
            j = j + 5;
            i = i + 2;
        }
    }
}
        
      

