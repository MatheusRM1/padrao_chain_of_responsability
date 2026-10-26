
import org.chainOfResponsability.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class OcorrenciaTest {

    ResponsavelProprietario proprietario;
    ResponsavelDiretor diretor;
    ResponsavelGerente gerente;
    ResponsavelAtendimento atendimento;

    @BeforeEach
    void setUp() {
        proprietario = new ResponsavelProprietario(null);
        diretor = new ResponsavelDiretor(proprietario);
        gerente = new ResponsavelGerente(diretor);
        atendimento = new ResponsavelAtendimento(gerente);
    }

    @Test
    void deveRetornarAtendimentoParaTratamentoAtraso() {
        assertEquals("Atendimento", atendimento.tratarOcorrencia(new Ocorrencia(TipoOcorrenciaAtraso.getTipoOcorrenciaAtraso())));
    }

    @Test
    void deveRetornarGerenteParaTratamentoAvaria() {
        assertEquals("Gerente", atendimento.tratarOcorrencia(new Ocorrencia(TipoOcorrenciaAvaria.getTipoOcorrenciaAvaria())));
    }

    @Test
    void deveRetornarDiretorParaTratamentoAcidente() {
        assertEquals("Diretor", atendimento.tratarOcorrencia(new Ocorrencia(TipoOcorrenciaAcidente.getTipoOcorrenciaAcidente())));
    }

    @Test
    void deveRetornarProprietarioParaTratamentoPagamento() {
        assertEquals("Proprietário", atendimento.tratarOcorrencia(new Ocorrencia(TipoOcorrenciaPagamento.getTipoOcorrenciaPagamento())));
    }

    @Test
    void deveRetornarSemResponsavelParaTratamentoMulta() {
        assertEquals("Sem responsável", atendimento.tratarOcorrencia(new Ocorrencia(TipoOcorrenciaMulta.getTipoOcorrenciaMulta())));
    }

}
