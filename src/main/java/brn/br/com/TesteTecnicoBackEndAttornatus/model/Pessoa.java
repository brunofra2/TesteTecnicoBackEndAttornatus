package brn.br.com.TesteTecnicoBackEndAttornatus.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import javax.annotation.processing.Generated;
import java.io.Serializable;
import java.util.List;

@Entity(name = "Pessoa")
@Table(name = "Pessoa")
@Data
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String dateOfBirth;

    @OneToMany
    @JsonProperty("endereco")
    private List<Endereco> endereco;

    public Pessoa(){

    }
    public Pessoa(Integer id,String name, String dateOfBirth,List<Endereco> en) {
        if(id != null){
            this.id = id;
        }
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.endereco = en;
    }
}
