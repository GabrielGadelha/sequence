package br.edu.ufersa.gabriel.model.DAO;
import java.util.List;

public interface BaseInterDAO <VO> {
 public void inserir(VO entity);
 public void editar(VO entity);
 public void remover(VO entity);
 public VO buscarPorID(VO entity);
 public VO buscarPorNome(VO entity);
 public List<VO> listar();
}
