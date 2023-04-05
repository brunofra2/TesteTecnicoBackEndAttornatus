package brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.namespace.QName;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_EMPTY, content = JsonInclude.Include.NON_NULL)
public class PessoaDto implements Serializable {

        private Integer id;
        private String name;
        private String dateOfBirth;
        @JsonProperty("endereco")
        private List<EnderecoDto> endereco;

}
