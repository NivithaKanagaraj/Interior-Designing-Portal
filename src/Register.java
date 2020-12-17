import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.regex.Pattern;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Tue Apr 14 19:30:01 IST 2020
 */



/**
 * @author nivitha
 */
public class Register extends JFrame {
    public Register() {
        initComponents();
        this.setVisible(true);
        getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    private void button1MouseClicked(MouseEvent e) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:orcl","system","nivi07");
            Statement smt = con.createStatement();
            String name = textField1.getText();
            String userid = textField2.getText();
            String pass = String.valueOf(passwordField1.getPassword());
            String age = spinner1.getValue() + "";
            String addr= textField6.getText();
            String email= textField7.getText();
            String pno = textField8.getText();
            String g = null;
            if(radioButton1.isSelected())
            {
                g = "M";
            }
            else if(radioButton2.isSelected())
            {
                g = "F";
            }
            else if(radioButton3.isSelected()) {
                g = "T";
            }
            String insert_query = "insert into customer (name,id,Password,age,gender,address,Email_id,Phone_no) values (? ,? ,? ,?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(insert_query);
            pst.setString(1,name);
            pst.setString(2,userid);
            pst.setString(3,pass);
            pst.setString(4,age);
            pst.setString(5,g);
            pst.setString(6,addr);
            pst.setString(7,email);
            pst.setString(8,pno);
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null,"Thank you for registering with us");
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        Login k2=new Login();
        k2.setVisible(true);
        this.dispose();

    }

    private void textField1FocusLost(FocusEvent e) {
        // TODO add your code here
        try {
            String n = textField1.getText();
            for (int i = 0; i < n.length(); i++) {
                char ch = n.charAt(i);
                if ((!(ch >= 'A' && ch <= 'Z'))
                        && (!(ch >= 'a' && ch <= 'z'))) {
                    textField1.setText("");
                    throw new Exception("Enter a Valid Name");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Enter a Valid Name");
        }
    }

    private void passwordField1FocusLost(FocusEvent e) {
        // TODO add your code here
        String p = String.valueOf(passwordField1.getPassword());
        try {
            if(p.length() < 8){
                passwordField1.setText("");
                throw new Exception("Invalid Password");
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Invalid Password");
        }
    }

    private void textField8FocusLost(FocusEvent e) {
        // TODO add your code here
        String x = textField8.getText();

        try {
            for (int i = 0; i < x.length(); i++) {
                if (!(Character.isDigit(x.charAt(i))) || (x.length() < 10 || x.length() > 10)) {
                    textField8.setText("");
                    throw new Exception("Contact must be of 10 digits and contain only numbers");
                }
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Contact must be of 10 digits and contain only numbers");
        }
    }

    private void button1FocusLost(FocusEvent e) {
        // TODO add your code here
        try{
            if((!radioButton1.isSelected() && !radioButton2.isSelected() && !radioButton3.isSelected()) || (textField1.getText().length()==0) || (textField6.getText().length()==0) || (textField2.getText().length()==0) ){
                throw new Exception("Please enter the all the details");
            }}
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Please enter the all the details");
        }
    }

    private void textField7FocusLost(FocusEvent e) {
        // TODO add your code here
        String x = textField7.getText();
        try{
            if(x.length() == 0){
                throw new Exception("Please enter a valid Email-ID");
            }
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}$";

            Pattern pat = Pattern.compile(emailRegex);
            boolean b= pat.matcher(x).matches();
            if(!b){
                throw new Exception("Please enter a valid Email-ID");
            }

        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Please enter a valid Email-ID");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - nivitha
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField6 = new JTextField();
        textField7 = new JTextField();
        textField8 = new JTextField();
        spinner1 = new JSpinner();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        radioButton3 = new JRadioButton();
        passwordField1 = new JPasswordField();
        button1 = new JButton();
        button2 = new JButton();
        textPane1 = new JTextPane();
        label9 = new JLabel();

        //======== this ========
        setBackground(new Color(153, 153, 153));
        setTitle("Registeration Form");
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Name:");
        label1.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label2 ----
        label2.setText("User Id:");
        label2.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label3 ----
        label3.setText("Password:");
        label3.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label4 ----
        label4.setText("Age:");
        label4.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label5 ----
        label5.setText("Gender:");
        label5.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label6 ----
        label6.setText("Address:");
        label6.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label7 ----
        label7.setText("Email Id:");
        label7.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label8 ----
        label8.setText("Phone Number:");
        label8.setFont(new Font("Arial", Font.BOLD, 14));

        //---- textField1 ----
        textField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                textField1FocusLost(e);
            }
        });

        //---- textField7 ----
        textField7.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                textField7FocusLost(e);
            }
        });

        //---- textField8 ----
        textField8.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                textField8FocusLost(e);
            }
        });

        //---- spinner1 ----
        spinner1.setModel(new SpinnerNumberModel(18, 18, 80, 1));

        //---- radioButton1 ----
        radioButton1.setText("Male");
        radioButton1.setBackground(new Color(204, 204, 204));
        radioButton1.setFont(new Font("Arial", Font.BOLD, 14));

        //---- radioButton2 ----
        radioButton2.setText("Female");
        radioButton2.setBackground(new Color(204, 204, 204));
        radioButton2.setFont(new Font("Arial", Font.BOLD, 14));

        //---- radioButton3 ----
        radioButton3.setText("Other");
        radioButton3.setFont(new Font("Arial", Font.BOLD, 14));
        radioButton3.setBackground(new Color(204, 204, 204));

        //---- passwordField1 ----
        passwordField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                passwordField1FocusLost(e);
            }
        });

        //---- button1 ----
        button1.setText("Register");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        button1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                button1FocusLost(e);
            }
        });

        //---- button2 ----
        button2.setText("Login");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });

        //---- label9 ----
        label9.setText("REGISTRATION FORM");
        label9.setFont(new Font("Arial", Font.BOLD, 16));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(label1, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label2)
                                .addComponent(label3, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addComponent(label6, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addComponent(label5, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(label8, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label9, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField6, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(radioButton1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(radioButton2, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                                    .addComponent(textField2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(textField1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(passwordField1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                                .addComponent(spinner1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                            .addGap(42, 42, 42)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(textPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(radioButton3, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)))
                        .addComponent(textField8, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(button1)
                                .addGap(46, 46, 46)
                                .addComponent(button2))
                            .addComponent(textField7, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)))
                    .addGap(15, 15, 15))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(label9, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label2)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                                .addComponent(spinner1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(radioButton1)
                                .addComponent(radioButton2)
                                .addComponent(radioButton3)
                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(textField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label8))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(button1)
                                .addComponent(button2)))
                        .addComponent(textPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(16, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - nivitha
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JSpinner spinner1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JPasswordField passwordField1;
    private JButton button1;
    private JButton button2;
    private JTextPane textPane1;
    private JLabel label9;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
