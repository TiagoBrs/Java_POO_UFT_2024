public class EquipamentoCorrigido extends Equipamento{

    private static int mesCorrente;

    private int[] mesEquipamentos = new int[super.numeroEquipamentos];
    private static final String[] stringMeses = {"", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho",
    "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    /***
     *
     * @param mesCorrente
     * @param numeroEquipamento
     *
     * Construtor: Inicializa o construtor da super classe e adiciona a funcionalidade de registrar o mês de compra
     * de cada equipamento(Iniciando de janeiro)
     */
    public EquipamentoCorrigido(int mesCorrente, int numeroEquipamento) {
        super(numeroEquipamento);
        this.mesCorrente = mesCorrente;
        atualizarMes();
    }

    /***
     *
     * @param numeroEquipamento
     * @return Retorna o mẽs que o dado equipamento foi comprado
     */
    public String getMesCompra(int numeroEquipamento) {
        return stringMeses[mesEquipamentos[numeroEquipamento]];
    }

    /***
     *
      * @param numeroEquipamento
     * @param mesCompra
     *
     * Permite configurar o mês de compra de um dado equipamento
     */
    public void setMesCompra(int numeroEquipamento, int mesCompra) {
        mesEquipamentos[numeroEquipamento] = mesCompra;
    }

    /***
     *
     * @param fator
     *
     * Dado um fator de correção ,corrige os valores de todos os equipamentos cujo o mẽs seja igual à variável de classe
     * mesCorrente
     */
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

    /***
     * Função auxiliar que atualiza os meses de todos os equipamentos em uma unidade
     */
    void atualizarMes(){
        for(int i=0;i<super.numeroEquipamentos;i++){
            mesEquipamentos[i]++;
            if(mesEquipamentos[i]>12){
                mesEquipamentos[i] = mesEquipamentos[i] % 12;
                if(mesEquipamentos[i] == 0) mesEquipamentos[i]++;
            }
        }
    }

    /***
     *
     * @param equipamento
     *
     * Substitui os valores e meses dos equipamentos atuais pelo dos equipamentos passados como
     * parâmetro. A operaçõa é realizada se o número de equipamentos de ambos forem iguais.
     */
    void substitui(EquipamentoCorrigido equipamento){
        if(equipamento.getNumeroEquipamentos() == this.numeroEquipamentos){
            for(int i = 0; i < super.numeroEquipamentos; i++){
                this.setValor(i, equipamento.getValor(i));
                this.setMesCompra(i, equipamento.mesEquipamentos[i]);
            }
        }
        else{
            throw new TamanhosDiferentesException("O número de equipamentos devem ser iguais");
        }
    }
}
