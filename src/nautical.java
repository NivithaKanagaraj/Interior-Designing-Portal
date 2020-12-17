import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Fri Apr 17 00:36:53 IST 2020
 */



/**
 * @author nivitha
 */
public class nautical extends JFrame {
    String uname;
    public nautical(String a) {
        initComponents();
        uname=a;
        this.setVisible(true);
        getContentPane().setBackground(Color.LIGHT_GRAY);

    }

    private void button1MouseClicked(MouseEvent e) {
        MENU m4= new MENU(uname);
        this.dispose();
        m4.setVisible(true);
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - nivitha
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label4 = new JLabel();
        button1 = new JButton();
        label7 = new JLabel();

        //======== this ========
        setTitle("Nautical Design");
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("text");
        label1.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\nau\\download (1).jfif"));

        //---- label2 ----
        label2.setText("text");
        label2.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\nau\\download (2).jfif"));

        //---- label3 ----
        label3.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\nau\\download (4).jfif"));

        //---- label5 ----
        label5.setText("text");
        label5.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\nau\\images (5).jfif"));

        //---- label6 ----
        label6.setText("text");
        label6.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\nau\\images.jfif"));

        //---- label4 ----
        label4.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\nau\\download.jfif"));

        //---- button1 ----
        button1.setText("BACK");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });

        //---- label7 ----
        label7.setText("PORTFOLIO");
        label7.setFont(new Font("Arial", Font.BOLD, 14));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label3)
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(353, 353, 353)
                            .addComponent(button1))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(315, 315, 315)
                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(324, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(label7, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addGap(2, 2, 2)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label4))
                    .addGap(6, 6, 6)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5)
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addComponent(button1)
                    .addGap(26, 26, 26))
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
    private JLabel label5;
    private JLabel label6;
    private JLabel label4;
    private JButton button1;
    private JLabel label7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
