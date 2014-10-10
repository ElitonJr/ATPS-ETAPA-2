/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATPS;

/**
 *
 * @author Eliton
 */
public class Fixo extends Equipamento{

    public Fixo(String tipo, String acessorio, String matricula_colaborador, String tipo_acesso_rede, String uso) {
        super(tipo, acessorio, matricula_colaborador, tipo_acesso_rede, uso);
    }
    @Override
    public void imprimirTipoEquipamento(){
        System.out.println("Equipamento Fixo");
    }
}
