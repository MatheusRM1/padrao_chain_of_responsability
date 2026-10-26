package org.chainOfResponsability;

public class TipoOcorrenciaAcidente implements TipoOcorrencia {

    private static TipoOcorrenciaAcidente tipoOcorrenciaAcidente = new TipoOcorrenciaAcidente();

    private TipoOcorrenciaAcidente() {};

    public static TipoOcorrenciaAcidente getTipoOcorrenciaAcidente() {
        return tipoOcorrenciaAcidente;
    }

}