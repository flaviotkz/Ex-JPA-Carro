package br.com.fiap.ads.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "T_PAGAMENTO")
@SequenceGenerator(name = "pagamento", sequenceName = "SQ_T_PAGAMENTO", allocationSize = 1)
public class Pagamento {
	@Id
	@Column(name= "cd_pagamento")
	private int codigo;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_pagamento")
	private Calendar dataPagamento;
	
	@Column(name="vl_pagamento")
	private double valor;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ds_forma_paamento")
	private FormaPagamento formaPagamento;

	public Pagamento() {
		super();
	}

	public Pagamento(Calendar dataPagamento, double valor, FormaPagamento formaPagamento) {
		super();
		this.dataPagamento = dataPagamento;
		this.valor = valor;
		this.formaPagamento = formaPagamento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Calendar getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Calendar dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	
}
