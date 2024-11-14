public class Array_II {
    public static void main(String[] args) {
         //Exemplos de inicialização de array multidimensionais
        //int[][] Arr = { { 1, 2 }, { 3, 4 } }; // Cria uma matriz 2x2, onde {1, 2} representam as linhas
        int[][] Arr = new int[3][3]; // Gera uma matriz 3x3

        //Os arrays são criados em tempo de execução. O que permite redimensionar o array durante a execução.
        //Inclusive é possível criar matriezes de tal forma que, cada linha possua um número diferente de colunas.
        int[][] Matrix = new int[3][];
        Matrix[0] = new int[5];
        Matrix[1] = new int[3];
        Matrix[2] = new int[4];

        /*
        Isso é possível pois, em java, uma matriz nada mais é que um vetor que armazena referências para
        outros arrays unidimensionais.
        */


        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.print(Arr[i][j]);
            }
        }
    }
}
