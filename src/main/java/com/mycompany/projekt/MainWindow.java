/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projekt;



import java.awt.Color;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author domin
 */
public class MainWindow extends javax.swing.JFrame {
   LogWindow.DB db;
   String userLogin;
   boolean isCheck = true;
   String queryString;
   int rodzajDostepu =5;
   boolean click =false;
   boolean click2 =false;
   boolean click3 =false;
   boolean click4 =false;
   String foo = "";
   Statement statement; 
   int columny=1;
   String adress;
   int loginIlosc=0;
   
   public  void refresh(){
        for(int i=0;i<50;i++){
              userTable.getModel().setValueAt(" ", i, 0);
              userTable.getModel().setValueAt(" ", i, 1);
              userTable.getModel().setValueAt(" ", i, 2);
              userTable.getModel().setValueAt(" ", i, 3);
              userTable.getModel().setValueAt(" ", i, 4);
              }
        try{
              
              queryString = "Select Login, Password, Private, Name, Lastname from Users;";
              ResultSet rs;
                rs = db.statement.executeQuery(queryString);
                for(int i=0;rs.next();i++){
              userTable.getModel().setValueAt(rs.getString("Login"), i, 0);
              userTable.getModel().setValueAt(rs.getString("Password"), i, 1);
              userTable.getModel().setValueAt(rs.getString("Private"), i, 2);
              userTable.getModel().setValueAt(rs.getString("Name"), i, 3);
              userTable.getModel().setValueAt(rs.getString("Lastname"), i, 4);
              }
       }
       catch(Exception e){
           e.printStackTrace();
              }
    }
    public  void refreshClients(){
        for(int i=0;i<50;i++){
              userTable1.getModel().setValueAt(" ", i, 0);
              userTable1.getModel().setValueAt(" ", i, 1);
              userTable1.getModel().setValueAt(" ", i, 2);
              userTable1.getModel().setValueAt(" ", i, 3);
              userTable1.getModel().setValueAt(" ", i, 4);
              }
        try{
              
              queryString = "Select Login, Name, Lastname, Email, Pesel from Clients;";
              ResultSet rs;
                rs = db.statement.executeQuery(queryString);
                for(int i=0;rs.next();i++){
              userTable1.getModel().setValueAt(rs.getString("Login"), i, 0);
              userTable1.getModel().setValueAt(rs.getString("Name"), i, 1);
              userTable1.getModel().setValueAt(rs.getString("Lastname"), i, 2);
              userTable1.getModel().setValueAt(rs.getString("Email"), i, 3);
              userTable1.getModel().setValueAt(rs.getString("Pesel"), i, 4);
              }
       }
       catch(Exception e){
           e.printStackTrace();
              }
    }
   public  void refreshProducts(){
        for(int i=0;i<50;i++){
              productsTable.getModel().setValueAt(" ", i, 0);
              productsTable.getModel().setValueAt(" ", i, 1);
              productsTable.getModel().setValueAt(" ", i, 2);
            
              }
        try{
              
              queryString = "Select Id_Product, Name, Price from Products;";
              ResultSet rs;
                rs = db.statement.executeQuery(queryString);
                for(int i=0;rs.next();i++){
              productsTable.getModel().setValueAt(rs.getString("Id_Product"), i, 0);
              productsTable.getModel().setValueAt(rs.getString("Name"), i, 1);
              productsTable.getModel().setValueAt(rs.getString("Price"), i, 2);
              
              }
       }
       catch(Exception e){
           e.printStackTrace();
              }
    }
   
   
   public  void refreshOrders(){
        for(int i=0;i<50;i++){
              userTable2.getModel().setValueAt(" ", i, 0);
              userTable2.getModel().setValueAt(" ", i, 1);
              userTable2.getModel().setValueAt(" ", i, 2);
              userTable2.getModel().setValueAt(" ", i, 3);
              userTable2.getModel().setValueAt(" ", i, 4);
              userTable2.getModel().setValueAt(" ", i, 5);
              userTable2.getModel().setValueAt(" ", i, 6);
              userTable2.getModel().setValueAt(" ", i, 7);
            
              }
        try{
              
              queryString = "select Orders.ID_Order, Users.Login, Clients.Name, Clients.Lastname, Orders.Adres, Orders.Date, Products.Name, Products.Price from Clients \n" +
"join Orders on Clients.Pesel = Orders.ID_Client\n" +
"join Products on Orders.ID_Product = Products.Id_Product\n" +
"join Users on Orders.id_user = Users.login;";
              ResultSet rs;
                rs = db.statement.executeQuery(queryString);
                for(int i=0;rs.next();i++){
              userTable2.getModel().setValueAt(rs.getString("Orders.ID_Order"), i, 0);
              userTable2.getModel().setValueAt(rs.getString("Users.Login"), i, 1);
              userTable2.getModel().setValueAt(rs.getString("Clients.Name"), i, 2);
              userTable2.getModel().setValueAt(rs.getString("Clients.Lastname"), i, 3);
              userTable2.getModel().setValueAt(rs.getString("Orders.Adres"), i, 4);
              userTable2.getModel().setValueAt(rs.getString("Orders.Date"), i, 5);
              userTable2.getModel().setValueAt(rs.getString("Products.Name"), i, 6);
              userTable2.getModel().setValueAt(rs.getString("Products.Price"), i, 7);
              }
       }
       catch(Exception e){
           e.printStackTrace();
              }
    }
    /** Creates new form DynRowAdd */
    
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usersWindow = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        dodajButton = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        usunButton = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        modyfikujButton = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        dodajWindow = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        loginText = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        hasloText = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        imieText = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        nazwText = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        bladText = new javax.swing.JLabel();
        blad2Text = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        usunWindow = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        usunLoginText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        wyborWindow = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        updateWindow = new javax.swing.JDialog();
        jPanel14 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        loginText1 = new javax.swing.JTextField();
        jSeparator25 = new javax.swing.JSeparator();
        hasloText1 = new javax.swing.JTextField();
        jSeparator26 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        imieText1 = new javax.swing.JTextField();
        jSeparator27 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        nazwText1 = new javax.swing.JTextField();
        jSeparator28 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jSeparator29 = new javax.swing.JSeparator();
        jSeparator30 = new javax.swing.JSeparator();
        jSeparator31 = new javax.swing.JSeparator();
        jSeparator32 = new javax.swing.JSeparator();
        jPanel19 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jSeparator33 = new javax.swing.JSeparator();
        blad3Text = new javax.swing.JLabel();
        updateUser = new javax.swing.JDialog();
        jPanel20 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jSeparator34 = new javax.swing.JSeparator();
        usunLoginText1 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jSeparator35 = new javax.swing.JSeparator();
        jPanel21 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jSeparator36 = new javax.swing.JSeparator();
        jLabel43 = new javax.swing.JLabel();
        clientWindow = new javax.swing.JDialog();
        jPanel23 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jSeparator37 = new javax.swing.JSeparator();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userTable1 = new javax.swing.JTable();
        dodajButton1 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        usunButton1 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        modyfikujButton1 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jSeparator38 = new javax.swing.JSeparator();
        clientWindowDodaj = new javax.swing.JDialog();
        jPanel24 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jSeparator39 = new javax.swing.JSeparator();
        jLabel50 = new javax.swing.JLabel();
        loginText2 = new javax.swing.JTextField();
        jSeparator40 = new javax.swing.JSeparator();
        hasloText2 = new javax.swing.JTextField();
        jSeparator41 = new javax.swing.JSeparator();
        jLabel51 = new javax.swing.JLabel();
        imieText2 = new javax.swing.JTextField();
        jSeparator42 = new javax.swing.JSeparator();
        jLabel52 = new javax.swing.JLabel();
        nazwText2 = new javax.swing.JTextField();
        jSeparator43 = new javax.swing.JSeparator();
        jLabel53 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jSeparator48 = new javax.swing.JSeparator();
        bladText1 = new javax.swing.JLabel();
        blad2Text1 = new javax.swing.JLabel();
        clientWindowUsun = new javax.swing.JDialog();
        jPanel22 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jSeparator44 = new javax.swing.JSeparator();
        usunLoginText2 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jSeparator45 = new javax.swing.JSeparator();
        jPanel25 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jSeparator46 = new javax.swing.JSeparator();
        wyborWindowClient = new javax.swing.JDialog();
        jPanel26 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        updateWindowClient = new javax.swing.JDialog();
        updateWindowsClient = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jSeparator47 = new javax.swing.JSeparator();
        jLabel63 = new javax.swing.JLabel();
        loginText3 = new javax.swing.JTextField();
        jSeparator49 = new javax.swing.JSeparator();
        hasloText3 = new javax.swing.JTextField();
        jSeparator50 = new javax.swing.JSeparator();
        jLabel64 = new javax.swing.JLabel();
        imieText3 = new javax.swing.JTextField();
        jSeparator51 = new javax.swing.JSeparator();
        jLabel65 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jSeparator57 = new javax.swing.JSeparator();
        blad3Text1 = new javax.swing.JLabel();
        updateClient = new javax.swing.JDialog();
        jPanel30 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jSeparator52 = new javax.swing.JSeparator();
        usunLoginText3 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jSeparator53 = new javax.swing.JSeparator();
        jPanel31 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jSeparator54 = new javax.swing.JSeparator();
        jLabel69 = new javax.swing.JLabel();
        productsWindow = new javax.swing.JDialog();
        jPanel32 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jSeparator55 = new javax.swing.JSeparator();
        jLabel72 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();
        dodajButton2 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        usunButton2 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        modyfikujButton2 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jSeparator56 = new javax.swing.JSeparator();
        dodajProductWindow = new javax.swing.JDialog();
        jPanel33 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jSeparator58 = new javax.swing.JSeparator();
        jLabel77 = new javax.swing.JLabel();
        loginText4 = new javax.swing.JTextField();
        jSeparator59 = new javax.swing.JSeparator();
        hasloText4 = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jSeparator61 = new javax.swing.JSeparator();
        jPanel34 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jSeparator63 = new javax.swing.JSeparator();
        bladText2 = new javax.swing.JLabel();
        usunProductWindow = new javax.swing.JDialog();
        jPanel36 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jSeparator60 = new javax.swing.JSeparator();
        usunLoginText4 = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        jSeparator62 = new javax.swing.JSeparator();
        jPanel37 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jSeparator64 = new javax.swing.JSeparator();
        wyborProductWindow = new javax.swing.JDialog();
        jPanel38 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        updateProductWindow = new javax.swing.JDialog();
        jPanel41 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jSeparator65 = new javax.swing.JSeparator();
        usunLoginText5 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jSeparator66 = new javax.swing.JSeparator();
        jPanel42 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jSeparator67 = new javax.swing.JSeparator();
        jLabel90 = new javax.swing.JLabel();
        updateProduct = new javax.swing.JDialog();
        updateWindowsClient1 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jSeparator68 = new javax.swing.JSeparator();
        jLabel92 = new javax.swing.JLabel();
        loginText5 = new javax.swing.JTextField();
        jSeparator69 = new javax.swing.JSeparator();
        jSeparator70 = new javax.swing.JSeparator();
        jLabel93 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jSeparator72 = new javax.swing.JSeparator();
        blad3Text2 = new javax.swing.JLabel();
        cenaSpinner = new javax.swing.JSpinner();
        orderWindow = new javax.swing.JDialog();
        jPanel44 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jSeparator71 = new javax.swing.JSeparator();
        jLabel96 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        userTable2 = new javax.swing.JTable();
        dodajButton3 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        usunButton3 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        modyfikujButton3 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jSeparator73 = new javax.swing.JSeparator();
        dodajOrderWindow = new javax.swing.JDialog();
        jPanel45 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jSeparator74 = new javax.swing.JSeparator();
        jLabel101 = new javax.swing.JLabel();
        loginText6 = new javax.swing.JTextField();
        jSeparator75 = new javax.swing.JSeparator();
        hasloText5 = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        jSeparator76 = new javax.swing.JSeparator();
        jPanel46 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jSeparator77 = new javax.swing.JSeparator();
        dataOrder = new javax.swing.JSpinner();
        jLabel104 = new javax.swing.JLabel();
        ulicaText = new javax.swing.JTextField();
        jSeparator78 = new javax.swing.JSeparator();
        jLabel105 = new javax.swing.JLabel();
        jSeparator79 = new javax.swing.JSeparator();
        domText = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jSeparator80 = new javax.swing.JSeparator();
        kodText = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        miejscowoscText = new javax.swing.JTextField();
        jSeparator81 = new javax.swing.JSeparator();
        jLabel108 = new javax.swing.JLabel();
        bladText3 = new javax.swing.JLabel();
        czyNowyWindow = new javax.swing.JDialog();
        jPanel47 = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        usunOrder = new javax.swing.JDialog();
        jPanel50 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        jSeparator82 = new javax.swing.JSeparator();
        usunLoginText6 = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        jSeparator83 = new javax.swing.JSeparator();
        jPanel51 = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        jSeparator84 = new javax.swing.JSeparator();
        bladText4 = new javax.swing.JLabel();
        wyborUsunOrder = new javax.swing.JDialog();
        jPanel52 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jLabel119 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        updateOrder = new javax.swing.JDialog();
        jPanel55 = new javax.swing.JPanel();
        jLabel121 = new javax.swing.JLabel();
        jSeparator85 = new javax.swing.JSeparator();
        jLabel122 = new javax.swing.JLabel();
        loginText7 = new javax.swing.JTextField();
        jSeparator86 = new javax.swing.JSeparator();
        hasloText6 = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        jSeparator87 = new javax.swing.JSeparator();
        jPanel56 = new javax.swing.JPanel();
        jLabel124 = new javax.swing.JLabel();
        jSeparator88 = new javax.swing.JSeparator();
        ulicaText1 = new javax.swing.JTextField();
        jSeparator89 = new javax.swing.JSeparator();
        jLabel126 = new javax.swing.JLabel();
        jSeparator90 = new javax.swing.JSeparator();
        domText1 = new javax.swing.JTextField();
        jLabel127 = new javax.swing.JLabel();
        jSeparator91 = new javax.swing.JSeparator();
        kodText1 = new javax.swing.JTextField();
        jLabel128 = new javax.swing.JLabel();
        miejscowoscText1 = new javax.swing.JTextField();
        jSeparator92 = new javax.swing.JSeparator();
        jLabel129 = new javax.swing.JLabel();
        bladText5 = new javax.swing.JLabel();
        IdUpdateOrder = new javax.swing.JDialog();
        jPanel57 = new javax.swing.JPanel();
        jLabel125 = new javax.swing.JLabel();
        jSeparator93 = new javax.swing.JSeparator();
        usunLoginText7 = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        jSeparator94 = new javax.swing.JSeparator();
        jPanel58 = new javax.swing.JPanel();
        jLabel131 = new javax.swing.JLabel();
        jSeparator95 = new javax.swing.JSeparator();
        jLabel132 = new javax.swing.JLabel();
        welcomeWindow = new javax.swing.JDialog();
        jPanel59 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        jPanel60 = new javax.swing.JPanel();
        blad3Text3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        usersButton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        klienciButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        produktyButton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        zamowieniaButton = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        rozliczeniaButton = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();

        usersWindow.setBackground(new java.awt.Color(255, 255, 255));
        usersWindow.setLocationByPlatform(true);
        usersWindow.setMinimumSize(new java.awt.Dimension(600, 630));
        usersWindow.setResizable(false);
        usersWindow.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                usersWindowWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(207, 6, 46));
        jLabel3.setText("NetBest");

        jLabel8.setForeground(new java.awt.Color(207, 6, 46));
        jLabel8.setText("Panel użytkowników");

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Login", "Hasło", "Private", "Imię", "Nazwisko"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userTable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(userTable);

        dodajButton.setBackground(new java.awt.Color(255, 255, 255));
        dodajButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dodajButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dodajButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dodajButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dodajButtonMouseExited(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(207, 6, 46));
        jLabel10.setText("Dodaj");

        javax.swing.GroupLayout dodajButtonLayout = new javax.swing.GroupLayout(dodajButton);
        dodajButton.setLayout(dodajButtonLayout);
        dodajButtonLayout.setHorizontalGroup(
            dodajButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dodajButtonLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(59, 59, 59))
        );
        dodajButtonLayout.setVerticalGroup(
            dodajButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dodajButtonLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel10)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        usunButton.setBackground(new java.awt.Color(255, 255, 255));
        usunButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usunButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usunButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usunButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usunButtonMouseExited(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(207, 6, 46));
        jLabel11.setText("Usuń");

        javax.swing.GroupLayout usunButtonLayout = new javax.swing.GroupLayout(usunButton);
        usunButton.setLayout(usunButtonLayout);
        usunButtonLayout.setHorizontalGroup(
            usunButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usunButtonLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel11)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        usunButtonLayout.setVerticalGroup(
            usunButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usunButtonLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel11)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        modyfikujButton.setBackground(new java.awt.Color(255, 255, 255));
        modyfikujButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modyfikujButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modyfikujButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modyfikujButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modyfikujButtonMouseExited(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(207, 6, 46));
        jLabel12.setText("Modyfikuj");

        javax.swing.GroupLayout modyfikujButtonLayout = new javax.swing.GroupLayout(modyfikujButton);
        modyfikujButton.setLayout(modyfikujButtonLayout);
        modyfikujButtonLayout.setHorizontalGroup(
            modyfikujButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modyfikujButtonLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel12)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        modyfikujButtonLayout.setVerticalGroup(
            modyfikujButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modyfikujButtonLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel12)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator7)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel8)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(dodajButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usunButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modyfikujButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addComponent(jSeparator8)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dodajButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usunButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modyfikujButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout usersWindowLayout = new javax.swing.GroupLayout(usersWindow.getContentPane());
        usersWindow.getContentPane().setLayout(usersWindowLayout);
        usersWindowLayout.setHorizontalGroup(
            usersWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usersWindowLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        usersWindowLayout.setVerticalGroup(
            usersWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        dodajWindow.setBackground(new java.awt.Color(255, 255, 255));
        dodajWindow.setFocusTraversalPolicyProvider(true);
        dodajWindow.setMinimumSize(new java.awt.Dimension(390, 550));
        dodajWindow.setModal(true);
        dodajWindow.setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(390, 550));
        jPanel2.setPreferredSize(new java.awt.Dimension(390, 550));
        jPanel2.setRequestFocusEnabled(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(207, 6, 46));
        jLabel13.setText("NetBest");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(207, 6, 46));
        jLabel14.setText("Login:");

        loginText.setBorder(null);
        loginText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextActionPerformed(evt);
            }
        });

        hasloText.setBorder(null);
        hasloText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasloTextActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(207, 6, 46));
        jLabel15.setText("Hasło:");

        imieText.setBorder(null);
        imieText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imieTextActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(207, 6, 46));
        jLabel16.setText("Imię:");

        nazwText.setBorder(null);
        nazwText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nazwTextActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(207, 6, 46));
        jLabel17.setText("Nazwisko:");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(207, 6, 46));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Administrator");
        jLabel18.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(20, 20, 20))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(207, 6, 46));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Sprzedawca");
        jLabel19.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(39, 39, 39))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(20, 20, 20))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(207, 6, 46));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Księgowość");
        jLabel22.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(47, 47, 47))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(20, 20, 20))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(207, 6, 46));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Zarząd");
        jLabel21.setToolTipText("");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel21)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(20, 20, 20))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(207, 6, 46));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Dodaj użytkownika");
        jLabel24.setToolTipText("");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel24)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        bladText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bladText.setForeground(new java.awt.Color(207, 6, 46));
        bladText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bladText.setText("Nie uzupełniono wszystkich pól!");
        bladText.setToolTipText("");

        blad2Text.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        blad2Text.setForeground(new java.awt.Color(207, 6, 46));
        blad2Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blad2Text.setText("Użytkownik o podanym loginie już istnieje!");
        blad2Text.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(121, 121, 121))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(loginText, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(imieText, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jSeparator11)
                                                .addComponent(hasloText, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jSeparator14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jSeparator20))
                                            .addGap(8, 8, 8))))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel14))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nazwText, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bladText, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(blad2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator10, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(0, 0, 0)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(hasloText, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(imieText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nazwText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator17, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                    .addComponent(jSeparator16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bladText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blad2Text)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(456, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout dodajWindowLayout = new javax.swing.GroupLayout(dodajWindow.getContentPane());
        dodajWindow.getContentPane().setLayout(dodajWindowLayout);
        dodajWindowLayout.setHorizontalGroup(
            dodajWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dodajWindowLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dodajWindowLayout.setVerticalGroup(
            dodajWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(207, 6, 46));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Administrator");
        jLabel20.setToolTipText("");

        usunWindow.setMinimumSize(new java.awt.Dimension(400, 300));
        usunWindow.setResizable(false);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel9.setName(""); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(207, 6, 46));
        jLabel23.setText("NetBest");

        usunLoginText.setBorder(null);
        usunLoginText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usunLoginTextActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(207, 6, 46));
        jLabel9.setText("Podaj login osoby którą chcesz usunąć z listy użytkowników");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel10MouseExited(evt);
            }
        });

        jLabel25.setForeground(new java.awt.Color(207, 6, 46));
        jLabel25.setText("Usuń użytkownika!");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel25)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel25)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator21)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usunLoginText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator22)
                            .addComponent(jSeparator23))
                        .addGap(102, 102, 102))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usunLoginText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout usunWindowLayout = new javax.swing.GroupLayout(usunWindow.getContentPane());
        usunWindow.getContentPane().setLayout(usunWindowLayout);
        usunWindowLayout.setHorizontalGroup(
            usunWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        usunWindowLayout.setVerticalGroup(
            usunWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        wyborWindow.setMinimumSize(new java.awt.Dimension(400, 150));
        wyborWindow.setModal(true);
        wyborWindow.setResizable(false);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setMinimumSize(new java.awt.Dimension(400, 150));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(207, 6, 46));
        jLabel26.setText("UWAGA!");

        jLabel27.setForeground(new java.awt.Color(207, 6, 46));
        jLabel27.setText("Czy na pewno chcesz usunąć użytkownika?");

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(200, 75));
        jPanel12.setRequestFocusEnabled(false);
        jPanel12.setVerifyInputWhenFocusTarget(false);
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel12MouseExited(evt);
            }
        });

        jLabel28.setText("TAK!");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel28)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel28)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setMinimumSize(new java.awt.Dimension(200, 75));
        jPanel13.setPreferredSize(new java.awt.Dimension(200, 75));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel13MouseExited(evt);
            }
        });

        jLabel29.setText("NIE!");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel29)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel29)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(95, 95, 95))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout wyborWindowLayout = new javax.swing.GroupLayout(wyborWindow.getContentPane());
        wyborWindow.getContentPane().setLayout(wyborWindowLayout);
        wyborWindowLayout.setHorizontalGroup(
            wyborWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        wyborWindowLayout.setVerticalGroup(
            wyborWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        updateWindow.setMinimumSize(new java.awt.Dimension(390, 550));
        updateWindow.setResizable(false);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setMinimumSize(new java.awt.Dimension(390, 550));
        jPanel14.setRequestFocusEnabled(false);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(207, 6, 46));
        jLabel30.setText("NetBest");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(207, 6, 46));
        jLabel31.setText("Login:");

        loginText1.setBorder(null);
        loginText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginText1ActionPerformed(evt);
            }
        });

        hasloText1.setBorder(null);
        hasloText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasloText1ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(207, 6, 46));
        jLabel32.setText("Hasło:");

        imieText1.setBorder(null);
        imieText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imieText1ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(207, 6, 46));
        jLabel33.setText("Imię:");

        nazwText1.setBorder(null);
        nazwText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nazwText1ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(207, 6, 46));
        jLabel34.setText("Nazwisko:");

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel15MouseExited(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(207, 6, 46));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Administrator");
        jLabel35.setToolTipText("");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(36, 36, 36))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(20, 20, 20))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel16MouseExited(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(207, 6, 46));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Sprzedawca");
        jLabel36.setToolTipText("");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addGap(39, 39, 39))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addGap(20, 20, 20))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel17MouseExited(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(207, 6, 46));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Księgowość");
        jLabel37.setToolTipText("");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addGap(47, 47, 47))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addGap(20, 20, 20))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel18MouseExited(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(207, 6, 46));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Zarząd");
        jLabel38.setToolTipText("");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel38)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(20, 20, 20))
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel19MouseExited(evt);
            }
        });

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(207, 6, 46));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Edytuj użytkownika");
        jLabel39.setToolTipText("");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel39)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel39)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        blad3Text.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        blad3Text.setForeground(new java.awt.Color(207, 6, 46));
        blad3Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blad3Text.setText("Nie uzupełniono wszystkich pól!");
        blad3Text.setToolTipText("");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addGap(121, 121, 121))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(loginText1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(imieText1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator26)
                                            .addComponent(hasloText1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jSeparator27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel14Layout.createSequentialGroup()
                                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jSeparator32, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jSeparator31, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel14Layout.createSequentialGroup()
                                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jSeparator29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jSeparator30, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jSeparator33))
                                        .addGap(8, 8, 8))))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel31))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nazwText1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blad3Text, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator25, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addGap(28, 28, 28)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginText1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(0, 0, 0)
                .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(hasloText1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(imieText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nazwText1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator31, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                    .addComponent(jSeparator32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator30, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator29, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator33, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(blad3Text)
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(456, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout updateWindowLayout = new javax.swing.GroupLayout(updateWindow.getContentPane());
        updateWindow.getContentPane().setLayout(updateWindowLayout);
        updateWindowLayout.setHorizontalGroup(
            updateWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateWindowLayout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        updateWindowLayout.setVerticalGroup(
            updateWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        updateUser.setMinimumSize(new java.awt.Dimension(400, 400));
        updateUser.setModal(true);
        updateUser.setResizable(false);
        updateUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateUserMouseExited(evt);
            }
        });

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel20.setName(""); // NOI18N

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(207, 6, 46));
        jLabel40.setText("NetBest");

        usunLoginText1.setBorder(null);
        usunLoginText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usunLoginText1ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(207, 6, 46));
        jLabel41.setText("Podaj login osoby którą chcesz edytować z listy użytkowników");

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel21MouseExited(evt);
            }
        });

        jLabel42.setForeground(new java.awt.Color(207, 6, 46));
        jLabel42.setText("Edytuj użytkownika!");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel42)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel42)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(207, 6, 46));
        jLabel43.setText("Nie wpisano loginu użytkownika!");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator34)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel40)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usunLoginText1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator35)
                            .addComponent(jSeparator36, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator34, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usunLoginText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator35, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator36, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel43)
                .addContainerGap())
        );

        javax.swing.GroupLayout updateUserLayout = new javax.swing.GroupLayout(updateUser.getContentPane());
        updateUser.getContentPane().setLayout(updateUserLayout);
        updateUserLayout.setHorizontalGroup(
            updateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        updateUserLayout.setVerticalGroup(
            updateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        clientWindow.setAutoRequestFocus(false);
        clientWindow.setLocationByPlatform(true);
        clientWindow.setMinimumSize(new java.awt.Dimension(600, 630));
        clientWindow.setResizable(false);
        clientWindow.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                clientWindowWindowOpened(evt);
            }
        });

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(207, 6, 46));
        jLabel44.setText("NetBest");

        jLabel45.setForeground(new java.awt.Color(207, 6, 46));
        jLabel45.setText("Panel Klientow");

        userTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sprzedawca", "Imie", "Nazwisko", "Email", "Pesel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(userTable1);

        dodajButton1.setBackground(new java.awt.Color(255, 255, 255));
        dodajButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dodajButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dodajButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dodajButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dodajButton1MouseExited(evt);
            }
        });

        jLabel46.setForeground(new java.awt.Color(207, 6, 46));
        jLabel46.setText("Dodaj");

        javax.swing.GroupLayout dodajButton1Layout = new javax.swing.GroupLayout(dodajButton1);
        dodajButton1.setLayout(dodajButton1Layout);
        dodajButton1Layout.setHorizontalGroup(
            dodajButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dodajButton1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addGap(59, 59, 59))
        );
        dodajButton1Layout.setVerticalGroup(
            dodajButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dodajButton1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel46)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        usunButton1.setBackground(new java.awt.Color(255, 255, 255));
        usunButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usunButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usunButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usunButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usunButton1MouseExited(evt);
            }
        });

        jLabel47.setForeground(new java.awt.Color(207, 6, 46));
        jLabel47.setText("Usuń");

        javax.swing.GroupLayout usunButton1Layout = new javax.swing.GroupLayout(usunButton1);
        usunButton1.setLayout(usunButton1Layout);
        usunButton1Layout.setHorizontalGroup(
            usunButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usunButton1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel47)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        usunButton1Layout.setVerticalGroup(
            usunButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usunButton1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel47)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        modyfikujButton1.setBackground(new java.awt.Color(255, 255, 255));
        modyfikujButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modyfikujButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modyfikujButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modyfikujButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modyfikujButton1MouseExited(evt);
            }
        });

        jLabel48.setForeground(new java.awt.Color(207, 6, 46));
        jLabel48.setText("Modyfikuj");

        javax.swing.GroupLayout modyfikujButton1Layout = new javax.swing.GroupLayout(modyfikujButton1);
        modyfikujButton1.setLayout(modyfikujButton1Layout);
        modyfikujButton1Layout.setHorizontalGroup(
            modyfikujButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modyfikujButton1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel48)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        modyfikujButton1Layout.setVerticalGroup(
            modyfikujButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modyfikujButton1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel48)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator37)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel44))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel45)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(dodajButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usunButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modyfikujButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addComponent(jSeparator38)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator37, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator38, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dodajButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usunButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modyfikujButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout clientWindowLayout = new javax.swing.GroupLayout(clientWindow.getContentPane());
        clientWindow.getContentPane().setLayout(clientWindowLayout);
        clientWindowLayout.setHorizontalGroup(
            clientWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientWindowLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        clientWindowLayout.setVerticalGroup(
            clientWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        clientWindowDodaj.setAlwaysOnTop(true);
        clientWindowDodaj.setMinimumSize(new java.awt.Dimension(390, 550));
        clientWindowDodaj.setResizable(false);
        clientWindowDodaj.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                clientWindowDodajWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                clientWindowDodajWindowClosing(evt);
            }
        });

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setMinimumSize(new java.awt.Dimension(390, 550));
        jPanel24.setRequestFocusEnabled(false);

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(207, 6, 46));
        jLabel49.setText("NetBest");

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(207, 6, 46));
        jLabel50.setText("Imię:");

        loginText2.setBorder(null);
        loginText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginText2ActionPerformed(evt);
            }
        });

        hasloText2.setBorder(null);
        hasloText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasloText2ActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(207, 6, 46));
        jLabel51.setText("Nazwisko:");

        imieText2.setBorder(null);
        imieText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imieText2ActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(207, 6, 46));
        jLabel52.setText("Email:");

        nazwText2.setBorder(null);
        nazwText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nazwText2ActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(207, 6, 46));
        jLabel53.setText("Pesel:");

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel29MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel29MouseExited(evt);
            }
        });

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(207, 6, 46));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Dodaj klienta");
        jLabel58.setToolTipText("");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel58)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel58)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        bladText1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bladText1.setForeground(new java.awt.Color(207, 6, 46));
        bladText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bladText1.setText("Niepoprawnie uzupełnione pola formularza!");
        bladText1.setToolTipText("");

        blad2Text1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        blad2Text1.setForeground(new java.awt.Color(207, 6, 46));
        blad2Text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blad2Text1.setText("Użytkownik o podanym peselu już istnieje!");
        blad2Text1.setToolTipText("");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel50)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel51)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator42, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imieText2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator43, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginText2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator39, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hasloText2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator41, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nazwText2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel49))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator48)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(bladText1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(blad2Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator40, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addGap(30, 30, 30)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginText2))
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(hasloText2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addComponent(jSeparator42, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(imieText2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(nazwText2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jSeparator41, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator48, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bladText1)
                .addGap(18, 18, 18)
                .addComponent(blad2Text1)
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel24Layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jSeparator40, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(456, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout clientWindowDodajLayout = new javax.swing.GroupLayout(clientWindowDodaj.getContentPane());
        clientWindowDodaj.getContentPane().setLayout(clientWindowDodajLayout);
        clientWindowDodajLayout.setHorizontalGroup(
            clientWindowDodajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientWindowDodajLayout.createSequentialGroup()
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        clientWindowDodajLayout.setVerticalGroup(
            clientWindowDodajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        clientWindowUsun.setLocationByPlatform(true);
        clientWindowUsun.setMinimumSize(new java.awt.Dimension(400, 300));
        clientWindowUsun.setResizable(false);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel22.setName(""); // NOI18N

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(207, 6, 46));
        jLabel54.setText("NetBest");

        usunLoginText2.setBorder(null);
        usunLoginText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usunLoginText2ActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(207, 6, 46));
        jLabel55.setText("Podaj pesel osoby którą chcesz usunąć z listy klientów");

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel25MouseExited(evt);
            }
        });

        jLabel56.setForeground(new java.awt.Color(207, 6, 46));
        jLabel56.setText("Usuń klienta!");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel56)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel56)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator44)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel54)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usunLoginText2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator45)
                            .addComponent(jSeparator46))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator44, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usunLoginText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator45, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator46, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout clientWindowUsunLayout = new javax.swing.GroupLayout(clientWindowUsun.getContentPane());
        clientWindowUsun.getContentPane().setLayout(clientWindowUsunLayout);
        clientWindowUsunLayout.setHorizontalGroup(
            clientWindowUsunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        clientWindowUsunLayout.setVerticalGroup(
            clientWindowUsunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        wyborWindowClient.setMinimumSize(new java.awt.Dimension(400, 150));
        wyborWindowClient.setResizable(false);
        wyborWindowClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                wyborWindowClientMouseEntered(evt);
            }
        });

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setMinimumSize(new java.awt.Dimension(400, 150));

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(207, 6, 46));
        jLabel57.setText("UWAGA!");

        jLabel59.setForeground(new java.awt.Color(207, 6, 46));
        jLabel59.setText("Czy na pewno chcesz usunąć użytkownika?");

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setPreferredSize(new java.awt.Dimension(200, 75));
        jPanel27.setRequestFocusEnabled(false);
        jPanel27.setVerifyInputWhenFocusTarget(false);
        jPanel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel27MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel27MouseExited(evt);
            }
        });

        jLabel60.setText("TAK!");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel60)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel60)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setMinimumSize(new java.awt.Dimension(200, 75));
        jPanel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel28MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel28MouseExited(evt);
            }
        });

        jLabel61.setText("NIE!");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel61)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel61)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel59)
                .addGap(95, 95, 95))
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel57)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57)
                .addGap(18, 18, 18)
                .addComponent(jLabel59)
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout wyborWindowClientLayout = new javax.swing.GroupLayout(wyborWindowClient.getContentPane());
        wyborWindowClient.getContentPane().setLayout(wyborWindowClientLayout);
        wyborWindowClientLayout.setHorizontalGroup(
            wyborWindowClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        wyborWindowClientLayout.setVerticalGroup(
            wyborWindowClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        updateWindowClient.setMinimumSize(new java.awt.Dimension(390, 550));
        updateWindowClient.setResizable(false);

        updateWindowsClient.setBackground(new java.awt.Color(255, 255, 255));
        updateWindowsClient.setMinimumSize(new java.awt.Dimension(390, 550));
        updateWindowsClient.setRequestFocusEnabled(false);

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(207, 6, 46));
        jLabel62.setText("NetBest");

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(207, 6, 46));
        jLabel63.setText("Imię:");

        loginText3.setBorder(null);
        loginText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginText3ActionPerformed(evt);
            }
        });

        hasloText3.setBorder(null);
        hasloText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasloText3ActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(207, 6, 46));
        jLabel64.setText("Nazwisko:");

        imieText3.setBorder(null);
        imieText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imieText3ActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(207, 6, 46));
        jLabel65.setText("Email:");

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel35MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel35MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel35MouseExited(evt);
            }
        });

        jLabel71.setBackground(new java.awt.Color(255, 255, 255));
        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(207, 6, 46));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("Edytuj użytkownika");
        jLabel71.setToolTipText("");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel71)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel71)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        blad3Text1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        blad3Text1.setForeground(new java.awt.Color(207, 6, 46));
        blad3Text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blad3Text1.setText("Nie uzupełniono wszystkich pól!");
        blad3Text1.setToolTipText("");

        javax.swing.GroupLayout updateWindowsClientLayout = new javax.swing.GroupLayout(updateWindowsClient);
        updateWindowsClient.setLayout(updateWindowsClientLayout);
        updateWindowsClientLayout.setHorizontalGroup(
            updateWindowsClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateWindowsClientLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel62)
                .addGap(121, 121, 121))
            .addGroup(updateWindowsClientLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(updateWindowsClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blad3Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(updateWindowsClientLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(updateWindowsClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator57, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(updateWindowsClientLayout.createSequentialGroup()
                        .addGroup(updateWindowsClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel65)
                            .addComponent(jLabel64)
                            .addComponent(jLabel63))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updateWindowsClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, updateWindowsClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(imieText3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, updateWindowsClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator50)
                                .addComponent(hasloText3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(loginText3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator47, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(updateWindowsClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator49, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
        );
        updateWindowsClientLayout.setVerticalGroup(
            updateWindowsClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateWindowsClientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62)
                .addGap(28, 28, 28)
                .addGroup(updateWindowsClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63)
                    .addGroup(updateWindowsClientLayout.createSequentialGroup()
                        .addComponent(loginText3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator47, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateWindowsClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64)
                    .addGroup(updateWindowsClientLayout.createSequentialGroup()
                        .addComponent(hasloText3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator50, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateWindowsClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65)
                    .addComponent(imieText3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator51, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator57, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(blad3Text1)
                .addContainerGap(217, Short.MAX_VALUE))
            .addGroup(updateWindowsClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updateWindowsClientLayout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jSeparator49, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(456, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout updateWindowClientLayout = new javax.swing.GroupLayout(updateWindowClient.getContentPane());
        updateWindowClient.getContentPane().setLayout(updateWindowClientLayout);
        updateWindowClientLayout.setHorizontalGroup(
            updateWindowClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateWindowsClient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        updateWindowClientLayout.setVerticalGroup(
            updateWindowClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateWindowsClient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        updateClient.setMinimumSize(new java.awt.Dimension(400, 400));
        updateClient.setResizable(false);

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel30.setName(""); // NOI18N

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(207, 6, 46));
        jLabel66.setText("NetBest");

        usunLoginText3.setBorder(null);
        usunLoginText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usunLoginText3ActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(207, 6, 46));
        jLabel67.setText("Podaj pesel osoby którą chcesz edytować z listy klientów");

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel31MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel31MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel31MouseExited(evt);
            }
        });

        jLabel68.setForeground(new java.awt.Color(207, 6, 46));
        jLabel68.setText("Edytuj klienta!");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel68)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel68)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(207, 6, 46));
        jLabel69.setText("Nie wpisano peselu klienta!");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator52)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel66)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usunLoginText3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator53)
                            .addComponent(jSeparator54, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator52, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usunLoginText3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator53, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator54, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69)
                .addContainerGap())
        );

        javax.swing.GroupLayout updateClientLayout = new javax.swing.GroupLayout(updateClient.getContentPane());
        updateClient.getContentPane().setLayout(updateClientLayout);
        updateClientLayout.setHorizontalGroup(
            updateClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        updateClientLayout.setVerticalGroup(
            updateClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        productsWindow.setMinimumSize(new java.awt.Dimension(600, 630));
        productsWindow.setResizable(false);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(207, 6, 46));
        jLabel70.setText("NetBest");

        jLabel72.setForeground(new java.awt.Color(207, 6, 46));
        jLabel72.setText("Panel produktów");

        productsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID produktu", "Nazwa produktu", "Cena "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productsTable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(productsTable);

        dodajButton2.setBackground(new java.awt.Color(255, 255, 255));
        dodajButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dodajButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dodajButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dodajButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dodajButton2MouseExited(evt);
            }
        });

        jLabel73.setForeground(new java.awt.Color(207, 6, 46));
        jLabel73.setText("Dodaj");

        javax.swing.GroupLayout dodajButton2Layout = new javax.swing.GroupLayout(dodajButton2);
        dodajButton2.setLayout(dodajButton2Layout);
        dodajButton2Layout.setHorizontalGroup(
            dodajButton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dodajButton2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel73)
                .addGap(59, 59, 59))
        );
        dodajButton2Layout.setVerticalGroup(
            dodajButton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dodajButton2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel73)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        usunButton2.setBackground(new java.awt.Color(255, 255, 255));
        usunButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usunButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usunButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usunButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usunButton2MouseExited(evt);
            }
        });

        jLabel74.setForeground(new java.awt.Color(207, 6, 46));
        jLabel74.setText("Usuń");

        javax.swing.GroupLayout usunButton2Layout = new javax.swing.GroupLayout(usunButton2);
        usunButton2.setLayout(usunButton2Layout);
        usunButton2Layout.setHorizontalGroup(
            usunButton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usunButton2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel74)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        usunButton2Layout.setVerticalGroup(
            usunButton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usunButton2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel74)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        modyfikujButton2.setBackground(new java.awt.Color(255, 255, 255));
        modyfikujButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modyfikujButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modyfikujButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modyfikujButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modyfikujButton2MouseExited(evt);
            }
        });

        jLabel75.setForeground(new java.awt.Color(207, 6, 46));
        jLabel75.setText("Modyfikuj");

        javax.swing.GroupLayout modyfikujButton2Layout = new javax.swing.GroupLayout(modyfikujButton2);
        modyfikujButton2.setLayout(modyfikujButton2Layout);
        modyfikujButton2Layout.setHorizontalGroup(
            modyfikujButton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modyfikujButton2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel75)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        modyfikujButton2Layout.setVerticalGroup(
            modyfikujButton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modyfikujButton2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel75)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator55)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel70))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel72)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(dodajButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usunButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modyfikujButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addComponent(jSeparator56)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator55, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel72)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator56, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dodajButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usunButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modyfikujButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout productsWindowLayout = new javax.swing.GroupLayout(productsWindow.getContentPane());
        productsWindow.getContentPane().setLayout(productsWindowLayout);
        productsWindowLayout.setHorizontalGroup(
            productsWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productsWindowLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        productsWindowLayout.setVerticalGroup(
            productsWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        dodajProductWindow.setMinimumSize(new java.awt.Dimension(390, 550));
        dodajProductWindow.setResizable(false);

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setMinimumSize(new java.awt.Dimension(390, 550));
        jPanel33.setRequestFocusEnabled(false);

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(207, 6, 46));
        jLabel76.setText("NetBest");

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(207, 6, 46));
        jLabel77.setText("Nazwa:");

        loginText4.setBorder(null);
        loginText4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginText4ActionPerformed(evt);
            }
        });

        hasloText4.setBorder(null);
        hasloText4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasloText4ActionPerformed(evt);
            }
        });

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(207, 6, 46));
        jLabel78.setText("Cena:");

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel34MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel34MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel34MouseExited(evt);
            }
        });

        jLabel81.setBackground(new java.awt.Color(255, 255, 255));
        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(207, 6, 46));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("Dodaj produkt");
        jLabel81.setToolTipText("");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel81)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel81)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        bladText2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bladText2.setForeground(new java.awt.Color(207, 6, 46));
        bladText2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bladText2.setText("Niepoprawnie uzupełnione pola formularza!");
        bladText2.setToolTipText("");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel77))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel78)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator61, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginText4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator58, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hasloText4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel76))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator63)))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(bladText2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator59, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel76)
                .addGap(30, 30, 30)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginText4))
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel78)
                            .addComponent(hasloText4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addComponent(jSeparator61, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator63, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bladText2)
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel33Layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jSeparator59, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(456, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout dodajProductWindowLayout = new javax.swing.GroupLayout(dodajProductWindow.getContentPane());
        dodajProductWindow.getContentPane().setLayout(dodajProductWindowLayout);
        dodajProductWindowLayout.setHorizontalGroup(
            dodajProductWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dodajProductWindowLayout.createSequentialGroup()
                .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dodajProductWindowLayout.setVerticalGroup(
            dodajProductWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        usunProductWindow.setMinimumSize(new java.awt.Dimension(400, 300));
        usunProductWindow.setResizable(false);

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel36.setName(""); // NOI18N

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(207, 6, 46));
        jLabel79.setText("NetBest");

        usunLoginText4.setBorder(null);
        usunLoginText4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usunLoginText4ActionPerformed(evt);
            }
        });

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(207, 6, 46));
        jLabel80.setText("Podaj ID produktu, który chcesz usunąć:");

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel37MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel37MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel37MouseExited(evt);
            }
        });

        jLabel82.setForeground(new java.awt.Color(207, 6, 46));
        jLabel82.setText("Usuń produkt!");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel82)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel82)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator60)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel79)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usunLoginText4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator62)
                            .addComponent(jSeparator64))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator60, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usunLoginText4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator62, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator64, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout usunProductWindowLayout = new javax.swing.GroupLayout(usunProductWindow.getContentPane());
        usunProductWindow.getContentPane().setLayout(usunProductWindowLayout);
        usunProductWindowLayout.setHorizontalGroup(
            usunProductWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        usunProductWindowLayout.setVerticalGroup(
            usunProductWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        wyborProductWindow.setMinimumSize(new java.awt.Dimension(400, 150));
        wyborProductWindow.setResizable(false);

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setMinimumSize(new java.awt.Dimension(400, 150));

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(207, 6, 46));
        jLabel83.setText("UWAGA!");

        jLabel84.setForeground(new java.awt.Color(207, 6, 46));
        jLabel84.setText("Czy na pewno chcesz usunąć użytkownika?");

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setPreferredSize(new java.awt.Dimension(200, 75));
        jPanel39.setRequestFocusEnabled(false);
        jPanel39.setVerifyInputWhenFocusTarget(false);
        jPanel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel39MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel39MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel39MouseExited(evt);
            }
        });

        jLabel85.setText("TAK!");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel85)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel85)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));
        jPanel40.setMinimumSize(new java.awt.Dimension(200, 75));
        jPanel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel40MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel40MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel40MouseExited(evt);
            }
        });

        jLabel86.setText("NIE!");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel86)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel86)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel84)
                .addGap(95, 95, 95))
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel83)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel83)
                .addGap(18, 18, 18)
                .addComponent(jLabel84)
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout wyborProductWindowLayout = new javax.swing.GroupLayout(wyborProductWindow.getContentPane());
        wyborProductWindow.getContentPane().setLayout(wyborProductWindowLayout);
        wyborProductWindowLayout.setHorizontalGroup(
            wyborProductWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        wyborProductWindowLayout.setVerticalGroup(
            wyborProductWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        updateProductWindow.setMinimumSize(new java.awt.Dimension(400, 400));
        updateProductWindow.setResizable(false);

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel41.setName(""); // NOI18N

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(207, 6, 46));
        jLabel87.setText("NetBest");

        usunLoginText5.setBorder(null);
        usunLoginText5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usunLoginText5ActionPerformed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(207, 6, 46));
        jLabel88.setText("Podaj ID produktu, który chcesz zmodyfikować:");

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));
        jPanel42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel42MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel42MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel42MouseExited(evt);
            }
        });

        jLabel89.setForeground(new java.awt.Color(207, 6, 46));
        jLabel89.setText("Edytuj produkt!");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel89)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel89)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(207, 6, 46));
        jLabel90.setText("Nie wpisano ID produktu!");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator65)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel87)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usunLoginText5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator66)
                            .addComponent(jSeparator67, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator65, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel88)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usunLoginText5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator66, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator67, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90)
                .addContainerGap())
        );

        javax.swing.GroupLayout updateProductWindowLayout = new javax.swing.GroupLayout(updateProductWindow.getContentPane());
        updateProductWindow.getContentPane().setLayout(updateProductWindowLayout);
        updateProductWindowLayout.setHorizontalGroup(
            updateProductWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        updateProductWindowLayout.setVerticalGroup(
            updateProductWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        updateProduct.setMinimumSize(new java.awt.Dimension(390, 550));
        updateProduct.setResizable(false);

        updateWindowsClient1.setBackground(new java.awt.Color(255, 255, 255));
        updateWindowsClient1.setMinimumSize(new java.awt.Dimension(390, 550));
        updateWindowsClient1.setRequestFocusEnabled(false);

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(207, 6, 46));
        jLabel91.setText("NetBest");

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(207, 6, 46));
        jLabel92.setText("Nazwa:");

        loginText5.setBorder(null);
        loginText5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginText5ActionPerformed(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(207, 6, 46));
        jLabel93.setText("Cena:");

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));
        jPanel43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel43MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel43MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel43MouseExited(evt);
            }
        });

        jLabel95.setBackground(new java.awt.Color(255, 255, 255));
        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(207, 6, 46));
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("Edytuj produkt!");
        jLabel95.setToolTipText("");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel95)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel95)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        blad3Text2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        blad3Text2.setForeground(new java.awt.Color(207, 6, 46));
        blad3Text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blad3Text2.setText("Nie uzupełniono wszystkich pól!");
        blad3Text2.setToolTipText("");

        cenaSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 0.01f));
        cenaSpinner.setBorder(null);

        javax.swing.GroupLayout updateWindowsClient1Layout = new javax.swing.GroupLayout(updateWindowsClient1);
        updateWindowsClient1.setLayout(updateWindowsClient1Layout);
        updateWindowsClient1Layout.setHorizontalGroup(
            updateWindowsClient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateWindowsClient1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel91)
                .addGap(121, 121, 121))
            .addGroup(updateWindowsClient1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(updateWindowsClient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blad3Text2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(updateWindowsClient1Layout.createSequentialGroup()
                        .addGroup(updateWindowsClient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel93)
                            .addComponent(jLabel92))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updateWindowsClient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cenaSpinner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginText5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator68, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator70, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(updateWindowsClient1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(updateWindowsClient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator72, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(updateWindowsClient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator69, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
        );
        updateWindowsClient1Layout.setVerticalGroup(
            updateWindowsClient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateWindowsClient1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel91)
                .addGap(28, 28, 28)
                .addGroup(updateWindowsClient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel92)
                    .addGroup(updateWindowsClient1Layout.createSequentialGroup()
                        .addComponent(loginText5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator68, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateWindowsClient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cenaSpinner))
                .addGap(0, 0, 0)
                .addComponent(jSeparator70, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator72, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(blad3Text2)
                .addContainerGap(221, Short.MAX_VALUE))
            .addGroup(updateWindowsClient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updateWindowsClient1Layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jSeparator69, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(456, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout updateProductLayout = new javax.swing.GroupLayout(updateProduct.getContentPane());
        updateProduct.getContentPane().setLayout(updateProductLayout);
        updateProductLayout.setHorizontalGroup(
            updateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateWindowsClient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        updateProductLayout.setVerticalGroup(
            updateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateWindowsClient1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        orderWindow.setMaximumSize(new java.awt.Dimension(876, 630));
        orderWindow.setMinimumSize(new java.awt.Dimension(876, 630));
        orderWindow.setPreferredSize(new java.awt.Dimension(876, 630));
        orderWindow.setResizable(false);

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));
        jPanel44.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(207, 6, 46));
        jLabel94.setText("NetBest");

        jLabel96.setForeground(new java.awt.Color(207, 6, 46));
        jLabel96.setText("Panel zamówień");

        userTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numer zamówienia", "Sprzedawca", "Imie", "Naziwsko", "Adres", "Data zamówienia", "Nazwa produktu", "Cena"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userTable2.setGridColor(new java.awt.Color(255, 255, 255));
        userTable2.setMaximumSize(new java.awt.Dimension(375, 816));
        userTable2.setMinimumSize(new java.awt.Dimension(375, 816));
        jScrollPane4.setViewportView(userTable2);
        if (userTable2.getColumnModel().getColumnCount() > 0) {
            userTable2.getColumnModel().getColumn(0).setPreferredWidth(85);
            userTable2.getColumnModel().getColumn(4).setPreferredWidth(130);
            userTable2.getColumnModel().getColumn(7).setPreferredWidth(50);
        }

        dodajButton3.setBackground(new java.awt.Color(255, 255, 255));
        dodajButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dodajButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dodajButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dodajButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dodajButton3MouseExited(evt);
            }
        });

        jLabel97.setForeground(new java.awt.Color(207, 6, 46));
        jLabel97.setText("Dodaj");

        javax.swing.GroupLayout dodajButton3Layout = new javax.swing.GroupLayout(dodajButton3);
        dodajButton3.setLayout(dodajButton3Layout);
        dodajButton3Layout.setHorizontalGroup(
            dodajButton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dodajButton3Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel97)
                .addGap(59, 59, 59))
        );
        dodajButton3Layout.setVerticalGroup(
            dodajButton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dodajButton3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel97)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        usunButton3.setBackground(new java.awt.Color(255, 255, 255));
        usunButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usunButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usunButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usunButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usunButton3MouseExited(evt);
            }
        });

        jLabel98.setForeground(new java.awt.Color(207, 6, 46));
        jLabel98.setText("Usuń");

        javax.swing.GroupLayout usunButton3Layout = new javax.swing.GroupLayout(usunButton3);
        usunButton3.setLayout(usunButton3Layout);
        usunButton3Layout.setHorizontalGroup(
            usunButton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usunButton3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel98)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        usunButton3Layout.setVerticalGroup(
            usunButton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usunButton3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel98)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        modyfikujButton3.setBackground(new java.awt.Color(255, 255, 255));
        modyfikujButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modyfikujButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modyfikujButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modyfikujButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modyfikujButton3MouseExited(evt);
            }
        });

        jLabel99.setForeground(new java.awt.Color(207, 6, 46));
        jLabel99.setText("Modyfikuj");

        javax.swing.GroupLayout modyfikujButton3Layout = new javax.swing.GroupLayout(modyfikujButton3);
        modyfikujButton3.setLayout(modyfikujButton3Layout);
        modyfikujButton3Layout.setHorizontalGroup(
            modyfikujButton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modyfikujButton3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel99)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        modyfikujButton3Layout.setVerticalGroup(
            modyfikujButton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modyfikujButton3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel99)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator71)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(dodajButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(usunButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addComponent(modyfikujButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addComponent(jSeparator73)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jLabel94))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jLabel96))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator71, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel96)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator73, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dodajButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usunButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modyfikujButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout orderWindowLayout = new javax.swing.GroupLayout(orderWindow.getContentPane());
        orderWindow.getContentPane().setLayout(orderWindowLayout);
        orderWindowLayout.setHorizontalGroup(
            orderWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderWindowLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        orderWindowLayout.setVerticalGroup(
            orderWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        dodajOrderWindow.setMinimumSize(new java.awt.Dimension(440, 550));
        dodajOrderWindow.setResizable(false);

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel45.setMinimumSize(new java.awt.Dimension(390, 550));
        jPanel45.setRequestFocusEnabled(false);

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(207, 6, 46));
        jLabel100.setText("NetBest");

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(207, 6, 46));
        jLabel101.setText("ID produktu:");

        loginText6.setBorder(null);
        loginText6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginText6ActionPerformed(evt);
            }
        });

        hasloText5.setBorder(null);
        hasloText5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasloText5ActionPerformed(evt);
            }
        });

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(207, 6, 46));
        jLabel102.setText("Pesel klienta:");

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));
        jPanel46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel46MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel46MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel46MouseExited(evt);
            }
        });

        jLabel103.setBackground(new java.awt.Color(255, 255, 255));
        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(207, 6, 46));
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("Dodaj zamówienie!");
        jLabel103.setToolTipText("");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel103))
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator77, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 158, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel103)
                .addGap(18, 18, 18)
                .addComponent(jSeparator77, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dataOrder.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(), null, java.util.Calendar.DAY_OF_MONTH));

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(207, 6, 46));
        jLabel104.setText("Data zamówienia:");

        ulicaText.setBorder(null);
        ulicaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulicaTextActionPerformed(evt);
            }
        });

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(207, 6, 46));
        jLabel105.setText("Ulica:");

        domText.setBorder(null);
        domText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domTextActionPerformed(evt);
            }
        });

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(207, 6, 46));
        jLabel106.setText("Numer domu:");

        kodText.setBorder(null);
        kodText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodTextActionPerformed(evt);
            }
        });

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(207, 6, 46));
        jLabel107.setText("Kod pocztowy:");

        miejscowoscText.setBorder(null);
        miejscowoscText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miejscowoscTextActionPerformed(evt);
            }
        });

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(207, 6, 46));
        jLabel108.setText("Miejscowość:");

        bladText3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bladText3.setForeground(new java.awt.Color(207, 6, 46));
        bladText3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bladText3.setText("Niepoprawnie uzupełnione pola formularza!");
        bladText3.setToolTipText("");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel45Layout.createSequentialGroup()
                            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel45Layout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addComponent(jLabel101))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel102, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel104, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(loginText6, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator74, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hasloText5, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(dataOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(jSeparator76, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                                    .addComponent(jLabel105)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator78, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ulicaText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                                    .addComponent(jLabel106)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator79, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(domText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                                    .addComponent(jLabel107)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator80, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(kodText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                                    .addComponent(jLabel108)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator81, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(miejscowoscText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(1, 1, 1)))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(bladText3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel100)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator75, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel100)
                .addGap(30, 30, 30)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginText6))
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel102)
                            .addComponent(hasloText5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addComponent(jSeparator76, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel104))
                .addGap(18, 18, 18)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ulicaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel105))
                .addGap(0, 0, 0)
                .addComponent(jSeparator78, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(domText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106))
                .addGap(0, 0, 0)
                .addComponent(jSeparator79, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kodText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel107))
                .addGap(0, 0, 0)
                .addComponent(jSeparator80, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(miejscowoscText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel108))
                .addGap(0, 0, 0)
                .addComponent(jSeparator81, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bladText3)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel45Layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jSeparator75, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(456, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout dodajOrderWindowLayout = new javax.swing.GroupLayout(dodajOrderWindow.getContentPane());
        dodajOrderWindow.getContentPane().setLayout(dodajOrderWindowLayout);
        dodajOrderWindowLayout.setHorizontalGroup(
            dodajOrderWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dodajOrderWindowLayout.setVerticalGroup(
            dodajOrderWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        czyNowyWindow.setMinimumSize(new java.awt.Dimension(400, 150));
        czyNowyWindow.setResizable(false);

        jPanel47.setBackground(new java.awt.Color(255, 255, 255));
        jPanel47.setMinimumSize(new java.awt.Dimension(400, 150));

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(207, 6, 46));
        jLabel109.setText("UWAGA!");

        jLabel110.setForeground(new java.awt.Color(207, 6, 46));
        jLabel110.setText("Klient o danym peselu nie istnieje w bazie danych.");

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));
        jPanel48.setPreferredSize(new java.awt.Dimension(200, 75));
        jPanel48.setRequestFocusEnabled(false);
        jPanel48.setVerifyInputWhenFocusTarget(false);
        jPanel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel48MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel48MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel48MouseExited(evt);
            }
        });

        jLabel111.setText("TAK!");

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel111)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel111)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel49.setBackground(new java.awt.Color(255, 255, 255));
        jPanel49.setMinimumSize(new java.awt.Dimension(200, 75));
        jPanel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel49MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel49MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel49MouseExited(evt);
            }
        });

        jLabel112.setText("NIE!");

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel112)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel112)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLabel113.setForeground(new java.awt.Color(207, 6, 46));
        jLabel113.setText("Czy chcesz utworzyć nowego klienta?");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel109))
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel110)
                            .addGroup(jPanel47Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel113)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel109)
                .addGap(0, 0, 0)
                .addComponent(jLabel110)
                .addGap(5, 5, 5)
                .addComponent(jLabel113)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout czyNowyWindowLayout = new javax.swing.GroupLayout(czyNowyWindow.getContentPane());
        czyNowyWindow.getContentPane().setLayout(czyNowyWindowLayout);
        czyNowyWindowLayout.setHorizontalGroup(
            czyNowyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        czyNowyWindowLayout.setVerticalGroup(
            czyNowyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        usunOrder.setMinimumSize(new java.awt.Dimension(400, 330));
        usunOrder.setResizable(false);

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));
        jPanel50.setMinimumSize(new java.awt.Dimension(400, 330));
        jPanel50.setName(""); // NOI18N
        jPanel50.setPreferredSize(new java.awt.Dimension(400, 330));

        jLabel114.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(207, 6, 46));
        jLabel114.setText("NetBest");

        usunLoginText6.setBorder(null);
        usunLoginText6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usunLoginText6ActionPerformed(evt);
            }
        });

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(207, 6, 46));
        jLabel115.setText("Podaj numer zamówienia który chcesz usunąć z listy:");

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));
        jPanel51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel51MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel51MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel51MouseExited(evt);
            }
        });

        jLabel116.setForeground(new java.awt.Color(207, 6, 46));
        jLabel116.setText("Usuń zamówienie!");

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel116)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel116)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        bladText4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bladText4.setForeground(new java.awt.Color(207, 6, 46));
        bladText4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bladText4.setText("Brak zamówienia o podanym ID!");
        bladText4.setToolTipText("");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator82)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel115, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addGroup(jPanel50Layout.createSequentialGroup()
                                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(usunLoginText6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator83)
                                    .addComponent(jSeparator84))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel50Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel114))
                            .addGroup(jPanel50Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bladText4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel114)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator82, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel115)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usunLoginText6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator83, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator84, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bladText4)
                .addContainerGap())
        );

        javax.swing.GroupLayout usunOrderLayout = new javax.swing.GroupLayout(usunOrder.getContentPane());
        usunOrder.getContentPane().setLayout(usunOrderLayout);
        usunOrderLayout.setHorizontalGroup(
            usunOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        usunOrderLayout.setVerticalGroup(
            usunOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        wyborUsunOrder.setMinimumSize(new java.awt.Dimension(400, 150));
        wyborUsunOrder.setPreferredSize(new java.awt.Dimension(400, 150));
        wyborUsunOrder.setResizable(false);

        jPanel52.setBackground(new java.awt.Color(255, 255, 255));
        jPanel52.setMinimumSize(new java.awt.Dimension(400, 150));

        jLabel117.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(207, 6, 46));
        jLabel117.setText("UWAGA!");

        jLabel118.setForeground(new java.awt.Color(207, 6, 46));
        jLabel118.setText("Czy napewno chcesz usunąć zamówienie?");

        jPanel53.setBackground(new java.awt.Color(255, 255, 255));
        jPanel53.setPreferredSize(new java.awt.Dimension(200, 75));
        jPanel53.setRequestFocusEnabled(false);
        jPanel53.setVerifyInputWhenFocusTarget(false);
        jPanel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel53MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel53MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel53MouseExited(evt);
            }
        });

        jLabel119.setText("TAK!");

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel119)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel119)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel54.setBackground(new java.awt.Color(255, 255, 255));
        jPanel54.setMinimumSize(new java.awt.Dimension(200, 75));
        jPanel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel54MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel54MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel54MouseExited(evt);
            }
        });

        jLabel120.setText("NIE!");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel120)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel120)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel117))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel118)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel117)
                .addGap(18, 18, 18)
                .addComponent(jLabel118)
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout wyborUsunOrderLayout = new javax.swing.GroupLayout(wyborUsunOrder.getContentPane());
        wyborUsunOrder.getContentPane().setLayout(wyborUsunOrderLayout);
        wyborUsunOrderLayout.setHorizontalGroup(
            wyborUsunOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        wyborUsunOrderLayout.setVerticalGroup(
            wyborUsunOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        updateOrder.setMinimumSize(new java.awt.Dimension(440, 550));
        updateOrder.setPreferredSize(new java.awt.Dimension(440, 550));
        updateOrder.setResizable(false);

        jPanel55.setBackground(new java.awt.Color(255, 255, 255));
        jPanel55.setMinimumSize(new java.awt.Dimension(390, 550));
        jPanel55.setRequestFocusEnabled(false);

        jLabel121.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(207, 6, 46));
        jLabel121.setText("NetBest");

        jLabel122.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(207, 6, 46));
        jLabel122.setText("ID produktu:");

        loginText7.setBorder(null);
        loginText7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginText7ActionPerformed(evt);
            }
        });

        hasloText6.setBorder(null);
        hasloText6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasloText6ActionPerformed(evt);
            }
        });

        jLabel123.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(207, 6, 46));
        jLabel123.setText("Pesel klienta:");

        jPanel56.setBackground(new java.awt.Color(255, 255, 255));
        jPanel56.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel56MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel56MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel56MouseExited(evt);
            }
        });

        jLabel124.setBackground(new java.awt.Color(255, 255, 255));
        jLabel124.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(207, 6, 46));
        jLabel124.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel124.setText("Edytuj zamówienie!");
        jLabel124.setToolTipText("");

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel124))
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator88, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel124)
                .addGap(18, 18, 18)
                .addComponent(jSeparator88, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ulicaText1.setBorder(null);
        ulicaText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulicaText1ActionPerformed(evt);
            }
        });

        jLabel126.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(207, 6, 46));
        jLabel126.setText("Ulica:");

        domText1.setBorder(null);
        domText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domText1ActionPerformed(evt);
            }
        });

        jLabel127.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(207, 6, 46));
        jLabel127.setText("Numer domu:");

        kodText1.setBorder(null);
        kodText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodText1ActionPerformed(evt);
            }
        });

        jLabel128.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(207, 6, 46));
        jLabel128.setText("Kod pocztowy:");

        miejscowoscText1.setBorder(null);
        miejscowoscText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miejscowoscText1ActionPerformed(evt);
            }
        });

        jLabel129.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(207, 6, 46));
        jLabel129.setText("Miejscowość:");

        bladText5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bladText5.setForeground(new java.awt.Color(207, 6, 46));
        bladText5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bladText5.setText("Niepoprawnie uzupełnione pola formularza!");
        bladText5.setToolTipText("");

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel55Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel122))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel55Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel123)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginText7, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator85, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hasloText6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator87, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(bladText5, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel121))
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel55Layout.createSequentialGroup()
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel55Layout.createSequentialGroup()
                                .addComponent(jLabel126)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator89, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ulicaText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel55Layout.createSequentialGroup()
                                .addComponent(jLabel127)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator90, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(domText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel55Layout.createSequentialGroup()
                                .addComponent(jLabel128)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator91, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(kodText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel55Layout.createSequentialGroup()
                                .addComponent(jLabel129)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator92, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(miejscowoscText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator86, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel121)
                .addGap(30, 30, 30)
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel122, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginText7))
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel123)
                            .addComponent(hasloText6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addComponent(jSeparator87, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ulicaText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel126))
                .addGap(0, 0, 0)
                .addComponent(jSeparator89, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(domText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel127))
                .addGap(0, 0, 0)
                .addComponent(jSeparator90, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kodText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel128))
                .addGap(0, 0, 0)
                .addComponent(jSeparator91, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(miejscowoscText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel129))
                .addGap(0, 0, 0)
                .addComponent(jSeparator92, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bladText5)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel55Layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jSeparator86, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(456, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout updateOrderLayout = new javax.swing.GroupLayout(updateOrder.getContentPane());
        updateOrder.getContentPane().setLayout(updateOrderLayout);
        updateOrderLayout.setHorizontalGroup(
            updateOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        updateOrderLayout.setVerticalGroup(
            updateOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        IdUpdateOrder.setMinimumSize(new java.awt.Dimension(400, 400));
        IdUpdateOrder.setPreferredSize(new java.awt.Dimension(400, 400));
        IdUpdateOrder.setResizable(false);

        jPanel57.setBackground(new java.awt.Color(255, 255, 255));
        jPanel57.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel57.setName(""); // NOI18N

        jLabel125.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(207, 6, 46));
        jLabel125.setText("NetBest");

        usunLoginText7.setBorder(null);
        usunLoginText7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usunLoginText7ActionPerformed(evt);
            }
        });

        jLabel130.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(207, 6, 46));
        jLabel130.setText("Podaj ID produktu, który chcesz zmodyfikować:");

        jPanel58.setBackground(new java.awt.Color(255, 255, 255));
        jPanel58.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel58MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel58MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel58MouseExited(evt);
            }
        });

        jLabel131.setForeground(new java.awt.Color(207, 6, 46));
        jLabel131.setText("Edytuj produkt!");

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel131)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel131)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabel132.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(207, 6, 46));
        jLabel132.setText("Nie wpisano ID produktu!");

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator93)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel125)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addComponent(jLabel130, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel58, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usunLoginText7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator94)
                            .addComponent(jSeparator95, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel57Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel125)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator93, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel130)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usunLoginText7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator94, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator95, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel132)
                .addContainerGap())
        );

        javax.swing.GroupLayout IdUpdateOrderLayout = new javax.swing.GroupLayout(IdUpdateOrder.getContentPane());
        IdUpdateOrder.getContentPane().setLayout(IdUpdateOrderLayout);
        IdUpdateOrderLayout.setHorizontalGroup(
            IdUpdateOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        IdUpdateOrderLayout.setVerticalGroup(
            IdUpdateOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        welcomeWindow.setMinimumSize(new java.awt.Dimension(400, 150));
        welcomeWindow.setModal(true);
        welcomeWindow.setPreferredSize(new java.awt.Dimension(400, 150));
        welcomeWindow.setResizable(false);
        welcomeWindow.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                welcomeWindowWindowOpened(evt);
            }
        });

        jPanel59.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel133.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(207, 6, 46));
        jLabel133.setText("Witaj!");

        jPanel60.setBackground(new java.awt.Color(255, 255, 255));
        jPanel60.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel60MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel60MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel60MouseExited(evt);
            }
        });

        blad3Text3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        blad3Text3.setForeground(new java.awt.Color(207, 6, 46));
        blad3Text3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blad3Text3.setText("Przejdz do programu");
        blad3Text3.setToolTipText("");

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(blad3Text3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(blad3Text3)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel59Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel59Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel59Layout.createSequentialGroup()
                        .addComponent(jLabel133)
                        .addGap(166, 166, 166))))
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel59Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel133)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout welcomeWindowLayout = new javax.swing.GroupLayout(welcomeWindow.getContentPane());
        welcomeWindow.getContentPane().setLayout(welcomeWindowLayout);
        welcomeWindowLayout.setHorizontalGroup(
            welcomeWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        welcomeWindowLayout.setVerticalGroup(
            welcomeWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NetBest");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(214, 725));
        setMinimumSize(new java.awt.Dimension(214, 725));
        setName("MainWindow"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(214, 725));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(207, 6, 46));
        jLabel1.setText("NetBest");

        usersButton.setBackground(new java.awt.Color(255, 255, 255));
        usersButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usersButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                usersButtonMouseDragged(evt);
            }
        });
        usersButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usersButtonMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(207, 6, 46));
        jLabel2.setText("Użytkownicy");

        javax.swing.GroupLayout usersButtonLayout = new javax.swing.GroupLayout(usersButton);
        usersButton.setLayout(usersButtonLayout);
        usersButtonLayout.setHorizontalGroup(
            usersButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersButtonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(usersButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usersButtonLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        usersButtonLayout.setVerticalGroup(
            usersButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usersButtonLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        klienciButton.setBackground(new java.awt.Color(255, 255, 255));
        klienciButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        klienciButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                klienciButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                klienciButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                klienciButtonMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(207, 6, 46));
        jLabel4.setText("Klienci");

        javax.swing.GroupLayout klienciButtonLayout = new javax.swing.GroupLayout(klienciButton);
        klienciButton.setLayout(klienciButtonLayout);
        klienciButtonLayout.setHorizontalGroup(
            klienciButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(klienciButtonLayout.createSequentialGroup()
                .addGroup(klienciButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(klienciButtonLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(klienciButtonLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel4)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        klienciButtonLayout.setVerticalGroup(
            klienciButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, klienciButtonLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        produktyButton.setBackground(new java.awt.Color(255, 255, 255));
        produktyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        produktyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produktyButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                produktyButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                produktyButtonMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(207, 6, 46));
        jLabel5.setText("Produkty");

        javax.swing.GroupLayout produktyButtonLayout = new javax.swing.GroupLayout(produktyButton);
        produktyButton.setLayout(produktyButtonLayout);
        produktyButtonLayout.setHorizontalGroup(
            produktyButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produktyButtonLayout.createSequentialGroup()
                .addGroup(produktyButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(produktyButtonLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(produktyButtonLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel5)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        produktyButtonLayout.setVerticalGroup(
            produktyButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produktyButtonLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        zamowieniaButton.setBackground(new java.awt.Color(255, 255, 255));
        zamowieniaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zamowieniaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zamowieniaButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                zamowieniaButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                zamowieniaButtonMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(207, 6, 46));
        jLabel6.setText("Zamówienia");

        javax.swing.GroupLayout zamowieniaButtonLayout = new javax.swing.GroupLayout(zamowieniaButton);
        zamowieniaButton.setLayout(zamowieniaButtonLayout);
        zamowieniaButtonLayout.setHorizontalGroup(
            zamowieniaButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zamowieniaButtonLayout.createSequentialGroup()
                .addGroup(zamowieniaButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(zamowieniaButtonLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(zamowieniaButtonLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel6)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        zamowieniaButtonLayout.setVerticalGroup(
            zamowieniaButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, zamowieniaButtonLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        rozliczeniaButton.setBackground(new java.awt.Color(255, 255, 255));
        rozliczeniaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rozliczeniaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rozliczeniaButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rozliczeniaButtonMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(207, 6, 46));
        jLabel7.setText("Rozliczenia");

        javax.swing.GroupLayout rozliczeniaButtonLayout = new javax.swing.GroupLayout(rozliczeniaButton);
        rozliczeniaButton.setLayout(rozliczeniaButtonLayout);
        rozliczeniaButtonLayout.setHorizontalGroup(
            rozliczeniaButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rozliczeniaButtonLayout.createSequentialGroup()
                .addGroup(rozliczeniaButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rozliczeniaButtonLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rozliczeniaButtonLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel7)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        rozliczeniaButtonLayout.setVerticalGroup(
            rozliczeniaButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rozliczeniaButtonLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usersButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klienciButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produktyButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zamowieniaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rozliczeniaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usersButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(klienciButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(produktyButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(zamowieniaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rozliczeniaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usersButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersButtonMouseClicked
blad2Text.setVisible(false);
        bladText.setVisible(false);
        usersWindow.setVisible(true);
        refresh();
    this.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_usersButtonMouseClicked

    private void usersWindowWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_usersWindowWindowClosing
       this.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_usersWindowWindowClosing

    private void usersButtonMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersButtonMouseDragged

        // TODO add your handling code here:
    }//GEN-LAST:event_usersButtonMouseDragged

    private void usersButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersButtonMouseEntered
usersButton.setBackground(Color.getHSBColor(0, 0, (float) 0.98));
        // TODO add your handling code here:
    }//GEN-LAST:event_usersButtonMouseEntered

    private void usersButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersButtonMouseExited
usersButton.setBackground(Color.getHSBColor(0, 0, (float) 1));     
       // TODO add your handling code here:
    }//GEN-LAST:event_usersButtonMouseExited

    private void klienciButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_klienciButtonMouseEntered
klienciButton.setBackground(Color.getHSBColor(0, 0, (float) 0.98));        
// TODO add your handling code here:
    }//GEN-LAST:event_klienciButtonMouseEntered

    private void klienciButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_klienciButtonMouseExited
klienciButton.setBackground(Color.getHSBColor(0, 0, (float) 1));           
// TODO add your handling code here:
    }//GEN-LAST:event_klienciButtonMouseExited

    private void produktyButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produktyButtonMouseEntered
      produktyButton.setBackground(Color.getHSBColor(0, 0, (float) 0.98));   
        // TODO add your handling code here:
    }//GEN-LAST:event_produktyButtonMouseEntered

    private void produktyButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produktyButtonMouseExited
produktyButton.setBackground(Color.getHSBColor(0, 0, (float) 1));        
// TODO add your handling code here:
    }//GEN-LAST:event_produktyButtonMouseExited

    private void zamowieniaButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zamowieniaButtonMouseEntered
zamowieniaButton.setBackground(Color.getHSBColor(0, 0, (float) 0.98));
        // TODO add your handling code here:
    }//GEN-LAST:event_zamowieniaButtonMouseEntered

    private void zamowieniaButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zamowieniaButtonMouseExited
zamowieniaButton.setBackground(Color.getHSBColor(0, 0, (float) 1));
        // TODO add your handling code here:
    }//GEN-LAST:event_zamowieniaButtonMouseExited

    private void rozliczeniaButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rozliczeniaButtonMouseEntered
rozliczeniaButton.setBackground(Color.getHSBColor(0, 0, (float) 0.98));
        // TODO add your handling code here:
    }//GEN-LAST:event_rozliczeniaButtonMouseEntered

    private void rozliczeniaButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rozliczeniaButtonMouseExited
rozliczeniaButton.setBackground(Color.getHSBColor(0, 0, (float) 1));
        // TODO add your handling code here:
    }//GEN-LAST:event_rozliczeniaButtonMouseExited

    private void dodajButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dodajButtonMouseEntered
dodajButton.setBackground(Color.getHSBColor(0, 0, (float) 0.98));
        // TODO add your handling code here:
    }//GEN-LAST:event_dodajButtonMouseEntered

    private void usunButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usunButtonMouseEntered
usunButton.setBackground(Color.getHSBColor(0, 0, (float) 0.98));
        // TODO add your handling code here:
    }//GEN-LAST:event_usunButtonMouseEntered

    private void modyfikujButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modyfikujButtonMouseEntered
modyfikujButton.setBackground(Color.getHSBColor(0, 0, (float) 0.98));
        // TODO add your handling code here:
    }//GEN-LAST:event_modyfikujButtonMouseEntered

    private void modyfikujButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modyfikujButtonMouseExited
modyfikujButton.setBackground(Color.getHSBColor(0, 0, (float) 1));
        // TODO add your handling code here:
    }//GEN-LAST:event_modyfikujButtonMouseExited

    private void usunButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usunButtonMouseExited
usunButton.setBackground(Color.getHSBColor(0, 0, (float) 1));
        // TODO add your handling code here:
    }//GEN-LAST:event_usunButtonMouseExited

    private void dodajButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dodajButtonMouseExited
dodajButton.setBackground(Color.getHSBColor(0, 0, (float) 1));
        // TODO add your handling code here:
    }//GEN-LAST:event_dodajButtonMouseExited

    private void dodajButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dodajButtonMouseClicked
   dodajWindow.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_dodajButtonMouseClicked

    private void usunButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usunButtonMouseClicked
usunWindow.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_usunButtonMouseClicked

    private void nazwTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nazwTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nazwTextActionPerformed

    private void imieTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imieTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imieTextActionPerformed

    private void hasloTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasloTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasloTextActionPerformed

    private void loginTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginTextActionPerformed

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
jPanel8.setBackground(Color.getHSBColor(0, 0, (float) 0.98));
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
    jPanel8.setBackground(Color.getHSBColor(0, 0, (float) 1));
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
jPanel3.setBackground(Color.getHSBColor(0, 0, (float) 0.98));        
// TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
if(click==false)jPanel3.setBackground(Color.getHSBColor(0, 0, (float) 1));        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
jPanel5.setBackground(Color.getHSBColor(0, 0, (float) 0.98));        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
if(click3==false)jPanel5.setBackground(Color.getHSBColor(0, 0, (float) 1));        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
jPanel7.setBackground(Color.getHSBColor(0, 0, (float) 0.98));        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
if(click4==false)jPanel7.setBackground(Color.getHSBColor(0, 0, (float) 1));        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
rodzajDostepu=0;
click=true;
click2=false;
click3=false;
click4=false;
jPanel3.setBackground(Color.getHSBColor(0, 0, (float) 0.96));
jPanel7.setBackground(Color.getHSBColor(0, 0, (float) 1));
jPanel5.setBackground(Color.getHSBColor(0, 0, (float) 1));
jPanel4.setBackground(Color.getHSBColor(0, 0, (float) 1));
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
rodzajDostepu=2;
click=false;
click2=false;
click3=true;
click4=false;
jPanel3.setBackground(Color.getHSBColor(0, 0, (float) 1));
jPanel7.setBackground(Color.getHSBColor(0, 0, (float) 1));
jPanel5.setBackground(Color.getHSBColor(0, 0, (float) 0.96));
jPanel4.setBackground(Color.getHSBColor(0, 0, (float) 1));
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
rodzajDostepu=3;
click=false;
click2=false;
click3=false;
click4=true;
jPanel3.setBackground(Color.getHSBColor(0, 0, (float) 1));
jPanel7.setBackground(Color.getHSBColor(0, 0, (float) 0.96));
jPanel5.setBackground(Color.getHSBColor(0, 0, (float) 1));
jPanel4.setBackground(Color.getHSBColor(0, 0, (float) 1));
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked

        if(loginText.getText().equals(foo) || hasloText.getText().equals(foo)||imieText.getText().equals(foo)||nazwText.getText().equals(foo)||rodzajDostepu==5){
         bladText.setVisible(true);
}
        else{
            try{
             statement = db.conn.createStatement();
              queryString = "SELECT COUNT(login) FROM Users WHERE login = '"+loginText.getText()+"'";
              ResultSet rs;
              rs = db.statement.executeQuery(queryString);
              while(rs.next())
              loginIlosc=rs.getInt(1);
                System.out.println(loginIlosc);
       }
       catch(Exception e){
           e.printStackTrace();
              }
        if(loginIlosc==0){
            try{
             statement = db.conn.createStatement();
              queryString = "INSERT INTO Users (`Login`, `Password`, `Private`, `Name`, `Lastname`) VALUES ('"
                      + loginText.getText()+"', '"
                      + hasloText.getText()+"', '"
                      + rodzajDostepu+"', '"
                      + imieText.getText()+"', '"
                      + nazwText.getText()+ "');";
              ResultSet rs;
              statement.executeUpdate(queryString);
       }
       catch(Exception e){
           e.printStackTrace();
              }
refresh();
        dodajWindow.dispose();
        }
        else{
            blad2Text.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel8MouseClicked
    }
    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        if(click2==false)jPanel4.setBackground(Color.getHSBColor(0, 0, (float) 1));        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        jPanel4.setBackground(Color.getHSBColor(0, 0, (float) 0.98));        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        rodzajDostepu=1;
        click=false;
        click2=true;
        click3=false;
        click4=false;
        jPanel3.setBackground(Color.getHSBColor(0, 0, (float) 1));
        jPanel7.setBackground(Color.getHSBColor(0, 0, (float) 1));
        jPanel5.setBackground(Color.getHSBColor(0, 0, (float) 1));
        jPanel4.setBackground(Color.getHSBColor(0, 0, (float) 0.96));
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseClicked

    private void usunLoginTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunLoginTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usunLoginTextActionPerformed

    private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseEntered
      jPanel10.setBackground(Color.getHSBColor(0, 0, (float) 0.98));
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel10MouseEntered

    private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseExited
       jPanel10.setBackground(Color.getHSBColor(0, 0, (float) 1)); // TODO add your handling code here:
    }//GEN-LAST:event_jPanel10MouseExited

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
if
        (!usunLoginText.getText().equals(foo)){wyborWindow.setVisible(true);
}         // TODO add your handling code here:
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseEntered

           jPanel12.setBackground(Color.getHSBColor(0, 0, (float) 0.98));
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel12MouseEntered

    private void jPanel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseExited
        jPanel12.setBackground(Color.getHSBColor(0, 0, (float) 1));// TODO add your handling code here:
    }//GEN-LAST:event_jPanel12MouseExited

    private void jPanel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseEntered
jPanel13.setBackground(Color.getHSBColor(0, 0, (float) 0.98));        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel13MouseEntered

    private void jPanel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseExited
jPanel13.setBackground(Color.getHSBColor(0, 0, (float) 1));          // TODO add your handling code here:
    }//GEN-LAST:event_jPanel13MouseExited

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked

wyborWindow.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel13MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked

try{
             statement = db.conn.createStatement();
              queryString = "DELETE FROM Users WHERE Login='"
                      +usunLoginText.getText()+ "';";
              ResultSet rs;
              statement.executeUpdate(queryString);
       }
       catch(Exception e){
           e.printStackTrace();
              }
refresh();
wyborWindow.dispose();
usunWindow.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel12MouseClicked

    private void loginText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginText1ActionPerformed

    private void hasloText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasloText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasloText1ActionPerformed

    private void imieText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imieText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imieText1ActionPerformed

    private void nazwText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nazwText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nazwText1ActionPerformed

    private void jPanel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseClicked
      rodzajDostepu=0;
click=true;
click2=false;
click3=false;
click4=false;
jPanel15.setBackground(Color.getHSBColor(0, 0, (float) 0.96));
jPanel16.setBackground(Color.getHSBColor(0, 0, (float) 1));
jPanel17.setBackground(Color.getHSBColor(0, 0, (float) 1));
jPanel18.setBackground(Color.getHSBColor(0, 0, (float) 1));
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel15MouseClicked

    private void jPanel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel15MouseEntered

    private void jPanel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel15MouseExited

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseClicked
rodzajDostepu=1;
        click=false;
        click2=true;
        click3=false;
        click4=false;
        jPanel15.setBackground(Color.getHSBColor(0, 0, (float) 1));
        jPanel17.setBackground(Color.getHSBColor(0, 0, (float) 1));
        jPanel18.setBackground(Color.getHSBColor(0, 0, (float) 1));
        jPanel16.setBackground(Color.getHSBColor(0, 0, (float) 0.96));
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel16MouseClicked

    private void jPanel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel16MouseEntered

    private void jPanel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel16MouseExited

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked
rodzajDostepu=2;
click=false;
click2=false;
click3=true;
click4=false;
jPanel15.setBackground(Color.getHSBColor(0, 0, (float) 1));
jPanel16.setBackground(Color.getHSBColor(0, 0, (float) 1));
jPanel17.setBackground(Color.getHSBColor(0, 0, (float) 0.96));
jPanel18.setBackground(Color.getHSBColor(0, 0, (float) 1));
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel17MouseClicked

    private void jPanel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel17MouseEntered

    private void jPanel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel17MouseExited

    private void jPanel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseClicked
rodzajDostepu=3;
click=false;
click2=false;
click3=false;
click4=true;
jPanel17.setBackground(Color.getHSBColor(0, 0, (float) 1));
jPanel18.setBackground(Color.getHSBColor(0, 0, (float) 0.96));
jPanel15.setBackground(Color.getHSBColor(0, 0, (float) 1));
jPanel16.setBackground(Color.getHSBColor(0, 0, (float) 1));
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel18MouseClicked

    private void jPanel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel18MouseEntered

    private void jPanel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel18MouseExited

    private void jPanel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseClicked

if(loginText1.getText().equals(foo) || hasloText1.getText().equals(foo)||imieText1.getText().equals(foo)||nazwText1.getText().equals(foo)||rodzajDostepu==5){
         blad3Text.setVisible(true);
}
else{
try
{
             statement = db.conn.createStatement();
              queryString = "SELECT COUNT(login) FROM Users WHERE login = '"+loginText1.getText()+"';";
              ResultSet rs;
              rs = db.statement.executeQuery(queryString);
              while(rs.next())
              loginIlosc=rs.getInt(1);
}
catch(Exception e){
           e.printStackTrace();
              }
if(loginText1.getText().equals(usunLoginText1.getText())){
    try{
             statement = db.conn.createStatement();
              queryString = "UPDATE `sql11211999`.`Users` SET `Login`='"
                      +loginText1.getText() +"', `Password`='"
                      +hasloText1.getText()+ "', `Private`='"
                      +rodzajDostepu+ "', `Name`='"
                      +imieText1.getText()+"', `Lastname`='"
                      +nazwText1.getText() +"' WHERE  `Login`='"
                      +usunLoginText1.getText()+"';";
              ResultSet rs;
              statement.executeUpdate(queryString);
       }
       catch(Exception e){
           e.printStackTrace();
              }
refresh();
        updateWindow.dispose();
}
    if(loginIlosc==0){
            try{
             statement = db.conn.createStatement();
              queryString = "UPDATE `sql11211999`.`Users` SET `Login`='"
                      +loginText1.getText() +"', `Password`='"
                      +hasloText1.getText()+ "', `Private`='"
                      +rodzajDostepu+ "', `Name`='"
                      +imieText1.getText()+"', `Lastname`='"
                      +nazwText1.getText() +"' WHERE  `Login`='"
                      +usunLoginText1.getText()+"';";
              ResultSet rs;
              statement.executeUpdate(queryString);
       }
       catch(Exception e){
           e.printStackTrace();
              }
refresh();
        updateWindow.dispose();
}}

        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel19MouseClicked

    private void jPanel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel19MouseEntered

    private void jPanel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel19MouseExited

    private void usunLoginText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunLoginText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usunLoginText1ActionPerformed

    private void jPanel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseClicked

        if(usunLoginText1.getText().equals(foo)){
        jLabel43.setVisible(true);
        }
else{
            
            try{
             statement = db.conn.createStatement();
              queryString = "SELECT COUNT(login) FROM Users WHERE login = '"+usunLoginText1.getText()+"'";
              ResultSet rs;
              rs = db.statement.executeQuery(queryString);
              while(rs.next())
              loginIlosc=rs.getInt(1);
                System.out.println(loginIlosc);
       }
       catch(Exception e){
           e.printStackTrace();
              }
            if(loginIlosc!=0){
          updateWindow.setVisible(true);updateUser.setVisible(false); rodzajDostepu=5; blad3Text.setVisible(false);  
        } 
            else{
                jLabel43.setVisible(true);
            }
        }
               // TODO add your handling code here:
    }//GEN-LAST:event_jPanel21MouseClicked

    private void jPanel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel21MouseEntered

    private void jPanel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel21MouseExited

    private void modyfikujButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modyfikujButtonMouseClicked
updateUser.setVisible(true); jLabel43.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_modyfikujButtonMouseClicked

    private void updateUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateUserMouseEntered
jPanel21.setBackground(Color.getHSBColor(0, 0, (float) 1));        // TODO add your handling code here:
    }//GEN-LAST:event_updateUserMouseEntered

    private void updateUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateUserMouseExited
   jPanel21.setBackground(Color.getHSBColor(0, 0, (float) 0.98));       // TODO add your handling code here:
    }//GEN-LAST:event_updateUserMouseExited

    private void usunButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usunButton1MouseClicked
clientWindowUsun.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_usunButton1MouseClicked

    private void usunButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usunButton1MouseEntered
    usunButton1.setBackground(Color.getHSBColor(0,0,(float) 0.98));   
        // TODO add your handling code here:
    }//GEN-LAST:event_usunButton1MouseEntered

    private void usunButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usunButton1MouseExited
usunButton1.setBackground(Color.getHSBColor(0,0,(float) 1));         
// TODO add your handling code here:
    }//GEN-LAST:event_usunButton1MouseExited

    private void modyfikujButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modyfikujButton1MouseClicked
jLabel69.setVisible(false);
           updateClient.setVisible(true);
           // TODO add your handling code here:
    }//GEN-LAST:event_modyfikujButton1MouseClicked

    private void modyfikujButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modyfikujButton1MouseEntered
 modyfikujButton1.setBackground(Color.getHSBColor(0,0,(float) 0.98));     
        // TODO add your handling code here:
    }//GEN-LAST:event_modyfikujButton1MouseEntered

    private void modyfikujButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modyfikujButton1MouseExited
modyfikujButton1.setBackground(Color.getHSBColor(0,0,(float) 1));         
// TODO add your handling code here:
    }//GEN-LAST:event_modyfikujButton1MouseExited

    private void klienciButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_klienciButtonMouseClicked
clientWindow.setVisible(true);
refreshClients();
        


        // TODO add your handling code here:
    }//GEN-LAST:event_klienciButtonMouseClicked

    private void jPanel29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseExited
jPanel29.setBackground(Color.getHSBColor(0, 0,(float) 1));
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel29MouseExited

    private void jPanel29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseEntered
jPanel29.setBackground(Color.getHSBColor(0, 0,(float) 0.98));
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel29MouseEntered

    private void jPanel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseClicked

        if(loginText2.getText().equals(foo) || hasloText2.getText().equals(foo)||imieText2.getText().equals(foo)||nazwText2.getText().equals(foo)||nazwText2.getText().length()!=11 || imieText2.getText().indexOf("@")==-1 ){
         bladText1.setVisible(true);
}
        else{
            try{
             statement = db.conn.createStatement();
              queryString = "SELECT COUNT(Pesel) FROM Clients WHERE Pesel = '"+nazwText2.getText()+"'";
              ResultSet rs;
              rs = db.statement.executeQuery(queryString);
              while(rs.next())
              loginIlosc=rs.getInt(1);
                System.out.println(loginIlosc);
       }
       catch(Exception e){
           e.printStackTrace();
              }
        if(loginIlosc==0){
            try{
             statement = db.conn.createStatement();
              queryString = "INSERT INTO Clients (`Login`, `Name`, `Lastname`, `Email`, `Pesel`) VALUES ('"
                      + db.nazwaUser+"', '"
                      + loginText2.getText()+"', '"
                      + hasloText2.getText()+"', '"
                      + imieText2.getText()+"', '"
                      + nazwText2.getText()+ "');";
              ResultSet rs;
              statement.executeUpdate(queryString);
       }
       catch(Exception e){
           e.printStackTrace();
              }
refreshClients();

        clientWindowDodaj.dispose();
        clientWindow.setVisible(true);
        }
        else{
            blad2Text1.setVisible(true);
        }}
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel29MouseClicked

    private void imieText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imieText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imieText2ActionPerformed

    private void hasloText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasloText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasloText2ActionPerformed

    private void loginText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginText2ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void clientWindowWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_clientWindowWindowOpened
clientWindowDodaj.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_clientWindowWindowOpened

    private void dodajButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dodajButton1MouseClicked
clientWindowDodaj.setVisible(true);
blad2Text1.setVisible(false);
bladText1.setVisible(false);
clientWindow.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_dodajButton1MouseClicked

    private void nazwText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nazwText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nazwText2ActionPerformed

    private void clientWindowDodajWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_clientWindowDodajWindowClosed

        // TODO add your handling code here:
    }//GEN-LAST:event_clientWindowDodajWindowClosed

    private void clientWindowDodajWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_clientWindowDodajWindowClosing
      clientWindowDodaj.dispose();
        clientWindow.setVisible(true); 
     
      
        // TODO add your handling code here:
    }//GEN-LAST:event_clientWindowDodajWindowClosing

    private void usunLoginText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunLoginText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usunLoginText2ActionPerformed

    private void jPanel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel25MouseClicked

           
            try{
             statement = db.conn.createStatement();
              queryString = "SELECT COUNT(Pesel) FROM Clients WHERE Pesel = '"+usunLoginText2.getText()+"'";
              ResultSet rs;
              rs = db.statement.executeQuery(queryString);
              while(rs.next())
              loginIlosc=rs.getInt(1);
                System.out.println(loginIlosc);
       }
       catch(Exception e){
           e.printStackTrace();
              }
        if(loginIlosc==1){
         wyborWindowClient.setVisible(true);
         clientWindowUsun.setVisible(false);}
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel25MouseClicked

    private void jPanel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel25MouseEntered
jPanel25.setBackground(Color.getHSBColor(0, 0, (float) 0.98));       
           // TODO add your handling code here:
    }//GEN-LAST:event_jPanel25MouseEntered

    private void jPanel25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel25MouseExited
jPanel25.setBackground(Color.getHSBColor(0, 0, (float) 1));
           // TODO add your handling code here:
    }//GEN-LAST:event_jPanel25MouseExited

       private void jPanel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel27MouseClicked
try{
             statement = db.conn.createStatement();
              queryString = "DELETE FROM Clients WHERE Pesel='"
                      +usunLoginText2.getText()+ "';";
              ResultSet rs;
              statement.executeUpdate(queryString);
       }
       catch(Exception e){
           e.printStackTrace();
              }
refreshClients();
wyborWindowClient.dispose();

              // TODO add your handling code here:
       }//GEN-LAST:event_jPanel27MouseClicked

       private void jPanel27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel27MouseEntered
jPanel27.setBackground(Color.getHSBColor(0, 0, (float) 0.98));
              // TODO add your handling code here:
       }//GEN-LAST:event_jPanel27MouseEntered

       private void jPanel27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel27MouseExited
jPanel27.setBackground(Color.getHSBColor(0, 0, (float) 1));
              // TODO add your handling code here:
       }//GEN-LAST:event_jPanel27MouseExited

       private void jPanel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MouseClicked
clientWindowUsun.setVisible(true);
wyborWindowClient.setVisible(false);
              // TODO add your handling code here:
       }//GEN-LAST:event_jPanel28MouseClicked

       private void jPanel28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MouseEntered

jPanel28.setBackground(Color.getHSBColor(0, 0, (float) 0.98));              // TODO add your handling code here:
       }//GEN-LAST:event_jPanel28MouseEntered

       private void jPanel28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MouseExited
jPanel28.setBackground(Color.getHSBColor(0, 0, (float) 1));              // TODO add your handling code here:
       }//GEN-LAST:event_jPanel28MouseExited

       private void wyborWindowClientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wyborWindowClientMouseEntered

              // TODO add your handling code here:
       }//GEN-LAST:event_wyborWindowClientMouseEntered

       private void jPanel35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel35MouseExited
jPanel35.setBackground(Color.getHSBColor(0, 0, (float) 1));   
              // TODO add your handling code here:
       }//GEN-LAST:event_jPanel35MouseExited

       private void jPanel35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel35MouseEntered
jPanel35.setBackground(Color.getHSBColor(0, 0, (float) 0.98));   
              // TODO add your handling code here:
       }//GEN-LAST:event_jPanel35MouseEntered

       private void jPanel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel35MouseClicked
if(loginText3.getText().equals(foo) || hasloText3.getText().equals(foo)||imieText3.getText().equals(foo)){
         blad3Text1.setVisible(true);
}
else{

    try{
             statement = db.conn.createStatement();
              queryString = "UPDATE `Clients` SET `Name`='"
                      +loginText3.getText()+ "', `Lastname`='"
                      +hasloText3.getText()+ "', `Email`='"
                      +imieText3.getText()+"' WHERE  `Pesel`='"
                      +usunLoginText3.getText()+"';";
              ResultSet rs;
              statement.executeUpdate(queryString);
       }
       catch(Exception e){
           e.printStackTrace();
              }
refreshClients();
        updateWindowClient.dispose();
}
    

              // TODO add your handling code here:
       }//GEN-LAST:event_jPanel35MouseClicked

       private void imieText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imieText3ActionPerformed
              // TODO add your handling code here:
       }//GEN-LAST:event_imieText3ActionPerformed

       private void hasloText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasloText3ActionPerformed
              // TODO add your handling code here:
       }//GEN-LAST:event_hasloText3ActionPerformed

       private void loginText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginText3ActionPerformed
              // TODO add your handling code here:
       }//GEN-LAST:event_loginText3ActionPerformed

       private void usunLoginText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunLoginText3ActionPerformed
              // TODO add your handling code here:
       }//GEN-LAST:event_usunLoginText3ActionPerformed

       private void jPanel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MouseClicked
blad3Text1.setVisible(false);
              if(usunLoginText3.getText().equals(foo)){
        jLabel69.setVisible(true);
        }
else{
            
            try{
             statement = db.conn.createStatement();
              queryString = "SELECT COUNT(Pesel) FROM Clients WHERE Pesel = '"+usunLoginText3.getText()+"'";
              ResultSet rs;
              rs = db.statement.executeQuery(queryString);
              while(rs.next())
              loginIlosc=rs.getInt(1);
                System.out.println(loginIlosc);
       }
       catch(Exception e){
           e.printStackTrace();
              }
            if(loginIlosc!=0){
          updateWindowClient.setVisible(true);updateClient.setVisible(false); jLabel69.setVisible(false);  
        } 
            else{
                jLabel69.setVisible(true);
            }
        }
              // TODO add your handling code here:
       }//GEN-LAST:event_jPanel31MouseClicked

       private void jPanel31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MouseEntered
jPanel31.setBackground(Color.getHSBColor(0, 0, (float) 0.98));   
              // TODO add your handling code here:
       }//GEN-LAST:event_jPanel31MouseEntered

       private void jPanel31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MouseExited
jPanel31.setBackground(Color.getHSBColor(0, 0, (float) 1));   
              // TODO add your handling code here:
       }//GEN-LAST:event_jPanel31MouseExited

       private void dodajButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dodajButton1MouseEntered
dodajButton1.setBackground(Color.getHSBColor(0, 0, (float) 0.98));   
              // TODO add your handling code here:
       }//GEN-LAST:event_dodajButton1MouseEntered

       private void dodajButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dodajButton1MouseExited
dodajButton1.setBackground(Color.getHSBColor(0, 0, (float) 1));   
              // TODO add your handling code here:
       }//GEN-LAST:event_dodajButton1MouseExited

    private void dodajButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dodajButton2MouseClicked
        dodajProductWindow.setVisible(true);
        bladText2.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_dodajButton2MouseClicked

    private void dodajButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dodajButton2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_dodajButton2MouseEntered

    private void dodajButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dodajButton2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_dodajButton2MouseExited

    private void usunButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usunButton2MouseClicked
usunProductWindow.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_usunButton2MouseClicked

    private void usunButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usunButton2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_usunButton2MouseEntered

    private void usunButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usunButton2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_usunButton2MouseExited

    private void modyfikujButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modyfikujButton2MouseClicked
jLabel90.setVisible(false);
updateProductWindow.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_modyfikujButton2MouseClicked

    private void modyfikujButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modyfikujButton2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_modyfikujButton2MouseEntered

    private void modyfikujButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modyfikujButton2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_modyfikujButton2MouseExited

    private void produktyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produktyButtonMouseClicked
       productsWindow.setVisible(true);
       refreshProducts();
       // TODO add your handling code here:
    }//GEN-LAST:event_produktyButtonMouseClicked

    private void jPanel34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel34MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel34MouseExited

    private void jPanel34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel34MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel34MouseEntered

    private void jPanel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel34MouseClicked

        if(loginText4.getText().equals(foo) || hasloText4.getText().equals(foo)){
         bladText2.setVisible(true);
}
        else{
            
            try{
             statement = db.conn.createStatement();
              queryString = "INSERT INTO Products ( `Name`, `Price`) VALUES ('"
                      
                      + loginText4.getText()+"', '"
                      + hasloText4.getText()+"');";
                      
              ResultSet rs;
              statement.executeUpdate(queryString);
       }
       catch(Exception e){
           e.printStackTrace();
              }
refreshProducts();
dodajProductWindow.dispose();

        }
       

                       

        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel34MouseClicked

    private void hasloText4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasloText4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasloText4ActionPerformed

    private void loginText4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginText4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginText4ActionPerformed

    private void usunLoginText4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunLoginText4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usunLoginText4ActionPerformed

    private void jPanel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel37MouseClicked
            try{
             statement = db.conn.createStatement();
              queryString = "SELECT COUNT(Id_Product) FROM Products WHERE Id_Product = '"+usunLoginText4.getText()+"'";
              ResultSet rs;
              rs = db.statement.executeQuery(queryString);
              while(rs.next())
              loginIlosc=rs.getInt(1);
                System.out.println(loginIlosc);
       }
       catch(Exception e){
           e.printStackTrace();
              }
        if(loginIlosc==1){
            wyborProductWindow.setVisible(true);
            usunProductWindow.setVisible(false);
        }
                 // TODO add your handling code here:
    }//GEN-LAST:event_jPanel37MouseClicked

    private void jPanel37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel37MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel37MouseEntered

    private void jPanel37MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel37MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel37MouseExited

    private void jPanel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel39MouseClicked
try{
             statement = db.conn.createStatement();
              queryString = "DELETE FROM Products WHERE Id_Product='"
                      +usunLoginText4.getText()+ "';";
              ResultSet rs;
              statement.executeUpdate(queryString);
       }
       catch(Exception e){
           e.printStackTrace();
              }
refreshProducts();
wyborProductWindow.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel39MouseClicked

    private void jPanel39MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel39MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel39MouseEntered

    private void jPanel39MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel39MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel39MouseExited

    private void jPanel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel40MouseClicked
usunProductWindow.setVisible(true);
wyborProductWindow.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel40MouseClicked

    private void jPanel40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel40MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel40MouseEntered

    private void jPanel40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel40MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel40MouseExited

    private void usunLoginText5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunLoginText5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usunLoginText5ActionPerformed

    private void jPanel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel42MouseClicked

                        try{
              
              queryString = "SELECT Name from Products where Id_Product = '"+usunLoginText5.getText()+"';";
              ResultSet rs;
                rs = db.statement.executeQuery(queryString);
                while(rs.next())
               loginText5.setText(rs.getString(1));
                        
              
              }
       
       catch(Exception e){
           e.printStackTrace();
              }

        
        if(usunLoginText5.getText().equals(foo)){
        jLabel90.setVisible(true);
        }
else{
            
            try{
             statement = db.conn.createStatement();
              queryString = "SELECT COUNT(Id_Product) FROM Products WHERE Id_Product = '"+usunLoginText5.getText()+"'";
              ResultSet rs;
              rs = db.statement.executeQuery(queryString);
              while(rs.next())
              loginIlosc=rs.getInt(1);
                System.out.println(loginIlosc);
       }
       catch(Exception e){
           e.printStackTrace();
              }
            if(loginIlosc!=0){
          updateProduct.setVisible(true);updateProductWindow.setVisible(false);
          blad3Text2.setVisible(false);
        } 
            else{
                jLabel90.setVisible(true);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel42MouseClicked

    private void jPanel42MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel42MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel42MouseEntered

    private void jPanel42MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel42MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel42MouseExited

    private void loginText5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginText5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginText5ActionPerformed

    private void jPanel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel43MouseClicked

        
        
        if(loginText5.getText().equals(foo) || cenaSpinner.getValue().equals("0")){
         blad3Text2.setVisible(true);
}
else{

            
            
    try{
             statement = db.conn.createStatement();
              queryString = "UPDATE `Products` SET `Name`='"
                      +loginText5.getText()+ "', `Price`='"
                      +cenaSpinner.getValue()+ "' WHERE  `Id_Product`='"
                      +usunLoginText5.getText()+"';";
              ResultSet rs;
              statement.executeUpdate(queryString);
       }
       catch(Exception e){
           e.printStackTrace();
              }
refreshProducts();
        updateProduct.dispose();
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel43MouseClicked

    private void jPanel43MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel43MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel43MouseEntered

    private void jPanel43MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel43MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel43MouseExited

    private void dodajButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dodajButton3MouseClicked
bladText3.setVisible(false);
        dodajOrderWindow.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_dodajButton3MouseClicked

    private void dodajButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dodajButton3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_dodajButton3MouseEntered

    private void dodajButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dodajButton3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_dodajButton3MouseExited

    private void usunButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usunButton3MouseClicked
bladText4.setVisible(false);
usunOrder.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_usunButton3MouseClicked

    private void usunButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usunButton3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_usunButton3MouseEntered

    private void usunButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usunButton3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_usunButton3MouseExited

    private void modyfikujButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modyfikujButton3MouseClicked
IdUpdateOrder.setVisible(true);
jLabel132.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_modyfikujButton3MouseClicked

    private void modyfikujButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modyfikujButton3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_modyfikujButton3MouseEntered

    private void modyfikujButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modyfikujButton3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_modyfikujButton3MouseExited

    private void zamowieniaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zamowieniaButtonMouseClicked

        orderWindow.setVisible(true);
refreshOrders();

        // TODO add your handling code here:
    }//GEN-LAST:event_zamowieniaButtonMouseClicked

    private void loginText6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginText6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginText6ActionPerformed

    private void hasloText5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasloText5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasloText5ActionPerformed

    private void jPanel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel46MouseClicked
if(loginText6.getText().equals(foo) || hasloText5.getText().equals(foo)||ulicaText.getText().equals(foo)||domText.getText().equals(foo)||kodText.getText().equals(foo)||miejscowoscText.getText().equals(foo)|| kodText.getText().indexOf("-")==-1){
         bladText3.setVisible(true);
}
        else{
            try{
             statement = db.conn.createStatement();
              queryString = "SELECT COUNT(Id_Product) FROM Products WHERE Id_Product = '"+loginText6.getText()+"'";
              ResultSet rs;
              rs = db.statement.executeQuery(queryString);
              while(rs.next())
              loginIlosc=rs.getInt(1);
                System.out.println(loginIlosc);
       }
       catch(Exception e){
           e.printStackTrace();
              }
        if(loginIlosc>0){
            try{
             statement = db.conn.createStatement();
              queryString = "SELECT COUNT(Pesel) FROM Clients WHERE Pesel = '"+hasloText5.getText()+"'";
              ResultSet rs;
              rs = db.statement.executeQuery(queryString);
              while(rs.next())
              loginIlosc=rs.getInt(1);
                System.out.println(loginIlosc);
       }
       catch(Exception e){
           e.printStackTrace();
              }
            if(loginIlosc==0){
                czyNowyWindow.setVisible(true);
            }
            else{
                
                adress = ulicaText.getText()+" "+domText.getText()+", "+kodText.getText()+" "+miejscowoscText.getText();
               try{
             statement = db.conn.createStatement();
              queryString = "INSERT INTO Orders (`ID_User`, `ID_Product`, `ID_Client`, `Date`, `Adres`) VALUES ('"
                      + db.nazwaUser+"', '"
                      + loginText6.getText()+"', '"
                      + hasloText5.getText()+"', '"
                      + dataOrder.getValue().toString()+"', '"
                      + adress+ "');";
              ResultSet rs;
              statement.executeUpdate(queryString);
              refreshOrders();
              dodajOrderWindow.dispose();
       }
       catch(Exception e){
           e.printStackTrace();
              }
            }
        }
        else{
            bladText3.setVisible(true);
        }}
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel46MouseClicked

    private void jPanel46MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel46MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel46MouseEntered

    private void jPanel46MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel46MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel46MouseExited

    private void ulicaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulicaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ulicaTextActionPerformed

    private void domTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_domTextActionPerformed

    private void kodTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodTextActionPerformed

    private void miejscowoscTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miejscowoscTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miejscowoscTextActionPerformed

    private void jPanel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel48MouseClicked
clientWindowDodaj.setVisible(true);
blad2Text1.setVisible(false);
bladText1.setVisible(false);
czyNowyWindow.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel48MouseClicked

    private void jPanel48MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel48MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel48MouseEntered

    private void jPanel48MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel48MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel48MouseExited

    private void jPanel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel49MouseClicked
czyNowyWindow.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel49MouseClicked

    private void jPanel49MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel49MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel49MouseEntered

    private void jPanel49MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel49MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel49MouseExited

    private void usunLoginText6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunLoginText6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usunLoginText6ActionPerformed

    private void jPanel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel51MouseClicked
if(usunLoginText6.getText().equals(foo)){
    bladText4.setVisible(true);
}
else{      try{
             statement = db.conn.createStatement();
              queryString = "SELECT COUNT(ID_Order) FROM Orders WHERE ID_Order = '"+usunLoginText6.getText()+"'";
              ResultSet rs;
              rs = db.statement.executeQuery(queryString);
              while(rs.next())
              loginIlosc=rs.getInt(1);
                System.out.println(loginIlosc);
       }
       catch(Exception e){
           e.printStackTrace();
              }
if(loginIlosc>0){
    wyborUsunOrder.setVisible(true);
}
else{
    bladText4.setVisible(true);
}
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel51MouseClicked

    private void jPanel51MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel51MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel51MouseEntered

    private void jPanel51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel51MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel51MouseExited

    private void jPanel53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel53MouseClicked
try{
             statement = db.conn.createStatement();
              queryString = "DELETE FROM Orders WHERE ID_Order='"
                      +usunLoginText6.getText()+ "';";
              ResultSet rs;
              statement.executeUpdate(queryString);
       }
       catch(Exception e){
           e.printStackTrace();
              }
wyborUsunOrder.dispose();
usunOrder.dispose();
refreshOrders();
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel53MouseClicked

    private void jPanel53MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel53MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel53MouseEntered

    private void jPanel53MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel53MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel53MouseExited

    private void jPanel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel54MouseClicked
wyborUsunOrder.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel54MouseClicked

    private void jPanel54MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel54MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel54MouseEntered

    private void jPanel54MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel54MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel54MouseExited

    private void loginText7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginText7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginText7ActionPerformed

    private void hasloText6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasloText6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasloText6ActionPerformed

    private void jPanel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel56MouseClicked

if(loginText7.getText().equals(foo) || hasloText6.getText().equals(foo)||ulicaText1.getText().equals(foo) || domText1.getText().equals(foo)||kodText1.getText().equals(foo)||miejscowoscText1.getText().equals(foo) || kodText1.getText().indexOf("-")==-1){
         bladText5.setVisible(true);
}
else{
adress = ulicaText1.getText()+" "+domText1.getText()+", "+kodText1.getText()+" "+miejscowoscText1.getText();
    try{
             statement = db.conn.createStatement();
              queryString = "UPDATE `Orders` SET `ID_Product`='"
                      +loginText7.getText()+ "', `ID_Client`='"
                      +hasloText6.getText()+ "', `Adres`='"
                      +adress+"' WHERE  `ID_Order`='"
                      +usunLoginText7.getText()+"';";
              ResultSet rs;
              statement.executeUpdate(queryString);
       }
       catch(Exception e){
           e.printStackTrace();
              }
refreshOrders();
        updateOrder.dispose();
}

        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel56MouseClicked

    private void jPanel56MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel56MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel56MouseEntered

    private void jPanel56MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel56MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel56MouseExited

    private void ulicaText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulicaText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ulicaText1ActionPerformed

    private void domText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_domText1ActionPerformed

    private void kodText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodText1ActionPerformed

    private void miejscowoscText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miejscowoscText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miejscowoscText1ActionPerformed

    private void usunLoginText7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunLoginText7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usunLoginText7ActionPerformed

    private void jPanel58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel58MouseClicked

        if(usunLoginText7.getText().equals(foo)){
    jLabel132.setVisible(true);
}
else{      try{
             statement = db.conn.createStatement();
              queryString = "SELECT COUNT(ID_Order) FROM Orders WHERE ID_Order = '"+usunLoginText7.getText()+"'";
              ResultSet rs;
              rs = db.statement.executeQuery(queryString);
              while(rs.next())
              loginIlosc=rs.getInt(1);
                System.out.println(loginIlosc);
       }
       catch(Exception e){
           e.printStackTrace();
              }
if(loginIlosc>0){
    
    try{
              
              queryString = "SELECT ID_Product, ID_Client from Orders where ID_Order = '"+usunLoginText7.getText()+"';";
              ResultSet rs;
                rs = db.statement.executeQuery(queryString);
                while(rs.next()){
               loginText7.setText(rs.getString(1));
                   hasloText6.setText(rs.getString(2));     
                }
              }
       
       catch(Exception e){
           e.printStackTrace();
              }
    
    updateOrder.setVisible(true);
    IdUpdateOrder.setVisible(false);
    bladText5.setVisible(false);
}
else{
    jLabel132.setVisible(true);
}}
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel58MouseClicked

    private void jPanel58MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel58MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel58MouseEntered

    private void jPanel58MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel58MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel58MouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
welcomeWindow.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jPanel60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel60MouseClicked
 try{
             statement = db.conn.createStatement();
              queryString = "SELECT Private FROM Users WHERE Login='joanna'";
              ResultSet rs;
              rs = db.statement.executeQuery(queryString);
              while(rs.next())
              loginIlosc=rs.getInt(1);
                System.out.println(loginIlosc);
       }
       catch(Exception e){
           e.printStackTrace();
              }
if(loginIlosc==0){
welcomeWindow.dispose();
}
if(loginIlosc==1){
usersButton.setVisible(false);
dodajButton2.setVisible(false);
usunButton2.setVisible(false);
modyfikujButton2.setVisible(false);
welcomeWindow.dispose();
}
if(loginIlosc==2){
usersButton.setVisible(false);
dodajButton1.setVisible(false);
        usunButton1.setVisible(false);
        modyfikujButton1.setVisible(false);
        dodajButton2.setVisible(false);
                usunButton2.setVisible(false);
                modyfikujButton2.setVisible(false);
        dodajButton3.setVisible(false);
                usunButton3.setVisible(false);
                modyfikujButton3.setVisible(false);
welcomeWindow.dispose();
}
if(loginIlosc==3){
usersButton.setVisible(false);
    
    
welcomeWindow.dispose();
}
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel60MouseClicked

    private void welcomeWindowWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_welcomeWindowWindowOpened
try{
              
              queryString = "SELECT Name, Lastname FROM Users WHERE Login='joanna'";
              ResultSet rs;
                rs = db.statement.executeQuery(queryString);
                while(rs.next()){
               jTextField1.setText(rs.getString(1));
                   jTextField2.setText(rs.getString(2));     
                }
              }
       
       catch(Exception e){
           e.printStackTrace();
              }
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_welcomeWindowWindowOpened

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jPanel60MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel60MouseEntered
jPanel60.setBackground(Color.getHSBColor(0, 0, (float) 0.98));
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel60MouseEntered

    private void jPanel60MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel60MouseExited
jPanel60.setBackground(Color.getHSBColor(0, 0, (float) 1));
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel60MouseExited
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog IdUpdateOrder;
    private javax.swing.JLabel blad2Text;
    private javax.swing.JLabel blad2Text1;
    private javax.swing.JLabel blad3Text;
    private javax.swing.JLabel blad3Text1;
    private javax.swing.JLabel blad3Text2;
    private javax.swing.JLabel blad3Text3;
    private javax.swing.JLabel bladText;
    private javax.swing.JLabel bladText1;
    private javax.swing.JLabel bladText2;
    private javax.swing.JLabel bladText3;
    private javax.swing.JLabel bladText4;
    private javax.swing.JLabel bladText5;
    private javax.swing.JSpinner cenaSpinner;
    private javax.swing.JDialog clientWindow;
    private javax.swing.JDialog clientWindowDodaj;
    private javax.swing.JDialog clientWindowUsun;
    private javax.swing.JDialog czyNowyWindow;
    private javax.swing.JSpinner dataOrder;
    private javax.swing.JPanel dodajButton;
    private javax.swing.JPanel dodajButton1;
    private javax.swing.JPanel dodajButton2;
    private javax.swing.JPanel dodajButton3;
    private javax.swing.JDialog dodajOrderWindow;
    private javax.swing.JDialog dodajProductWindow;
    private javax.swing.JDialog dodajWindow;
    private javax.swing.JTextField domText;
    private javax.swing.JTextField domText1;
    private javax.swing.JTextField hasloText;
    private javax.swing.JTextField hasloText1;
    private javax.swing.JTextField hasloText2;
    private javax.swing.JTextField hasloText3;
    private javax.swing.JTextField hasloText4;
    private javax.swing.JTextField hasloText5;
    private javax.swing.JTextField hasloText6;
    private javax.swing.JTextField imieText;
    private javax.swing.JTextField imieText1;
    private javax.swing.JTextField imieText2;
    private javax.swing.JTextField imieText3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator43;
    private javax.swing.JSeparator jSeparator44;
    private javax.swing.JSeparator jSeparator45;
    private javax.swing.JSeparator jSeparator46;
    private javax.swing.JSeparator jSeparator47;
    private javax.swing.JSeparator jSeparator48;
    private javax.swing.JSeparator jSeparator49;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator50;
    private javax.swing.JSeparator jSeparator51;
    private javax.swing.JSeparator jSeparator52;
    private javax.swing.JSeparator jSeparator53;
    private javax.swing.JSeparator jSeparator54;
    private javax.swing.JSeparator jSeparator55;
    private javax.swing.JSeparator jSeparator56;
    private javax.swing.JSeparator jSeparator57;
    private javax.swing.JSeparator jSeparator58;
    private javax.swing.JSeparator jSeparator59;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator60;
    private javax.swing.JSeparator jSeparator61;
    private javax.swing.JSeparator jSeparator62;
    private javax.swing.JSeparator jSeparator63;
    private javax.swing.JSeparator jSeparator64;
    private javax.swing.JSeparator jSeparator65;
    private javax.swing.JSeparator jSeparator66;
    private javax.swing.JSeparator jSeparator67;
    private javax.swing.JSeparator jSeparator68;
    private javax.swing.JSeparator jSeparator69;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator70;
    private javax.swing.JSeparator jSeparator71;
    private javax.swing.JSeparator jSeparator72;
    private javax.swing.JSeparator jSeparator73;
    private javax.swing.JSeparator jSeparator74;
    private javax.swing.JSeparator jSeparator75;
    private javax.swing.JSeparator jSeparator76;
    private javax.swing.JSeparator jSeparator77;
    private javax.swing.JSeparator jSeparator78;
    private javax.swing.JSeparator jSeparator79;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator80;
    private javax.swing.JSeparator jSeparator81;
    private javax.swing.JSeparator jSeparator82;
    private javax.swing.JSeparator jSeparator83;
    private javax.swing.JSeparator jSeparator84;
    private javax.swing.JSeparator jSeparator85;
    private javax.swing.JSeparator jSeparator86;
    private javax.swing.JSeparator jSeparator87;
    private javax.swing.JSeparator jSeparator88;
    private javax.swing.JSeparator jSeparator89;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSeparator jSeparator90;
    private javax.swing.JSeparator jSeparator91;
    private javax.swing.JSeparator jSeparator92;
    private javax.swing.JSeparator jSeparator93;
    private javax.swing.JSeparator jSeparator94;
    private javax.swing.JSeparator jSeparator95;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel klienciButton;
    private javax.swing.JTextField kodText;
    private javax.swing.JTextField kodText1;
    private javax.swing.JTextField loginText;
    private javax.swing.JTextField loginText1;
    private javax.swing.JTextField loginText2;
    private javax.swing.JTextField loginText3;
    private javax.swing.JTextField loginText4;
    private javax.swing.JTextField loginText5;
    private javax.swing.JTextField loginText6;
    private javax.swing.JTextField loginText7;
    private javax.swing.JTextField miejscowoscText;
    private javax.swing.JTextField miejscowoscText1;
    private javax.swing.JPanel modyfikujButton;
    private javax.swing.JPanel modyfikujButton1;
    private javax.swing.JPanel modyfikujButton2;
    private javax.swing.JPanel modyfikujButton3;
    private javax.swing.JTextField nazwText;
    private javax.swing.JTextField nazwText1;
    private javax.swing.JTextField nazwText2;
    private javax.swing.JDialog orderWindow;
    private javax.swing.JTable productsTable;
    private javax.swing.JDialog productsWindow;
    private javax.swing.JPanel produktyButton;
    private javax.swing.JPanel rozliczeniaButton;
    private javax.swing.JTextField ulicaText;
    private javax.swing.JTextField ulicaText1;
    private javax.swing.JDialog updateClient;
    private javax.swing.JDialog updateOrder;
    private javax.swing.JDialog updateProduct;
    private javax.swing.JDialog updateProductWindow;
    private javax.swing.JDialog updateUser;
    private javax.swing.JDialog updateWindow;
    private javax.swing.JDialog updateWindowClient;
    private javax.swing.JPanel updateWindowsClient;
    private javax.swing.JPanel updateWindowsClient1;
    private javax.swing.JTable userTable;
    private javax.swing.JTable userTable1;
    private javax.swing.JTable userTable2;
    private javax.swing.JPanel usersButton;
    private javax.swing.JDialog usersWindow;
    private javax.swing.JPanel usunButton;
    private javax.swing.JPanel usunButton1;
    private javax.swing.JPanel usunButton2;
    private javax.swing.JPanel usunButton3;
    private javax.swing.JTextField usunLoginText;
    private javax.swing.JTextField usunLoginText1;
    private javax.swing.JTextField usunLoginText2;
    private javax.swing.JTextField usunLoginText3;
    private javax.swing.JTextField usunLoginText4;
    private javax.swing.JTextField usunLoginText5;
    private javax.swing.JTextField usunLoginText6;
    private javax.swing.JTextField usunLoginText7;
    private javax.swing.JDialog usunOrder;
    private javax.swing.JDialog usunProductWindow;
    private javax.swing.JDialog usunWindow;
    private javax.swing.JDialog welcomeWindow;
    private javax.swing.JDialog wyborProductWindow;
    private javax.swing.JDialog wyborUsunOrder;
    private javax.swing.JDialog wyborWindow;
    private javax.swing.JDialog wyborWindowClient;
    private javax.swing.JPanel zamowieniaButton;
    // End of variables declaration//GEN-END:variables
}
