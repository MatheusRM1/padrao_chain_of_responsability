package org.chainOfResponsability;

public class ResponsavelAtendimento extends Responsavel {

    public ResponsavelAtendimento(Responsavel superior) {
        listaOcorrencias.add(TipoOcorrenciaAtraso.getTipoOcorrenciaAtraso());
        setResponsavelSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Atendimento";
    }

}
