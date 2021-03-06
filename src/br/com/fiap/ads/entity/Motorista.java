package br.com.fiap.ads.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_MOTORISTA")
//@SequenceGenerator(name="motorista", sequenceName = "SQ_T_MOTORISTA")
public class Motorista {

	@Id
	@Column(name="nr_carteira")
	//@GeneratedValue(generator = "motorista", strategy = GenerationType.SEQUENCE)
	private int numCarteira;

	@Column(name="nm_motorista", nullable = false, length = 150)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_nascimento")
	private Calendar dataNascimento;
	
	@Lob
	@Column(name="fl_carteira")
	private byte[] foto;
	
	@Column(name="ds_genero")
	@Enumerated(EnumType.STRING)
	private Genero genero;
	
	
	public Motorista() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Motorista(int numCarteira, String nome, Calendar dataNascimento, byte[] foto, Genero genero) {
		super();
		this.numCarteira = numCarteira;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.foto = foto;
		this.genero = genero;
	}
	
	public int getNumCarteira() {
		return numCarteira;
	}

	public void setNumCarteira(int numCarteira) {
		this.numCarteira = numCarteira;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
}
