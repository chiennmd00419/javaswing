/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicArrowButton;

/**
 *
 * @author chien
 */
public class JavaSwing {

    public static void main(String[] args) {
        JFrame fromLogin = new JFrame("Hello");
        fromLogin.setSize(700, 400);
        fromLogin.setLocationRelativeTo(null);

        JPanel loginPanel = new JPanel();
        //  loginPanel.setSize(400, 300);
        loginPanel.setBackground(Color.BLACK);
        loginPanel.setLayout(null);
        loginPanel.setBounds(100, 30, 400, 200);

        JLabel lblAccount = new JLabel("Account : ");
        lblAccount.setBounds(100, 100, 100, 40);
        JLabel lblPassWord = new JLabel("Pass : ");
        lblPassWord.setBounds(100, 145, 100, 40);

        JTextField txtAccount = new JTextField();
        txtAccount.setBounds(205, 100, 150, 40);
        JPasswordField txtPassWord = new JPasswordField();
        txtPassWord.setBounds(205, 145, 150, 40);
//
//        JButton btnLogin = new JButton();
//        btnLogin.setText("login");
//        btnLogin.setBounds(205, 200, 150, 40);

        loginPanel.add(lblAccount);
        loginPanel.add(lblPassWord);
       loginPanel.add(txtAccount);
        loginPanel.add(txtPassWord);
//        loginPanel.add(btnLogin);

        fromLogin.add(loginPanel);

        fromLogin.setLayout(null);
        fromLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fromLogin.setVisible(true);
    }

}
