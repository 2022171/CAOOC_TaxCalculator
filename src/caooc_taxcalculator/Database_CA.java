/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caooc_taxcalculator;

/**
 *
 * @author caroo
 */
public abstract class Database_CA {
    //to comunicate with database
    protected final static String DB_BASE_URL = "jdbc:mysql://localhost";
    protected final static String USER = "ooc2023";
    protected final static String PASSWORD = "ooc2023";
    protected final static String DB_NAME = "ca_taxcalculator";
    protected final static String TABLE_NAME = "usersData";
    protected final static String DB_URL = DB_BASE_URL + "/" + DB_NAME;
    
}
