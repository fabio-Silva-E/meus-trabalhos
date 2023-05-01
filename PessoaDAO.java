/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import VOs.Pessoa;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author fabio
 */
public class PessoaDAO {
 public boolean inserir(Pessoa p){
     Connection con = new Conexao().conectar();
      if (con != null) {
      try{
          PreparedStatement ps;
          String sql = "insert into formulario (nome,idade,escolaridade,atuacao) values (?,?,?,?)";
           ps = con.prepareStatement(sql);
                ps.setString(1, p.getNome());
                  ps.setInt (2,p.getIdade());
                  ps.setString(3, p.getEscolaridade());
                  ps.setString(4, p.getAtuacao());
                   if(ps.executeUpdate()!=0){
                    con.close();
                    return true;
                }else{
                    return false;
                }             
                   } catch (SQLException erro) {
                return false;}
            
        }else{
            return false;
        }
 
 }  
}
