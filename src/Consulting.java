import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Sat Apr 18 11:17:45 IST 2020
 */



/**
 * @author nivitha
 */
public class Consulting extends JFrame {
    String uname;
    public Consulting(String a) {
        initComponents();
        uname=a;
        getData();
        //this.setVisible(true);
        getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:orcl","system","nivi07");
            Statement smt = con.createStatement();
            String name = textField1.getText();
            String pno=textField2.getText();
            String addr= textField3.getText();
            String email= textField4.getText();
            String t = comboBox1.getSelectedItem() + "";
            java.util.Date date = new java.util.Date();
            long x = date.getTime();
            String insert_quer = "insert into book (bname,bno,baddress,bmail,btype,bdate) values (? ,? ,? ,?, ?,?)";
            PreparedStatement pst = con.prepareStatement(insert_quer);
            pst.setString(1,name);
            pst.setString(2,pno);
            pst.setString(3,addr);
            pst.setString(4,email);
            pst.setString(5,t);
            pst.setDate(6,new java.sql.Date(x));
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null,"Thank you for Booking");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private void button2MouseClicked(MouseEvent e) {
        MENU b3= new MENU(uname);
        this.dispose();
        b3.setVisible(true);
    }
private void getData(){
        String insert_qry= "select * from customer where id=?";
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","nivi07");
        PreparedStatement ps = null;
        ps = conn.prepareStatement(insert_qry);
        ps.setString(1,uname);
        ResultSet rs = ps.executeQuery();
       // comboBox1.removeAllItems();
        while (rs.next()) {
          //  comboBox1.addItem(rs.getString(1));
            //i++;
            textField1.setText(rs.getString("name"));
            textField2.setText(rs.getString("phone_no"));
            textField3.setText(rs.getString("address"));
            textField4.setText(rs.getString("email_id"));
        }
        //if (i == 0) {
          //  JOptionPane.showMessageDialog(null ," this table doesn't exist");
        //}
        conn.close();
        rs.close();
    } catch (Exception x) {
        JOptionPane.showMessageDialog(null, x);
    }
}
    private void textField1FocusGained(FocusEvent e) {
        // TODO add your code here
        String qry = "select dtype from design";
        int i=0;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","nivi07");
            PreparedStatement ps = null;
            ps = conn.prepareStatement(qry);
            ResultSet rs = ps.executeQuery();
            comboBox1.removeAllItems();
            while (rs.next()) {
                comboBox1.addItem(rs.getString(1));
                i++;
            }
            if (i == 0) {
                JOptionPane.showMessageDialog(null ," this table doesn't exist");
            }
            conn.close();
            rs.close();
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, x);
        }
    }

    private void textField2FocusLost(FocusEvent e) {
        // TODO add your code here
        String x = textField2.getText();

        try {
            for (int i = 0; i < x.length(); i++) {
                if (!(Character.isDigit(x.charAt(i))) || (x.length() < 10 || x.length() > 10)) {
                    textField2.setText("");
                    throw new Exception("Phone number must be of 10 digits and contain only numbers");
                }
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Phone number must be of 10 digits and contain only numbers");
        }
    }

    private void textField4FocusLost(FocusEvent e) {
        // TODO add your code here
        String x = textField4.getText();
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

    private void button1FocusLost(FocusEvent e) {
        // TODO add your code here
        try{
            if((textField1.getText().length()==0) || (textField2.getText().length()==0) || (textField3.getText().length()==0) || (textField4.getText().length()==0)) {
                throw new Exception("Please enter all the Details");
            }}
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Please enter all the Details");
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
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        comboBox1 = new JComboBox<>();

        //======== this ========
        setTitle("Booking");
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Please fill the details below");
        label1.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label2 ----
        label2.setText("Name:");
        label2.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label3 ----
        label3.setText("Phone Number:");
        label3.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label4 ----
        label4.setText("Address:");
        label4.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label5 ----
        label5.setText("Design Type:");
        label5.setFont(new Font("Arial", Font.BOLD, 14));

        //---- label6 ----
        label6.setText("Email:");
        label6.setFont(new Font("Arial", Font.BOLD, 14));

        //---- textField1 ----
        textField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                textField1FocusGained(e);
            }
        });

        //---- textField2 ----
        textField2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                textField2FocusLost(e);
            }
        });

        //---- textField4 ----
        textField4.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                textField4FocusLost(e);
            }
        });

        //---- button1 ----
        button1.setText("Book");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
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
        button2.setText("Back");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
                button2MouseClicked(e);
            }
        });

        //---- comboBox1 ----
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
            "Nautical",
            "Minimalist",
            "Traditional"
        }));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(132, 132, 132)
                            .addComponent(label1))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(button1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button2))
                            .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                    .addComponent(label4)
                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label5))
                                .addGroup(contentPaneLayout.createParallelGroup()
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))))))
                    .addContainerGap(123, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(label1)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label4)
                        .addComponent(textField3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label6)
                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1)
                        .addComponent(button2))
                    .addGap(19, 19, 19))
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
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton button1;
    private JButton button2;
    private JComboBox<String> comboBox1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
