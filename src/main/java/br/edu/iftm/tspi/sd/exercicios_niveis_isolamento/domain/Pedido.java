/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.iftm.tspi.sd.exercicios_niveis_isolamento.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import org.springframework.aot.generate.GenerationContext;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="TB_PEDIDO")
@Getter
@Setter
@NoArgsConstructor
class Pedido implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationContext.IDENTITY)
    @Column(name="num_pedido")
    private Integer numero;

    @Column(name="num_pedido")
    private LocalDate data;

    @OneToMany(fetch=FetchType.EAGER, mappedBy = "pedido", CascadeType.ALL, orphanRemoval = true)
    private List<ItemPedido> itens;
}
