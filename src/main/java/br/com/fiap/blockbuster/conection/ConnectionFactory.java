package br.com.fiap.blockbuster.conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection()
            throws ClassNotFoundException,
            SQLException {    Class.forName("oracle.jdbc.driver.OracleDriver");// registra o driver
     Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
             "rm558092","191197");
     return conn;}
}
