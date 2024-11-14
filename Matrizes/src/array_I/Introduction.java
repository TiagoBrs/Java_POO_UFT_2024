package array_I;

import java.util.Arrays;
import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        //Tipos de Declarações

        int[] Arr = new int[12]; //Instanciação de um array
        //int[] Arr2 = {1, 2, 3};
        //int Arr2[] = new int[3];
        //Semelhante a C, Arr é uma referência(Provavelmente para o primeiro objeto) do array.

        //.length (Retorna o comprimento do array)

        Scanner input = new Scanner(System.in);

        for (int i = 0; i <Arr.length ; i++) {
            System.out.printf("Valor %d: ", i+1);
            Arr[i] = input.nextInt();
        }

        for(int i: Arr){       //For que percorre diretamente cada elemento
            System.out.println(i);
        }
        int S = SumArr(Arr);

        System.out.println(S);




    }

    public static int SumArr(int[] Arr){
        int Sum = 0;
        for(int i: Arr){
            Sum+=i;
        }
        return Sum;
    }
}
