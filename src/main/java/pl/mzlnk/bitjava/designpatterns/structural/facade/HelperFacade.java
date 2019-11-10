package pl.mzlnk.bitjava.designpatterns.structural.facade;

import java.sql.Connection;

public class HelperFacade {

    public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
        Connection con;

        switch (dbType) {
            case MYSQL -> {
                con = MySQLHelper.getMySQLDBConnection();
                MySQLHelper mySqlHelper = new MySQLHelper();

                switch (reportType) {
                    case HTML -> mySqlHelper.generateMySQLHTMLReport(tableName, con);
                    case PDF -> mySqlHelper.generateMySQLPDFReport(tableName, con);
                }
            }
            case MONGO -> {
                con = MongoDBHelper.getMongoDBConnection();
                MongoDBHelper oracleHelper = new MongoDBHelper();

                switch (reportType) {
                    case HTML -> oracleHelper.generateMongoHTMLReport(tableName, con);
                    case PDF -> oracleHelper.generateMongoPDFReport(tableName, con);
                }
            }
        }
    }

    public enum DBTypes {
        MYSQL,
        MONGO;
    }

    public enum ReportTypes {
        HTML,
        PDF;
    }

}
