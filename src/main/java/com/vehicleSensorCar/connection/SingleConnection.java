package com.vehicleSensorCar.connection;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.internal.connection.Connection;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@Configuration
public class SingleConnection extends AbstractMongoClientConfiguration {

    private static Connection connection = null;

    public static Connection getConnection() {
        return connection;
    }


    static { conectar(); }

    public SingleConnection(){
        conectar();
    }

    @Override
    protected String getDatabaseName() {
        return "vehicleSensorCar";
    }

    public static MongoClient conectar(){
        try{
            if(connection == null){
                ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017/vehicleSensorCar");
                System.out.println("Servidor conectado com sucesso!");
                MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                        .applyConnectionString(connectionString)
                        .build();

                return MongoClients.create(mongoClientSettings);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


}
