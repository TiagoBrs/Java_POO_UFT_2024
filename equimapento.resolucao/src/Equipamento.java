public class Equipamento {
    private int valor;
    int numeroEquipamentos;
    protected int[] lista_equipamentos;

    /***
     *
     * @param numeroEquipamentos
     * Costrutor: Recebe o número de equipamentos e inicializa o vetor que contém os valores
     * de cada equipamento.
     */
    public Equipamento(int numeroEquipamentos){
        this.numeroEquipamentos = numeroEquipamentos;
        lista_equipamentos = new int[numeroEquipamentos];
    }

    /***
     *
     * @param numeroEquipamento
     * @return Retorna o valor do equipamento dado seu número(de 0 a NumeroEquipamento-1)
     */

    public int getValor(int numeroEquipamento) {
        return lista_equipamentos[numeroEquipamento];
    }

    /***
     *
     * @param numeroEquipamento
     * @param valor
     *
     * Configura o valor do equipamento na posição especificada
     */
    public void setValor(int numeroEquipamento, int valor) {
        lista_equipamentos[numeroEquipamento] = valor;
    }

    /***
     *
     * @return Retorna o número de equipamentos registrados
     */
    public int getNumeroEquipamentos() {
        return numeroEquipamentos;
    }

}
