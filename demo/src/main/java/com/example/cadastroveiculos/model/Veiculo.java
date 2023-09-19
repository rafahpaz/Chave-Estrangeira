/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cadastroveiculos.model;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
@Entity
@Getter
@Setter
public class Veiculo {
    @Id
    private String placa;
    private String modelo;
    private int ano;
    private String cor;


    @ManyToOne
    private Fabricante fabricante;


    @ManyToOne
    private Categoria categoria;
}


