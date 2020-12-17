import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Tue Apr 14 19:27:59 IST 2020
 */



/**
 * @author nivitha
 */
public class Login extends JFrame {
    public Login() {
            initComponents();
            this.setVisible(true);
            getContentPane().setBackground(Color.LIGHT_GRAY);

    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","nivi07");
            Statement smt = con.createStatement();
            String userid= textField1.getText();
            String passwrd= String.valueOf(passwordField1.getPassword());
            PreparedStatement pst = con.prepareStatement("select * from customer where id = ?");
            pst.setString(1,userid);
            ResultSet rs= pst.executeQuery();
            if(rs.next()){
                if(rs.getString("id").equals(userid) && rs.getString("Password").equals(passwrd))
                {
                    JOptionPane.showMessageDialog(null,"Login Successful");
                    this.setVisible(false);
                    MENU M=new MENU(userid);
                    M.setVisible(true);

                   // new MENU().setVisible(true);
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

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
            Register m1= new Register();
            this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - nivitha
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        passwordField1 = new JPasswordField();
        label3 = new JLabel();
        button2 = new JButton();

        //======== this ========
        setIconImage(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\wp2406785.jpg").getImage());
        setTitle(" Login Page");
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(204, 255, 255));
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new
            javax.swing.border.EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax
            .swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java
            .awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt
            .Color.red),panel1. getBorder()));panel1. addPropertyChangeListener(new java.beans.
            PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".
            equals(e.getPropertyName()))throw new RuntimeException();}});

            //---- label1 ----
            label1.setText("USER NAME:");
            label1.setFont(new Font("Arial", Font.BOLD, 14));

            //---- label2 ----
            label2.setText("PASSWORD:");
            label2.setFont(new Font("Arial", Font.BOLD, 14));

            //---- button1 ----
            button1.setText("LOGIN");
            button1.setFont(new Font("Arial", Font.BOLD, 12));
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                    .addComponent(passwordField1)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(button1)))
                        .addContainerGap(33, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1)
                        .addContainerGap())
            );
        }

        //---- label3 ----
        label3.setText("Do not have an account?");
        label3.setFont(new Font("Arial", Font.BOLD, 14));

        //---- button2 ----
        button2.setText("REGISTER");
        button2.setFont(new Font("Arial", Font.BOLD, 12));
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(button2)))
                    .addContainerGap(77, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2))
                    .addContainerGap(13, Short.MAX_VALUE))
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
    private JButton button1;
    private JPasswordField passwordField1;
    private JLabel label3;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
