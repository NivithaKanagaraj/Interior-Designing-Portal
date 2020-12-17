import javafx.scene.control.PasswordField;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Fri Apr 17 20:38:51 IST 2020
 */



/**
 * @author nivitha
 */
public class Designer_Login extends JFrame {

    public Designer_Login() {
        initComponents();
        this.setVisible(true);
        getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","nivi07");
            Statement smt = con.createStatement();
            String userid= textField1.getText();
            String passwrd= passwordField1.getText();
            PreparedStatement pst = con.prepareStatement("select * from admin where a_name = ?");
            pst.setString(1,userid);
            ResultSet rs= pst.executeQuery();
            if(rs.next()){
                if(rs.getString("a_name").equals(userid) && rs.getString("a_password").equals(passwrd))
                {
                    JOptionPane.showMessageDialog(null,"Login Successful");
                    this.setVisible(false);
                    new MENU1().setVisible(true);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Check");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Check Credentials");
            }
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }


    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        MAIN m4= new MAIN();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - nivitha
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        button2 = new JButton();
        passwordField1 = new JPasswordField();
        button1 = new JButton();

        //======== this ========
        setTitle("Admin Login");
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(204, 255, 204));
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing
            .border.EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder
            .CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.
            awt.Font.BOLD,12),java.awt.Color.red),panel1. getBorder()))
            ;panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
            ){if("\u0062ord\u0065r".equals(e.getPropertyName()))throw new RuntimeException();}})
            ;

            //---- label1 ----
            label1.setText("USER ID:");
            label1.setFont(new Font("Arial", Font.BOLD, 14));

            //---- label2 ----
            label2.setText("PASSWORD:");
            label2.setFont(new Font("Arial", Font.BOLD, 14));

            //---- button2 ----
            button2.setText("Login");
            button2.setFont(new Font("Arial", Font.BOLD, 14));
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(label1)
                            .addComponent(label2))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(passwordField1, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                        .addGap(23, 23, 23))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(button2)
                        .addContainerGap(119, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1))
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(label2))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button2)
                        .addContainerGap())
            );
        }

        //---- button1 ----
        button1.setText("Back");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
                button1MouseClicked(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(146, 146, 146)
                            .addComponent(button1)))
                    .addContainerGap(37, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(59, Short.MAX_VALUE)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(button1)
                    .addGap(35, 35, 35))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - nivitha
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JButton button2;
    private JPasswordField passwordField1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
