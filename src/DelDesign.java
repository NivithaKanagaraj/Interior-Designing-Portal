//import java.awt.HeadlessException;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/*
 * Created by JFormDesigner on Sun Apr 19 14:22:33 IST 2020
 */



/**
 * @author nivitha
 */
public class DelDesign extends JFrame {
    public DelDesign() {
        initComponents();
        this.setVisible(true);
        getContentPane().setBackground(Color.LIGHT_GRAY);

        try {
            DefaultTableModel dm = (DefaultTableModel) table2.getModel();
            int rowCount = dm.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                dm.removeRow(i);
            }
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "nivi07");
            //Statement stmt = con.createStatement();
            String query = "select * from design";
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                DefaultTableModel model = (DefaultTableModel) table2.getModel();
                Object[] row = {rs.getString("dcode"), rs.getString("dtype") };
                model.addRow(row);
            }
            con.close();
        } catch (Exception ee) {
            System.out.print(ee);
        }
    }


    private void table2MouseClicked(MouseEvent e) {
        // TODO add your code here
        int index =table2.getSelectedRow();
        TableModel model=table2.getModel();
        String tno=(String)model.getValueAt(index,0);
        System.out.print("Hello!"+tno);

        int result=JOptionPane.showConfirmDialog(null,"Want to Delete? ","Sure !!!",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
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
                s="delete from design where dcode='"+tno+"'";
                int i=st.executeUpdate(s);
                if(i>0)
                {
                    int res=JOptionPane.showConfirmDialog(null,"Deleted Sucessfully","Done",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
                    if(res==JOptionPane.OK_OPTION)
                    {
                        DefaultTableModel model2=(DefaultTableModel) table2.getModel();
                        model2.removeRow(index);
                    }
                }
            }
            catch(Exception  ee)
            {
                System.out.println(ee);
            }
        }

        }

        private void button1MouseClicked(MouseEvent e) {
            // TODO add your code here
            MENU1 x9=new MENU1();
            x9.setVisible(true);
            this.dispose();
        }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - nivitha
        scrollPane2 = new JScrollPane();
        table2 = new JTable();
        label1 = new JLabel();
        button1 = new JButton();

        //======== this ========
        setTitle("Delete Design");
        Container contentPane = getContentPane();

        //======== scrollPane2 ========
        {

            //---- table2 ----
            table2.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null},
                    {null, null},
                    {null, null},
                    {null, null},
                    {null, null},
                },
                new String[] {
                    "Design Id", "Design Name"
                }
            ));
            table2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    table2MouseClicked(e);
                    table2MouseClicked(e);
                }
            });
            scrollPane2.setViewportView(table2);
        }

        //---- label1 ----
        label1.setText("Delete Design");
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
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(123, 123, 123)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(button1)))
                    .addContainerGap(54, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(button1)
                    .addGap(35, 35, 35))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - nivitha
    private JScrollPane scrollPane2;
    private JTable table2;
    private JLabel label1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
