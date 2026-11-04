/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class SistemaBanco {
    public static void main(String[] args) {
      
        ContaCorrente cc = new ContaCorrente(1, "Ana", 15.00);
        ContaPoupanca cp = new ContaPoupanca(2, "Bruno", 0.01);

        
        cc.depositar(100.00);
        cp.depositar(100.00);

        
        cc.exibirSaldo();
        cp.exibirSaldo();

        
        cc.sacar(500.00);
        cc.depositar(-10.00);

        
        cc.fecharMes();
        cp.fecharMes();

      
        cc.exibirSaldo();
        cp.exibirSaldo();
    }
}