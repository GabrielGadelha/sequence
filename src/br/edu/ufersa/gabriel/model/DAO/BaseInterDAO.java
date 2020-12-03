package br.edu.ufersa.gabriel.model.DAO;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface BaseInterDAO <VO> {
 public void inserir(VO entity); 
 public void atualizar(VO entity);
 public void deletar(VO entity);
 public ResultSet buscarPorId(VO entity);
 public ResultSet listar();
}
