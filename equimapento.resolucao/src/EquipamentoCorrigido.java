public class EquipamentoCorrigido extends Equipamento{

    private static int mesCorrente;

    private int[] mesEquipamentos = new int[super.numeroEquipamentos];
    private static final String[] stringMeses = {"", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho",
    "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    public EquipamentoCorrigido(int mesCorrente, int numeroEquipamento) {
        super(numeroEquipamento);
        this.mesCorrente = mesCorrente;
        atualizarMes();
    }

    public String getMesCompra(int numeroEquipamento) {
        return stringMeses[mesEquipamentos[numeroEquipamento]];
    }

    public void setMesCompra(int numeroEquipamento, int mesCompra) {
        mesEquipamentos[numeroEquipamento] = mesCompra;
    }

    public void corrige(int fator){
        int valor;
        fator = 100 - fator;
        for(int i = 0; i < super.numeroEquipamentos; i++){
            if(mesEquipamentos[i] == mesCorrente){
                valor = (int) fator*this.getValor(i)/100;
                this.setValor(i, valor);
            }
        }
        atualizarMes();
        mesCorrente++;
    }
    void atualizarMes(){
        for(int i=0;i<super.numeroEquipamentos;i++){
            mesEquipamentos[i]++;
            if(mesEquipamentos[i]>12){
                mesEquipamentos[i] = mesEquipamentos[i] % 12;
            }
        }
    }

    void substitui(EquipamentoCorrigido equipamento){
        if(equipamento.getNumeroEquipamentos() == this.numeroEquipamentos){
            for(int i = 0; i < super.numeroEquipamentos; i++){
                this.setValor(i, equipamento.getValor(i));
                this.setMesCompra(i, equipamento.mesEquipamentos[i]);
            }
        }
    }
}
