package GUI;
import PROJECTS.Project;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


//图形界面
public class Ui {
    JFrame jf = new JFrame();

    public void showUI(){
        jf.setSize(380,600);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setTitle("Code Visuable");

        FlowLayout flow = new FlowLayout();
        jf.setLayout(flow);
        jf.setVisible(true);
    }

}
