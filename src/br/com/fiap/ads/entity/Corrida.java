package br.com.fiap.ads.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_corrida")
@SequenceGenerator(name = "corrida", sequenceName = "SQ_T_CORRIDA", allocationSize = 1)
public class Corrida {
	
	@Id
	@Column(name = "cd_corrida")
	@GeneratedValue(generator = "corrida", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name = "ds_origem", length = 200, nullable = false)
	private String origem;
	
	@Column(name = "ds_destino", length = 200, nullable = false)
	private String Destino;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_corrida")
	private Calendar dataCorrida;
	
	@Column(name = "vl_valor")
	private double valor;
}
