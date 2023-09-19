/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cadastroveiculos.controller;
import com.example.cadastroveiculos.model.Veiculo;
import com.example.cadastroveiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.ResponseEntity;
@CrossOrigin(origins = "http://localhost:5173")//Endereço do front
@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
    @Autowired
    private VeiculoRepository veiculoRepository;
    @GetMapping
    public List<Veiculo> listarVeiculos() {
        return veiculoRepository.findAll();
    }
    @PostMapping
    public Veiculo criarVeiculo(@RequestBody Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }
     @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarVeiculo(@PathVariable Long id) {
        if (veiculoRepository.existsById(id)) {
            veiculoRepository.deleteById(id);
            return ResponseEntity.ok("Veiculo deletado com sucesso.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Veiculo> atualizarVeiculo(@PathVariable Long id, @RequestBody Veiculo veiculoAtualizado) {
        if (veiculoRepository.existsById(id)) {
            Veiculo veiculo = veiculoRepository.findById(id).get();
            veiculo.setPlaca(veiculoAtualizado.getPlaca());
            veiculo.setMontadora(veiculoAtualizado.getMontadora());
            veiculo.setModelo(veiculoAtualizado.getModelo());
            veiculo.setAno(veiculoAtualizado.getAno());

            Veiculo veiculoAtualizadoBD = veiculoRepository.save(veiculo);
            return ResponseEntity.ok(veiculoAtualizadoBD);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

