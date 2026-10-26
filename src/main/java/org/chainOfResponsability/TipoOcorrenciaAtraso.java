package org.chainOfResponsability;

public class TipoOcorrenciaAtraso implements TipoOcorrencia {

    private static TipoOcorrenciaAtraso tipoOcorrenciaAtraso = new TipoOcorrenciaAtraso();

    private TipoOcorrenciaAtraso() {};

    public static TipoOcorrenciaAtraso getTipoOcorrenciaAtraso() {
        return tipoOcorrenciaAtraso;
    }

}
