/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.cadastroveiculos.repository;
import com.example.cadastroveiculos.model.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FabricanteRepository extends JpaRepository<Fabricante, Long> {
}
//—---------------------
package com.example.cadastroveiculos.repository;
import com.example.cadastroveiculos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
//—----------------------------
package com.example.cadastroveiculos.repository;
import com.example.cadastroveiculos.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, String> {
}

