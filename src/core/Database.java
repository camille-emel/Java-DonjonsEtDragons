package core;

import characters.Personnage;

import java.sql.*;

import java.util.ArrayList;

public class Database {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    public Database(){
        try {
            String url = "jdbc:mysql://localhost:3306/d&d";
            String username = "root";
            String password = "";
            //connect
            Connection connection = DriverManager.getConnection(url, username, password);



            try {
                //create statement

                // do SQL query

                //Process result
            }
            catch (Exception e) {

            }
            //close
            connection.close();
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    public Personnage getHeroes(){
        return
    }
    public Personnage createHeroes(Personnage personnage){

    }
    public Personnage editHero(Personnage personnage){

    }
    public int changeLifePoints(int changeLife){

    }

}

