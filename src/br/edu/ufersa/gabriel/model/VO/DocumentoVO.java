
package br.edu.ufersa.gabriel.model.VO;
import java.util.Calendar;
public class DocumentoVO{
    long id;
    String tipo;
    String local;
    Calendar dataInclusao;
    Calendar dataExpiracao;

    public DocumentoVO(String t, String l, Calendar d1, Calendar d2){
        tipo = t;
        local = l;
        dataInclusao = d1;
        dataExpiracao = d2;
    }


}
