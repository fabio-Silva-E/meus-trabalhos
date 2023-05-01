package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao{
    private final String bd="formulario";
    private final String usuario = "root";
    private final String senha ="";
    public Connection conectar(){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           return DriverManager.getConnection("jdbc:mysql://localhost/"+bd,usuario,senha);
            
        }catch (ClassNotFoundException | SQLException erro){
         System.out.println(erro);
            return null;
        }
            
        
    }
}