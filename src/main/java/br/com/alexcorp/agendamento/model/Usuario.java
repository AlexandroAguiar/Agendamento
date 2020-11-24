package br.com.alexcorp.agendamento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                     // esta anotação diz que a classe usuario é uma classe armazenavel em branco
@Table(name="tbl_usuario") // a anotação @Table permite definir o nome da tabela que existe no banco
public class Usuario {  
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id_user")
	private int id;
	
	@Column(name="nome", length=100)
	private String nome;
	
	@Column(name="email", length=100)
	private String email;
	
	@Column(name="racf", length=7)
	private String racf;
	
	@Column(name="senha", length=50)
	private String senha;
	
	@Column(name="link_foto", length=255)
	private String LinkFoto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRacf() {
		return racf;
	}

	public void setRacf(String racf) {
		this.racf = racf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLinkFoto() {
		return LinkFoto;
	}

	public void setLinkFoto(String linkFoto) {
		LinkFoto = linkFoto;
	}
		

}
