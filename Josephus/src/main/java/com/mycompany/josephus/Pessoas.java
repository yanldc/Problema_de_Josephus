/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.josephus;
import java.util.ArrayList;
/**
 *
 * @author Pc-lab
 */
public class Pessoas {
    ArrayList<Pessoa> listaDePessoas;

    public Pessoas() {
        listaDePessoas = new ArrayList<>();

        listaDePessoas.add(new Pessoa(1, "Teste 1", "(01)0101-0101", "Av. 1, nº1, Setor Central", "111.111.111-01"));
        listaDePessoas.add(new Pessoa(2, "Teste 2", "(02)0202-0202", "Av. 2, nº2, Setor Central", "222.222.222-02"));
        listaDePessoas.add(new Pessoa(3, "Teste 3", "(03)0303-0303", "Av. 3, nº3, Setor Central", "333.333.333-03"));
        listaDePessoas.add(new Pessoa(4, "Teste 4", "(04)0404-0404", "Av. 4, nº4, Setor Central", "444.444.444-04"));
        listaDePessoas.add(new Pessoa(5, "Teste 5", "(05)0505-5005", "Av. 5, nº5, Setor Central", "555.555.555-05"));
        listaDePessoas.add(new Pessoa(6, "Teste 6", "(06)0606-0606", "Av. 6, nº6, Setor Central", "666.666.666-06"));
        listaDePessoas.add(new Pessoa(7, "Teste 7", "(07)0707-0707", "Av. 7, nº7, Setor Central", "777.777.777-07"));
        listaDePessoas.add(new Pessoa(8, "Teste 8", "(08)0808-0808", "Av. 8, nº8, Setor Central", "888.888.888-08"));
        listaDePessoas.add(new Pessoa(9, "Teste 9", "(09)0909-0909", "Av. 9, nº9, Setor Central", "999.999.999-09"));
        listaDePessoas.add(new Pessoa(10, "Teste 10", "(10)1010-1010", "Av. 10, nº10, Setor Central", "111.111.111-10"));
        listaDePessoas.add(new Pessoa(11, "Teste 11", "(11)1111-1111", "Av. 11, nº11, Setor Central", "222.222.222-11"));
        listaDePessoas.add(new Pessoa(12, "Teste 12", "(12)1212-1212", "Av. 12, nº12, Setor Central", "333.333.333-12"));
        listaDePessoas.add(new Pessoa(13, "Teste 13", "(13)1313-1313", "Av. 13, nº13, Setor Central", "444.444.444-13"));
        listaDePessoas.add(new Pessoa(14, "Teste 14", "(14)1414-1414", "Av. 14, nº14, Setor Central", "555.555.555-14"));
        listaDePessoas.add(new Pessoa(15, "Teste 15", "(15)1515-1515", "Av. 15, nº15, Setor Central", "666.666.666-15"));
        listaDePessoas.add(new Pessoa(16, "Teste 16", "(16)1616-1616", "Av. 16, nº16, Setor Central", "777.777.777-16"));
        listaDePessoas.add(new Pessoa(17, "Teste 17", "(17)1717-1717", "Av. 17, nº17, Setor Central", "888.888.888-17"));
        listaDePessoas.add(new Pessoa(18, "Teste 18", "(18)1818-1818", "Av. 18, nº18, Setor Central", "999.999.999-18"));
        listaDePessoas.add(new Pessoa(19, "Teste 19", "(19)1919-1919", "Av. 19, nº19, Setor Central", "111.111.111-19"));
        listaDePessoas.add(new Pessoa(20, "Teste 20", "(20)2020-2020", "Av. 20, nº20, Setor Central", "222.222.222-20"));
    }

    public ArrayList<Pessoa> getListaDePessoas() {
        return listaDePessoas;
    }

    public class Pessoa {
        private int numero;
        private String nome;
        private String tel;
        private String end;
        private String cpf;

        public Pessoa(int numero, String nome, String tel, String end, String cpf) {
            this.numero = numero;
            this.nome = nome;
            this.tel = tel;
            this.end = end;
            this.cpf = cpf;
        }

        public int getNumero() {
            return numero;
        }

        public String getNome() {
            return nome;
        }

        public String getTelefone() {
            return tel;
        }

        public String getEndereco() {
            return end;
        }

        public String getCpf() {
            return cpf;
        }
    }
}