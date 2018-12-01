
package aula_30_11;

import java.util.Objects;


public class Aluno {
    
    
    private String none;
    private Integer idade;

    public Aluno(String none, Integer idade) {
        this.none = none;
        this.idade = idade;
    }

    public String getNone() {
        return none;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setNone(String none) {
        this.none = none;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.none);
        hash = 97 * hash + Objects.hashCode(this.idade);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.none, other.none)) {
            return false;
        }
        if (!Objects.equals(this.idade, other.idade)) {
            return false;
        }
        return true;
    }
    
    
    
}
