public class Equipamento {
    private int valor;
    int numeroEquipamentos;
    protected int[] lista_equipamentos;

    public Equipamento(int numeroEquipamentos){
        this.numeroEquipamentos = numeroEquipamentos;
        lista_equipamentos = new int[numeroEquipamentos];
    }

    public int getValor(int numeroEquipamento) {
        return lista_equipamentos[numeroEquipamento];
    }
    public void setValor(int numeroEquipamento, int valor) {
        lista_equipamentos[numeroEquipamento] = valor;
    }

    public int getNumeroEquipamentos() {
        return numeroEquipamentos;
    }

}
