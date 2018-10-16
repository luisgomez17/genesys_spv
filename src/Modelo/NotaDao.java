package Modelo;

import Vista.Texto;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NotaDao {
    Texto tex = new Texto();
public void InsertNota(NotaVo nota) {
        Conectarse conn = new Conectarse();

        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "INSERT INTO notas (id_cliente, id_venta, id_vendedor,saldo, tipo ) "
                    + "VALUES (?, ?, ?, ?, ?)");

            preparedStatement.setInt(1, nota.getId_cliente());
            preparedStatement.setInt(2, nota.getId_venta());
            preparedStatement.setInt(3, nota.getId_vendedor());
            preparedStatement.setDouble(4, nota.getSaldo());
            preparedStatement.setInt(5, nota.getTipo());
            
            String consulta = "INSERT INTO notas (id_cliente, id_venta, id_vendedor,saldo, tipo ) "
            + "VALUES ('"+nota.getId_cliente()+"', '"+nota.getId_venta()+"', '"+nota.getId_vendedor()+"', '"+nota.getSaldo()+"', '"+nota.getTipo()+"');";
            tex.escribir(consulta);
            preparedStatement.executeUpdate();

            //Cierra todo
            conn.getConn().close();
            //resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }    
}
