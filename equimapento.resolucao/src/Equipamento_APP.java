public class Equipamento_APP {
    public static void main(String[] args) {
        EquipamentoCorrigido equipamentos = new EquipamentoCorrigido(1,10);

        for(int i=0; i< equipamentos.getNumeroEquipamentos(); i++){
            equipamentos.setValor(i, 1000);
        }

        //Por exemplo podemos recuperar o valor do primeiro equipamento e o seu mes de compra:
        System.out.println("O valor do primeiro equipamento é "+equipamentos.getValor(0));
        System.out.println("Mês do primeiro equipamento: "+equipamentos.getMesCompra(0));
        System.out.println();

        //Podemos setar um mês para o primeiro equipamentos:
        equipamentos.setMesCompra(0, 4);

        // Agora faremos uma correção de 40% para os equipamentos comprados no mês corrente(1). Isso modificará os valores de
        // todos os equipamento, salvo o primeiro. O mês corrente e de todos os equipamentos deverá ser incrementado.

        equipamentos.corrige(40);

        for(int i=0; i< equipamentos.getNumeroEquipamentos(); i++){
            System.out.printf("Equipamento %d: valor = %d%n", i, equipamentos.getValor(i));
        }
        // E de fato, o mês do equipamento que antes era quatro agora é 5.
        System.out.println("Mês corrente do primeiro equipamento: "+equipamentos.getMesCompra(0));

        //Por fim testando a última funcionalidade, que é a troca de equipamentos.

        EquipamentoCorrigido novosEquipamentos = new EquipamentoCorrigido(1,10);

        //Setando valores para os novos equipamentos

        for(int i=0; i< novosEquipamentos.getNumeroEquipamentos(); i++){
            novosEquipamentos.setValor(i, 5000);
        }
        System.out.println();
        //Substituição

        equipamentos.substitui(novosEquipamentos);

        for(int i=0; i< equipamentos.getNumeroEquipamentos(); i++){
            System.out.printf("Mes = %s --- Equipamento %d: valor = %d%n", equipamentos.getMesCompra(i), i, equipamentos.getValor(i));
        }
    }
}
