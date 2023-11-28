/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.josephus;
import javax.swing.JOptionPane;
/**
 *
 * @author Pc-lab
 */
public class Josephus {

    public static void main(String[] args) {
        Pessoas pessoas = new Pessoas();
        Sobrevivente sobrevivente = new Sobrevivente();

        String m = JOptionPane.showInputDialog("Digite um numero aleatório:");
        int n = Integer.parseInt(m);

        int sobreviventeNumero = sobrevivente.encontrarSobrevivente(n);

        Pessoas.Pessoa sobreviventeData = null;
        for (Pessoas.Pessoa pessoa : pessoas.getListaDePessoas()) {
            if (pessoa.getNumero() == sobreviventeNumero) {
                sobreviventeData = pessoa;
                break;
            }
        }

        String resp = "O SOBREVIVENTE É O DE NUMERO: " + sobreviventeNumero + "\n";
        resp += "\nNome: " + sobreviventeData.getNome();
        resp += "\nTelefone: " + sobreviventeData.getTelefone();
        resp += "\nEndereço: " + sobreviventeData.getEndereco();
        resp += "\nCPF: " + sobreviventeData.getCpf();

        JOptionPane.showMessageDialog(null, resp);
    }
}

