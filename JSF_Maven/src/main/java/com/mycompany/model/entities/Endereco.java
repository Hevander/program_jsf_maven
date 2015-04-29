/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Hevander
 */
@Entity
@Table (name = "endereco")
public class Endereco implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue//Auto incrementa o ID
    @Column(name = "IdEndereco", nullable = false)
    private Integer idEndereco;
    @Column(name = "Bairro", length = 80)
    private String bairro;
    @Column(name = "NomeLogradouro", length = 80)
    private String nomeLogradouro;
    @Column(name = "CEP", length = 9)
    private String cep;
    @Column(name = "Numero")
    private Integer numero;
    @Column(name = "Complemento")
    private Integer complemento;
    
    
}
