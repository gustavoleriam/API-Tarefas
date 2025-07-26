package com.example.api_tarefas.controller;

import com.example.api_tarefas.model.Tarefa;
import com.example.api_tarefas.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService tarefaService;

    @Autowired
    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @GetMapping
    public List<Tarefa> listarTodas() {
        return tarefaService.listarTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscarPorId(@PathVariable Long id) {
        Optional<Tarefa> tarefa = tarefaService.buscarPorId(id);
        return tarefa.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Tarefa> criarTarefa(@RequestBody Tarefa tarefa) {
        Tarefa novaTarefa = tarefaService.salvar(tarefa);
        return ResponseEntity.ok(novaTarefa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizarTarefa(@PathVariable Long id, @RequestBody Tarefa tarefaAtualizada) {
        Optional<Tarefa> tarefaExistente = tarefaService.buscarPorId(id);

        if (tarefaExistente.isPresent()) {
            Tarefa tarefa = tarefaExistente.get();
            tarefa.setNome(tarefaAtualizada.getNome());
            tarefa.setResponsavel(tarefaAtualizada.getResponsavel());
            tarefa.setDataCriacao(tarefaAtualizada.getDataCriacao());
            tarefaService.salvar(tarefa);
            return ResponseEntity.ok(tarefa);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTarefa(@PathVariable Long id) {
        Optional<Tarefa> tarefa = tarefaService.buscarPorId(id);
        if (tarefa.isPresent()) {
            tarefaService.remover(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
