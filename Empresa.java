
package DAO;

import Connection.Conexao;
import VO.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Empresa  {
   public ArrayList<Produto> buscar(){
      PreparedStatement ps;
      ResultSet rs;
      Connection con;
      try{
          con = new Conexao().conectar();
          if(con !=null){
              String sql = "select id, nome, valor from produtos";
              ps = con.prepareStatement(sql);
              rs = ps.executeQuery(sql);
              ArrayList<Produto> lista = new ArrayList<>();
              while (rs.next()){
                  Produto p = new Produto();
                   p.setId(rs.getInt("id"));
                  p.setNome(rs.getString("nome"));
                  p.setValor(rs.getDouble("valor"));
                  lista.add(p);
              }
              con.close();
              return lista;
          }else{
              return null;
          }
      }catch (SQLException erro){
          System.err.print("Excessão gerada ao tentar buscar os dados"+erro.getMessage());
          return null;
      }
      
   }
   
}

   

