package brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_EMPTY, content = JsonInclude.Include.NON_NULL)
public class EnderecoDto implements Serializable {

    public Integer id;
    public String street;
    public String zipCode;
    public String number;
    public String city;



}
