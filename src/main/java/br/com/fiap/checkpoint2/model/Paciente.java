package br.com.fiap.checkpoint2.model;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pacientes")
public class Paciente extends AbstractEntity<Long> {
	
	
	
	@Column(nullable=false)
	private String nome;
	
	@Column
	private String endereco;
	
	@Column
	private String bairro;
	
	@Column
	private String email;
	
	@Column(name ="telefone_completo")
	private String telefoneCompleto;
	
	@Column(name ="data_nascimento", nullable=false)
	private Date dataNascimento;
	
	@Column(name ="created_at", nullable=false)
	private LocalDate createdAt;
	
	@Column(name ="updated_at", nullable=false)
	private LocalDate updateAt;
	
	
}
