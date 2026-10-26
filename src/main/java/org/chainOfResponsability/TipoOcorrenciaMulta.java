package org.chainOfResponsability;

public class TipoOcorrenciaMulta implements TipoOcorrencia {

    private static TipoOcorrenciaMulta tipoOcorrenciaMulta = new TipoOcorrenciaMulta();

    private TipoOcorrenciaMulta() {};

    public static TipoOcorrenciaMulta getTipoOcorrenciaMulta() {
        return tipoOcorrenciaMulta;
    }

}
