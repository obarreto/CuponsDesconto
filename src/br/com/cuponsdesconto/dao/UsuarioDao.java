package br.com.cuponsdesconto.dao;


import br.com.cuponsdesconto.entidades.Usuario;
import br.com.cuponsdesconto.entidades.Entidade;

import java.sql.SQLException;
import java.util.List;

public class UsuarioDao extends Dao implements FuncoesDao {

    @Override
    public boolean adicionar(Entidade entidade) {
        Usuario usu = (Usuario) entidade;
        String comando =  "INSERT INTO usuario (nome, cpf) VALUES (?,?)";
        try{
            this.conectar();
            this.stmt = this.conn.prepareStatement(comando);
            this.stmt.setString(1,usu.getNome());
            this.stmt.setString(2,usu.getCpf());
            this.stmt.execute();
        }catch(SQLException ex){
            System.out.println("Erro ao inserir Usuário"+ex.getMessage());
            return false;
        }
            return true;
    }

    @Override
    public boolean deletar(int id) {
        return false;
    }

    @Override
    public boolean atualizar(Entidade entidade) {
        return false;
    }

    @Override
    public Entidade buscar(int id) {
        return null;
    }

    @Override
    public List<Entidade> buscarTodos() {
        return null;
        
    }

}
