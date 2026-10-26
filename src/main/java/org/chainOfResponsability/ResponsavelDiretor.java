package org.chainOfResponsability;

public class ResponsavelDiretor extends Responsavel {

    public ResponsavelDiretor(Responsavel superior) {
        listaOcorrencias.add(TipoOcorrenciaAcidente.getTipoOcorrenciaAcidente());
        setResponsavelSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor";
    }

}