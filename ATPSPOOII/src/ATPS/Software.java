/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATPS;

/**
 *
 * @author ElitonJr
 */
public class Software {
    String nome;
    String fabricante;
    String versao;
    int numero_nota_fiscal;
    String data_aquisicao;
    String chave_licenciamento;
    String validade_chave;
    String classificacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public int getNumero_nota_fiscal() {
        return numero_nota_fiscal;
    }

    public void setNumero_nota_fiscal(int numero_nota_fiscal) {
        this.numero_nota_fiscal = numero_nota_fiscal;
    }

    public String getData_aquisicao() {
        return data_aquisicao;
    }

    public void setData_aquisicao(String data_aquisicao) {
        this.data_aquisicao = data_aquisicao;
    }

    public String getChave_licenciamento() {
        return chave_licenciamento;
    }

    public void setChave_licenciamento(String chave_licenciamento) {
        this.chave_licenciamento = chave_licenciamento;
    }

    public String getValidade_chave() {
        return validade_chave;
    }

    public void setValidade_chave(String validade_chave) {
        this.validade_chave = validade_chave;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}
