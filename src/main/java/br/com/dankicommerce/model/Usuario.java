package br.com.dankicommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import br.com.olimposistema.aipa.model.Model;

@Entity
public class Usuario extends Model {
	
	
	
	@NotEmpty @Size(min = 3, max= 100, message = "{usuario.nome.size}")
	private String nome;
	
	@NotEmpty @Email @Column(unique = true)
	private String email;
	
	@NotEmpty @Size(min = 6, max= 20, message = "{usuario.senha.size}")
	private String senha;
			
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
