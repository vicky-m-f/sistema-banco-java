/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author aluno
 */
public class ContaCorrente extends Conta implements FechamentoMensal {
    private double taxaManutencao;

    public ContaCorrente(int numero, String titular, double taxaManutencao) {
        super(numero, titular);
        this.taxaManutencao = taxaManutencao;
    }

    public void cobrarManutencao() {
        if (super.sacar(taxaManutencao)) {
            System.out.println("Manutenção de R$ 15,00 cobrada da conta " + getNumero() + ".");
        }
    }

    @Override
    public void fecharMes() {
        cobrarManutencao();
    }
}