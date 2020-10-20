/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.bd.jogo;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Tercio
 */
@Entity
public class ComandoExat extends Comando{

    @OneToOne
    private Habilidade habilidade;
    
    @Override
    public int executar(int opcao){
        return habilidade.habExat(opcao);
    }
}
