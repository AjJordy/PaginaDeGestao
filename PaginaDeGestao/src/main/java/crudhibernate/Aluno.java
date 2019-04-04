package crudhibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
  
@Entity
@Table(name = "aluno")
public class Aluno {
  
    @Id
    private int id;
    @Column
    private String materia;
    @Column    
    private String nome;
    @Column
    private String matricula;

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

    public String getMateria() {
        return nome;
    }
  
    public void setMateria(String materia) {
        this.materia = materia;
    }
   
    public String getMatricula() {
        return matricula;
    }
   
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
    