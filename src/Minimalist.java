import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Sun Apr 19 01:43:10 IST 2020
 */



/**
 * @author nivitha
 */
public class Minimalist extends JFrame {
    String uname;
    public Minimalist(String a) {
        initComponents();
        uname=a;
        this.setVisible(true);
        getContentPane().setBackground(Color.LIGHT_GRAY);
    }


    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        MENU m7= new MENU(uname);
        m7.setVisible(true);
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
        setTitle("Minimalist Design");
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("text");
        label1.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\mini\\download (1).jfif"));

        //---- label2 ----
        label2.setText("text");
        label2.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\images.jfif"));

        //---- label3 ----
        label3.setText("text");
        label3.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\mini\\download.jfif"));

        //---- label4 ----
        label4.setText("text");
        label4.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\mini\\download (5).jfif"));

        //---- label5 ----
        label5.setText("text");
        label5.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\mini\\download (2).jfif"));

        //---- label6 ----
        label6.setText("text");
        label6.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\images (4).jfif"));

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
        label7.setFont(new Font("Arial", Font.BOLD, 16));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(0, 312, Short.MAX_VALUE)
                    .addComponent(label7, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                    .addGap(299, 299, 299))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE))))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(329, 329, 329)
                            .addComponent(button1)))
                    .addContainerGap(26, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(label7)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
                    .addGap(58, 58, 58)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button1)
                    .addContainerGap(13, Short.MAX_VALUE))
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
