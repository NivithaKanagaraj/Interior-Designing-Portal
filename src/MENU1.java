import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.event.*;
/*
 * Created by JFormDesigner on Sat Apr 18 04:03:37 IST 2020
 */



/**
 * @author nivitha
 */
public class MENU1 extends JFrame {
    public MENU1() {
        initComponents();
        this.setVisible(true);
        getContentPane().setBackground(Color.LIGHT_GRAY);
    }
    private void menu1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        view_project x3= new view_project();
        setVisible(true);
    }

    private void menu1MenuKeyPressed(MenuKeyEvent e) {
        // TODO add your code here
    }

    private void menu1MouseClicked(MouseEvent e) {
        // TODO add your code here
        view_project x3= new view_project();
        setVisible(true);
        this.dispose();
    }




    private void menuItem1MouseClicked(MouseEvent e) {
        // TODO add your code here
        design b6= new design();
        b6.setVisible(true);
        this.dispose();
    }

    private void menuItem1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        design b7= new design();
        b7.setVisible(true);
        this.dispose();
    }

    private void menuItem3MouseClicked(MouseEvent e) {
        // TODO add your code here
        doneproject x5= new doneproject();
        setVisible(true);
        this.dispose();
    }

    private void menu2MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void menu2ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void menuItem3ActionPerformed(ActionEvent e) {
        // TODO add your code here
        doneproject x6= new doneproject();
        x6.setVisible(true);
        this.dispose();
    }

    private void menu4MouseClicked(MouseEvent e) {
        // TODO add your code here
        MAIN r2=new MAIN();
        r2.setVisible(true);
        this.dispose();
    }

    private void menuItem2MouseClicked(MouseEvent e) {
        // TODO add your code here
        DelDesign r3=new DelDesign();
        r3.setVisible(true);
        this.dispose();
    }

    private void menuItem4MouseClicked(MouseEvent e) {
        History r4=new History();
        r4.setVisible(true);
        this.dispose();
    }

    private void menuItem4ActionPerformed(ActionEvent e) {
        // TODO add your code here

        History r5=new History();
        r5.setVisible(true);
        this.dispose();
    }

    private void menuItem2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        DelDesign r6=new DelDesign();
        r6.setVisible(true);
        this.dispose();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - nivitha
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menu2 = new JMenu();
        menuItem3 = new JMenuItem();
        menuItem4 = new JMenuItem();
        menu3 = new JMenu();
        menuItem1 = new JMenuItem();
        menuItem2 = new JMenuItem();
        menu4 = new JMenu();
        label1 = new JLabel();

        //======== this ========
        setTitle("Interior Designing Portal");
        Container contentPane = getContentPane();

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("Customers");
                menu1.addMenuKeyListener(new MenuKeyListener() {
                    @Override
                    public void menuKeyPressed(MenuKeyEvent e) {
                        menu1MenuKeyPressed(e);
                    }
                    @Override
                    public void menuKeyReleased(MenuKeyEvent e) {}
                    @Override
                    public void menuKeyTyped(MenuKeyEvent e) {}
                });
                menu1.addActionListener(e -> {
			menu1ActionPerformed(e);
			menu1ActionPerformed(e);
			menu1ActionPerformed(e);
		});
                menu1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        menu1MouseClicked(e);
                    }
                });
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("Booking");
                menu2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        menu2MouseClicked(e);
                    }
                });
                menu2.addActionListener(e -> menu2ActionPerformed(e));

                //---- menuItem3 ----
                menuItem3.setText("Request");
                menuItem3.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        menuItem3MouseClicked(e);
                    }
                });
                menuItem3.addActionListener(e -> {
			menuItem3ActionPerformed(e);
			menuItem3ActionPerformed(e);
			menuItem3ActionPerformed(e);
		});
                menu2.add(menuItem3);

                //---- menuItem4 ----
                menuItem4.setText("History");
                menuItem4.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        menuItem4MouseClicked(e);
                    }
                });
                menuItem4.addActionListener(e -> menuItem4ActionPerformed(e));
                menu2.add(menuItem4);
            }
            menuBar1.add(menu2);

            //======== menu3 ========
            {
                menu3.setText("Design");

                //---- menuItem1 ----
                menuItem1.setText("Add Design");
                menuItem1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        menuItem1MouseClicked(e);
                    }
                });
                menuItem1.addActionListener(e -> menuItem1ActionPerformed(e));
                menu3.add(menuItem1);

                //---- menuItem2 ----
                menuItem2.setText("Delete Design");
                menuItem2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        menuItem2MouseClicked(e);
                    }
                });
                menuItem2.addActionListener(e -> menuItem2ActionPerformed(e));
                menu3.add(menuItem2);
            }
            menuBar1.add(menu3);

            //======== menu4 ========
            {
                menu4.setText("Logout");
                menu4.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        menu4MouseClicked(e);
                    }
                });
            }
            menuBar1.add(menu4);
        }
        setJMenuBar(menuBar1);

        //---- label1 ----
        label1.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\images (4).jfif"));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(58, Short.MAX_VALUE)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - nivitha
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenu menu2;
    private JMenuItem menuItem3;
    private JMenuItem menuItem4;
    private JMenu menu3;
    private JMenuItem menuItem1;
    private JMenuItem menuItem2;
    private JMenu menu4;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
