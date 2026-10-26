package org.chainOfResponsability;

public class TipoOcorrenciaPagamento implements TipoOcorrencia {

    private static TipoOcorrenciaPagamento tipoOcorrenciaPagamento = new TipoOcorrenciaPagamento();

    private TipoOcorrenciaPagamento() {};

    public static TipoOcorrenciaPagamento getTipoOcorrenciaPagamento() {
        return tipoOcorrenciaPagamento;
    }

}