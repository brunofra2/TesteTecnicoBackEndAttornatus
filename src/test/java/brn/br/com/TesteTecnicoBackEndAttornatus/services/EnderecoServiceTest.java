package brn.br.com.TesteTecnicoBackEndAttornatus.services;

import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.EnderecoDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.Repositories.EnderecoRepository;
import brn.br.com.TesteTecnicoBackEndAttornatus.model.Endereco;
import brn.br.com.TesteTecnicoBackEndAttornatus.services.impl.EnderecoServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
@DisplayName("teste do service - endereco")
public class EnderecoServiceTest {

    @Mock
    private EnderecoRepository enderecoRepository;

    @InjectMocks
    private EnderecoServiceImpl enderecoService;

    @Test
    @DisplayName("resources - deve listar todas as transações")
    public void deveListartodasastrasacoes() throws Exception {
        List<Endereco> data = List.of(criartransacaoModel());
        Mockito.when(enderecoRepository.findAll()).thenReturn(data);
        enderecoService.findAll();
        Mockito.verify(enderecoRepository).findAll();
    }

    @Test
    @DisplayName("resources - deve realizar a busca por id")
    public void deveRealizarBuscaPorId()throws Exception {
        Integer id = 1;
        Mockito.when(enderecoRepository.findById(id)).thenReturn(criartransacaoOptional());
        enderecoService.findById(id);
        Mockito.verify(enderecoRepository).findById(id);
    }



    private Optional<Endereco>  criartransacaoOptional() {
        Endereco end = new Endereco(1,"rua sinamomo","8425000","67","figueira");
        Optional<Endereco> optEnd = Optional.of(end);
        return  optEnd;
    }
    private Endereco criartransacaoModel() {
        Endereco end = new Endereco(1,"rua sinamomo","8425000","67","figueira");
        return  end;
    }
}
