
/*
 * Created by JFormDesigner on Sat Apr 18 18:08:13 IST 2020
 */
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;
/**
 * @author nivitha
 */
public class doneproject extends JFrame {
    public doneproject() {
            this.setVisible(true);
            initComponents();
            getContentPane().setBackground(Color.PINK);
            try {
                DefaultTableModel dm = (DefaultTableModel) table1.getModel();
                int rowCount = dm.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--) {
                    dm.removeRow(i);
                }
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "nivi07");
                //Statement stmt = con.createStatement();
                String query = "select * from book";
                PreparedStatement stmt = con.prepareStatement(query);
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next()) {
                    DefaultTableModel model = (DefaultTableModel) table1.getModel();
                    Object[] row = {rs.getString("bname"), rs.getString("bno"), rs.getString("baddress"), rs.getString("bmail"), rs.getString("btype"),rs.getDate("bdate") };
                    model.addRow(row);
                }
                con.close();
            } catch (Exception ee) {
                System.out.print(ee);
            }
        }

        private void table1MouseClicked(MouseEvent e) {
            // TODO add your code here
            int index =table1.getSelectedRow();
            TableModel model=table1.getModel();
            String tno=(String)model.getValueAt(index,1);

            int result=JOptionPane.showConfirmDialog(null,"Conform the Bokking? ","Sure !!!",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
            if(result==JOptionPane.OK_OPTION)
            {
                Connection  con;
                Statement st;
                try
                {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","nivi07");
                    String s;
                    st=con.createStatement();
                    s="delete from book where bno='"+tno+"'";
                    int i=st.executeUpdate(s);
                    if(i>0)
                    {
                        int res=JOptionPane.showConfirmDialog(null," Sucessfully Booked","Done",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
                        if(res==JOptionPane.OK_OPTION)
                        {
                            DefaultTableModel model2=(DefaultTableModel) table1.getModel();
                            model2.removeRow(index);
                        }
                    }
                }
                catch(Exception  es)
                {
                    System.out.println(es);
                }
            }
        }

        private void button1MouseClicked(MouseEvent e) {
            // TODO add your code here
            MENU1 r8=new MENU1();
            r8.setVisible(true);
            this.dispose();
        }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - nivitha
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        label1 = new JLabel();
        button1 = new JButton();

        //======== this ========
        setTitle("Booking Request");
        Container contentPane = getContentPane();

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, "", null},
                    {null, null, null, null, null, null},
                },
                new String[] {
                    "Name", "Phone", "Address", "Email", "Type", "Date"
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
        label1.setText("Conform Your Booking!!");
        label1.setFont(new Font("Arial", Font.BOLD, 14));

        //---- button1 ----
        button1.setText("BACK");
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
                            .addGap(20, 20, 20)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(157, 157, 157)
                            .addComponent(button1)))
                    .addContainerGap(38, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(button1)
                    .addContainerGap(27, Short.MAX_VALUE))
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
