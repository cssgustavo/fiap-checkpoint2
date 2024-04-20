package br.com.fiap.checkpoint2.model;

import java.time.LocalDate;

import br.com.fiap.checkpoint2.util.StatusConsulta;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="consultas")
public class Consulta extends AbstractEntity<Long>{
	
	
	
	@ManyToOne
	@JoinColumn(name="profissional_id",nullable=false)
	private Profissional profissional;
	
	@ManyToOne
	@JoinColumn(name="paciente_id", nullable=false)
	private Paciente paciente;
	
	@Column(name ="data_consulta", nullable=false)
	private  LocalDate  dataConsulta;
	
	@Column(name="status_consulta",nullable=false)
	@Enumerated(EnumType.STRING)
	private StatusConsulta statusConsulta;
	
	@Column(name="quantidade_horas")
	private double quantidadeHoras;
	
	@Column(name="valor_consulta")
	private double valorConsulta;
}
