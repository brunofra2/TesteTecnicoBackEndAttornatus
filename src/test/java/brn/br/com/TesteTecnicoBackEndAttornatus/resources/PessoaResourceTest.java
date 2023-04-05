package brn.br.com.TesteTecnicoBackEndAttornatus.resources;

import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.EnderecoDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.PessoaDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.Resources.PessoaResource;
import brn.br.com.TesteTecnicoBackEndAttornatus.facade.PessoaFacade;
import brn.br.com.TesteTecnicoBackEndAttornatus.model.Endereco;
import org.hibernate.mapping.Any;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
@DisplayName("teste do resource - pessoa")
public class PessoaResourceTest {

    @Mock
    private PessoaFacade pessoaFacade;

    @InjectMocks
    private PessoaResource pessoaResource;

    @Test
    @DisplayName("resources - deve listar todas as transações")
    public void deveListartodasastrasacoes() throws Exception {
        List<PessoaDto> data = List.of(criartransacao());
        Mockito.when(pessoaFacade.findAll()).thenReturn(data);
        pessoaResource.findAll();
        Mockito.verify(pessoaFacade).findAll();
    }

    @Test
    @DisplayName("resources - deve realizar a busca por id")
    public void deveRealizarBuscaPorId()throws Exception {
        Integer id = 1;
        Mockito.when(pessoaFacade.findById(id)).thenReturn(criartransacao());
        pessoaResource.findById(id);
        Mockito.verify(pessoaFacade).findById(id);
    }

    @Test
    @DisplayName("Resources - criar pessoa")
    public void criarPessoa(){
        Mockito.when(pessoaFacade.create(criartransacao())).thenReturn(criartransacao());
        pessoaResource.create(criartransacao());
        Mockito.verify(pessoaFacade).create(criartransacao());
    }

    @Test
    @DisplayName("Resources - alterar pessoa")
    public void alterarPessoa(){
        Mockito.when(pessoaFacade.update(criartransacao())).thenReturn(criartransacao());
        pessoaResource.update(criartransacao());
        Mockito.verify(pessoaFacade).update(criartransacao());
    }


    private PessoaDto criartransacao() {
        List<EnderecoDto> listEnd = new ArrayList<>();
        EnderecoDto end = new EnderecoDto(1,"rua sinamomo","8425000","67","figueira");
        listEnd.add(end);
        PessoaDto pes = new PessoaDto(1,"Bruno","09/07/1994",listEnd);
        return  pes;
    }
}
