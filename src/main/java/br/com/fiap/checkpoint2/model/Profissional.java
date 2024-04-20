package br.com.fiap.checkpoint2.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="profissionais")
public class Profissional extends AbstractEntity<Long> {

	
	
	@Column(nullable=false)
	private String nome;
	
	@Column(nullable=false)
	private String especialidade;
	
	@Column(name="valor_hora")
	private double valorHora;
	
	@Column(name="created_at",nullable=false)
	private LocalDate  createdAt;
	
	@Column(name="update_at",nullable=false)
	private LocalDate  updatedAt;
	
}
