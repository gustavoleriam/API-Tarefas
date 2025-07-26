package com.example.api_tarefas.repository;

import com.example.api_tarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository   extends JpaRepository<Tarefa, Long> {



}
