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
public class Equipamento {
    String tipo;
    String acessorio;
    String matricula_colaborador;
    String tipo_acesso_rede;
    String uso;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(String acessorio) {
        this.acessorio = acessorio;
    }

    public String getMatricula_colaborador() {
        return matricula_colaborador;
    }

    public void setMatricula_colaborador(String matricula_colaborador) {
        this.matricula_colaborador = matricula_colaborador;
    }

    public String getTipo_acesso_rede() {
        return tipo_acesso_rede;
    }

    public void setTipo_acesso_rede(String tipo_acesso_rede) {
        this.tipo_acesso_rede = tipo_acesso_rede;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
}
