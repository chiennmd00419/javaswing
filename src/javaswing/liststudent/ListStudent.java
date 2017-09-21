/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing.liststudent;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author chien
 */
public class ListStudent {

    public static void main(String[] args) {
        JFrame frameStudent = new JFrame();
        frameStudent.setSize(700, 500);
        frameStudent.setLocationRelativeTo(null);

        JPanel studentPanel = new JPanel();
        studentPanel.setLayout(null);
        studentPanel.setBackground(Color.lightGray);
        studentPanel.setBounds(100, 80, 500, 300);

        JLabel lblId = new JLabel("ID : ");
        lblId.setBounds(50, 70, 100, 30);
        JLabel lblName = new JLabel("Name : ");
        lblName.setBounds(50, 105, 100, 30);
        JLabel lblEmail = new JLabel("Email : ");
        lblEmail.setBounds(50, 140, 100, 30);
        JLabel lblPhone = new JLabel("Phone : ");
        lblPhone.setBounds(50, 175, 100, 30);
        JLabel lblRollNumber = new JLabel("Roll Number : ");
        lblRollNumber.setBounds(50, 205, 100, 30);
        JLabel lblClassName = new JLabel("ClassName : ");
        lblClassName.setBounds(50, 240, 100, 30);

        JTextField txtId = new JTextField();
        txtId.setText("id");
        txtId.setBounds(170, 70, 150, 30);
        JTextField txtName = new JTextField();
        txtName.setText("name");
        txtName.setBounds(170, 105, 150, 30);
        JTextField txtEmail = new JTextField();
        txtEmail.setText("email");
        txtEmail.setBounds(170, 140, 150, 30);
        JTextField txtPhone = new JTextField();
        txtPhone.setText("phone");
        txtPhone.setBounds(170, 175, 150, 30);
        JTextField txtRollNumber = new JTextField();
        txtRollNumber.setText("rollnumber");
        txtRollNumber.setBounds(170, 205, 150, 30);
        JTextField txtClassNumber = new JTextField();
        txtClassNumber.setText("classnumber");
        txtClassNumber.setBounds(170, 240, 150, 30);

        JButton btnSummit = new JButton();
        btnSummit.setText("sumit");
        btnSummit.setBounds(250, 400, 80, 20);

        JButton btnBack = new JButton();
        btnBack.setText("back");
        btnBack.setBounds(350, 400, 80, 20);

        studentPanel.add(lblId);
        studentPanel.add(lblName);
        studentPanel.add(lblEmail);
        studentPanel.add(lblPhone);
        studentPanel.add(lblRollNumber);
        studentPanel.add(lblClassName);

        studentPanel.add(txtId);
        studentPanel.add(txtName);
        studentPanel.add(txtEmail);
        studentPanel.add(txtPhone);
        studentPanel.add(txtRollNumber);
        studentPanel.add(txtClassNumber);

        frameStudent.add(studentPanel);
        frameStudent.add(btnBack);
        frameStudent.add(btnSummit);
        frameStudent.setLayout(null);
        frameStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameStudent.setVisible(true);

    }

}
