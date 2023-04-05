package brn.br.com.TesteTecnicoBackEndAttornatus.Facades;

import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.EnderecoDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.Data.vo.PessoaDto;
import brn.br.com.TesteTecnicoBackEndAttornatus.facade.impl.PessoaFacadeImpl;
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

@RunWith(MockitoJUnitRunner.class)
@DisplayName("teste do facade - pessoa")
public class PessoaFacadeTest {

    @Mock
    private PessoaServiceImpl pessoaService;

    @InjectMocks
    private PessoaFacadeImpl pessoaFacade;

    @Test
    @DisplayName("facades - deve listar todas as transações")
    public void deveListartodasastrasacoes() throws Exception {
        List<Pessoa> data = List.of(criartransacaoModel());
        Mockito.when(pessoaService.findAll()).thenReturn(data);
        pessoaFacade.findAll();
        Mockito.verify(pessoaService).findAll();
    }

    @Test
    @DisplayName("facades - deve realizar a busca por id")
    public void deveRealizarBuscaPorId()throws Exception {
        Integer id = 1;
        Mockito.when(pessoaService.findById(id)).thenReturn(criartransacaoModel());
        pessoaFacade.findById(id);
        Mockito.verify(pessoaService).findById(id);
    }

    @Test
    @DisplayName("facades - criar pessoa")
    public void criarPessoa(){
        Mockito.when(pessoaService.create(criartransacaoDto())).thenReturn(criartransacaoDto());
        pessoaFacade.create(criartransacaoDto());
        Mockito.verify(pessoaService).create(criartransacaoDto());
    }

    @Test
    @DisplayName("facades - alterar pessoa")
    public void alterarPessoa(){
        Mockito.when(pessoaService.update(criartransacaoDto())).thenReturn(criartransacaoDto());
        pessoaFacade.update(criartransacaoDto());
        Mockito.verify(pessoaService).update(criartransacaoDto());
    }


    private Pessoa criartransacaoModel() {
        List<Endereco> listEnd = new ArrayList<>();
        Endereco end = new Endereco(1,"rua sinamomo","8425000","67","figueira");
        listEnd.add(end);
        Pessoa pes = new Pessoa(1,"Bruno","09/07/1994",listEnd);
        return  pes;
    }

    private PessoaDto criartransacaoDto() {
        List<EnderecoDto> listEnd = new ArrayList<>();
        EnderecoDto end = new EnderecoDto(1,"rua sinamomo","8425000","67","figueira");
        listEnd.add(end);
        PessoaDto pes = new PessoaDto(1,"Bruno","09/07/1994",listEnd);
        return  pes;
    }
}
