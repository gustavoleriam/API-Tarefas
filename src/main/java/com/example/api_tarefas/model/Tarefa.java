package com.example.api_tarefas.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Table(name = "tarefas")
public class Tarefa {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(nullable = false, updatable = false)
    private LocalDate dataCriacao;
    private String responsavel;

    public Tarefa(Long id, String nome, LocalDate dataCriacao, String responsavel) {
        this.id = id;
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.responsavel = responsavel;
    }
    public Tarefa() {

    }

}


