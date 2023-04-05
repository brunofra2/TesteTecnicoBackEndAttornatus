package brn.br.com.TesteTecnicoBackEndAttornatus.mapper;

import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.EnderecoDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.PessoaDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.model.Endereco;
import brn.br.com.TesteTecnicoBackEndAttornatus.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaMapper {

    public static List<PessoaDto> convertListModelToDto(List<Pessoa> origin){
        List<PessoaDto> ListPs = new ArrayList<>();
        List<EnderecoDto> listEnd = new ArrayList<>();
        for (Pessoa pessoa : origin
             ) {
            for (Endereco end: pessoa.getEndereco()
            ) { EnderecoDto en = new EnderecoDto(end.getId(),end.getStreet(),end.getZipCode(),end.getNumber(),end.getCity());

                listEnd.add(en);
            }
             PessoaDto ps = new PessoaDto(pessoa.getId(),pessoa.getName(),pessoa.getDateOfBirth(),listEnd);
            ListPs.add(ps);
        }
        return ListPs;
    }

    public static PessoaDto convertModelToDto(Pessoa pessoa){

        List<EnderecoDto> listEnd = new ArrayList<>();
        for (Endereco end: pessoa.getEndereco()
        ) { EnderecoDto en = new EnderecoDto(end.getId(),end.getStreet(),end.getZipCode(),end.getNumber(),end.getCity());

            listEnd.add(en);
        }
        PessoaDto ps = new PessoaDto(pessoa.getId(),pessoa.getName(),pessoa.getDateOfBirth(),listEnd);
        return ps;
    }

    public static Pessoa convertDtoToModel(PessoaDto origin){
        List<Endereco> listEnd = new ArrayList<>();
        for (EnderecoDto end: origin.getEndereco()
             ) {
            Endereco en = new Endereco();
            en.setId(end.getId());
            listEnd.add(en);
        }
        Pessoa ps = new Pessoa(origin.getId(),origin.getName(),origin.getDateOfBirth(),listEnd);
        return  ps;
    }
}
