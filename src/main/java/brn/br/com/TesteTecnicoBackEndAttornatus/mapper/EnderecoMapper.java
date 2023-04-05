package brn.br.com.TesteTecnicoBackEndAttornatus.mapper;

import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.EnderecoDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.PessoaDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.model.Endereco;
import brn.br.com.TesteTecnicoBackEndAttornatus.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class EnderecoMapper {

    public static List<EnderecoDto> convertListModelToDto(List<Endereco> origin){
        List<EnderecoDto> ListEd = new ArrayList<>();
        for (Endereco endereco : origin
        ) {
            EnderecoDto en = new EnderecoDto(endereco.getId(),endereco.getStreet(),endereco.getZipCode(),endereco.getNumber(),endereco.getCity());

            ListEd.add(en);
        }
        return ListEd;
    }

    public static EnderecoDto convertModelToDto(Endereco endereco){

        EnderecoDto en = new EnderecoDto(endereco.getId(),endereco.getStreet(),endereco.getZipCode(),endereco.getNumber(),endereco.getCity());
          return en;
    }

    public static Endereco convertDtoToModel(EnderecoDto origin){
        Endereco en = new Endereco(origin.getId(),origin.getStreet(),origin.getZipCode(),origin.getNumber(),origin.getCity());
         return  en;
    }
}
