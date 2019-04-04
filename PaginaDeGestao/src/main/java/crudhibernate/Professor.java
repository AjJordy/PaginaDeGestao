package crudhibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
  
@Entity
@Table(name = "professor")
public class Professor {
  
    @Id 
    private int id;
    @Column   
    private String nome;
    @Column
    private String materia;
    @Column
    private String login;
    @Column
    private String senha;

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

    public String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getMateria() {
        return nome;
    }
  
    public void setMateria(String materia) {
        this.materia = materia;
    }
    
}
    