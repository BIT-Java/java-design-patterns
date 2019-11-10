package pl.mzlnk.bitjava.designpatterns.structural.facade;

import java.sql.Connection;

public class MongoDBHelper {

    public static Connection getMongoDBConnection(){
        //get Mongo DB connection using connection parameters
        return null;
    }

    public void generateMongoPDFReport(String name, Connection con){
        //get data from db and generate pdf report
    }

    public void generateMongoHTMLReport(String name, Connection con){
        //get data from db and generate pdf report
    }

}
