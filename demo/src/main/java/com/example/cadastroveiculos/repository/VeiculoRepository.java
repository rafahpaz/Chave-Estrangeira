/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.cadastroveiculos.repository;


import com.example.cadastroveiculos.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
}

