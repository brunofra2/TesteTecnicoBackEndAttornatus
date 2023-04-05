package brn.br.com.TesteTecnicoBackEndAttornatus.services;

import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.EnderecoDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.PessoaDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.Repositories.PessoaRepository;
import brn.br.com.TesteTecnicoBackEndAttornatus.model.Endereco;
import brn.br.com.TesteTecnicoBackEndAttornatus.model.Pessoa;
import brn.br.com.TesteTecnicoBackEndAttornatus.services.impl.PessoaServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
@DisplayName("teste do service - pessoa")
public class PessoaServiceTest {

    @Mock
    private PessoaRepository pessoaRepository;

    @InjectMocks
    private PessoaServiceImpl pessoaService;

    @Test
    @DisplayName("services - deve listar todas as transações")
    public void deveListartodasastrasacoes() throws Exception {
        List<Pessoa> data = List.of(criartransacaoModel());
        Mockito.when(pessoaRepository.findAll()).thenReturn(data);
        pessoaService.findAll();
        Mockito.verify(pessoaRepository).findAll();
    }

    @Test
    @DisplayName("services - deve realizar a busca por id")
    public void deveRealizarBuscaPorId()throws Exception {
        Integer id = 1;
        Mockito.when(pessoaRepository.findById(id)).thenReturn(criartransacaoOptional());
        pessoaService.findById(id);
        Mockito.verify(pessoaRepository).findById(id);
    }



    private Pessoa criartransacaoModel() {
        List<Endereco> listEnd = new ArrayList<>();
        Endereco end = new Endereco(1,"rua sinamomo","8425000","67","figueira");
        listEnd.add(end);
        Pessoa pes = new Pessoa(1,"Bruno","09/07/1994",listEnd);
        return  pes;
    }

    private Optional<Pessoa> criartransacaoOptional() {
        List<Endereco> listEnd = new ArrayList<>();
        Endereco end = new Endereco(1,"rua sinamomo","8425000","67","figueira");
        listEnd.add(end);
        Pessoa pes = new Pessoa(1,"Bruno","09/07/1994",listEnd);
        Optional<Pessoa> optPes = Optional.of(pes);
        return  optPes;
    }

    private PessoaDto criartransacaoDto() {
        List<EnderecoDto> listEnd = new ArrayList<>();
        EnderecoDto end = new EnderecoDto(1,"rua sinamomo","8425000","67","figueira");
        listEnd.add(end);
        PessoaDto pes = new PessoaDto(1,"Bruno","09/07/1994",listEnd);
        return  pes;
    }
}
