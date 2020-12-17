import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Sun Apr 19 00:28:07 IST 2020
 */



/**
 * @author nivitha
 */
public class modern extends JFrame {
    String uname;
    public modern(String a) {
        initComponents();
        uname=a;
        this.setVisible(true);
        getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        MENU m4= new MENU(uname);
        m4.setVisible(true);
        this.dispose();

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
        button1 = new JButton();
        label7 = new JLabel();

        //======== this ========
        setTitle("Modern Designs");
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\images (3).jfif"));

        //---- label2 ----
        label2.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\modern\\images (4).jfif"));

        //---- label3 ----
        label3.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\modern\\images (1).jfif"));

        //---- label4 ----
        label4.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\modern\\download.jfif"));

        //---- label5 ----
        label5.setText("text");
        label5.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\modern\\images.jfif"));

        //---- label6 ----
        label6.setText("text");
        label6.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\modern\\download (1).jfif"));

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
        label7.setFont(new Font("Arial", Font.BOLD, 15));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label6, GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                    .addContainerGap(16, Short.MAX_VALUE))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(332, 332, 332)
                            .addComponent(button1))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(346, 346, 346)
                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(375, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(label7)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                .addComponent(label2, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addContainerGap(63, Short.MAX_VALUE)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button1)
                    .addContainerGap(10, Short.MAX_VALUE))
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
    private JButton button1;
    private JLabel label7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
