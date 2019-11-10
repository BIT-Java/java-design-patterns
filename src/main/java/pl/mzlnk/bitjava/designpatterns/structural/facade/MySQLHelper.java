package pl.mzlnk.bitjava.designpatterns.structural.facade;

import java.sql.Connection;

public class MySQLHelper {

    public static Connection getMySQLDBConnection(){
        //get MySQL DB connection using connection parameters
        return null;
    }

    public void generateMySQLPDFReport(String name, Connection con){
        //get data and generate PDF report
    }

    public void generateMySQLHTMLReport(String name, Connection con){
        //get data and generate HTML report
    }

}
