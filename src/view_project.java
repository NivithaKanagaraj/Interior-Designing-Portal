import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Fri Apr 17 23:00:25 IST 2020
 */



/**
 * @author nivitha
 */
public class view_project extends JFrame {
    public view_project() {
        this.setVisible(true);
        initComponents();
        getContentPane().setBackground(Color.LIGHT_GRAY);
        try {
            DefaultTableModel dm = (DefaultTableModel) table1.getModel();
            int rowCount = dm.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                dm.removeRow(i);
            }
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "nivi07");
            //Statement stmt = con.createStatement();
            String query = "select * from customer";
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                DefaultTableModel model = (DefaultTableModel) table1.getModel();
                Object[] row = {rs.getString("name"), rs.getString("id"), rs.getString("age"), rs.getString("gender"),rs.getString("address"),rs.getString("email_id"),rs.getString("phone_no")};
                model.addRow(row);
            }
            con.close();
        } catch (Exception ee) {
            System.out.print(ee);
        }
    }

    private void table1MouseClicked(MouseEvent e) {

    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        this.dispose();
        MENU1 r1=new MENU1();
        r1.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - nivitha
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        label1 = new JLabel();
        button1 = new JButton();

        //======== this ========
        setTitle("Customers");
        Container contentPane = getContentPane();

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, "", "", "", null, "", ""},
                    {null, null, null, null, null, null, null},
                },
                new String[] {
                    "Name", "User Id", "Age", "Gender", "Address", "Email", "Phone No"
                }
            ));
            table1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    table1MouseClicked(e);
                }
            });
            scrollPane1.setViewportView(table1);
        }

        //---- label1 ----
        label1.setText("User Registered with us!!");
        label1.setFont(new Font("Arial", Font.BOLD, 14));

        //---- button1 ----
        button1.setText("BACK");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(249, 249, 249)
                                    .addComponent(label1))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(279, 279, 279)
                                    .addComponent(button1)))
                            .addGap(0, 257, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1)
                    .addGap(20, 20, 20)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                    .addGap(44, 44, 44)
                    .addComponent(button1)
                    .addContainerGap(71, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - nivitha
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    }

