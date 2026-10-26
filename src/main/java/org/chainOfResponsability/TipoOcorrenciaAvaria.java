package org.chainOfResponsability;

ppublic class TipoOcorrenciaAvaria implements TipoOcorrencia {

    private static TipoOcorrenciaAvaria tipoOcorrenciaAvaria = new TipoOcorrenciaAvaria();

    private TipoOcorrenciaAvaria() {};

    public static TipoOcorrenciaAvaria getTipoOcorrenciaAvaria() {
        return tipoOcorrenciaAvaria;
    }

}