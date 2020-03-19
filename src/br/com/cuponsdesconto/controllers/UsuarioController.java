/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cuponsdesconto.controllers;

import br.com.cuponsdesconto.dao.UsuarioDao;
import br.com.cuponsdesconto.entidades.Usuario;

/**
 *
 * @author Aluno
 */
public class UsuarioController {
    public boolean adcionarUsuario(Usuario usu){
        UsuarioDao usuDao = new UsuarioDao();
        return usuDao.adicionar(usu);
    }
}

