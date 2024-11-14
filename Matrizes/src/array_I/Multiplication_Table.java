package array_I;
import java.util.Scanner;
public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int LENGTH = 10;

        int[] table = new int[LENGTH];
        int flag=0;

        System.out.print("Digite o valor correspondente à tabuda que desejas ver(0 para sair): ");
        flag = sc.nextInt();
        while(flag != 0){

            for(int i=0;i<LENGTH;i++){
                table[i] = (i+1)*flag;
            }

            for(int i=0;i<LENGTH;i++){
                System.out.printf("%d x %2d = %d%n", flag, i+1, table[i]);
            }

            System.out.print("Digite o valor correspondente à tabuda que desejas ver(0 para sair): ");
            flag = sc.nextInt();
        }
    }
}
