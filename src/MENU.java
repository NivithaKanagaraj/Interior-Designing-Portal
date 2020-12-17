import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.event.*;
/*
 * Created by JFormDesigner on Thu Apr 16 02:55:33 IST 2020
 */



/**
 * @author nivitha
 */
public class MENU extends JFrame {
    String uname;
    public MENU(String a) {
        initComponents();
        uname=a;
        //this.setVisible(true);
        getContentPane().setBackground(Color.LIGHT_GRAY);

    }

        private void menuItem2MouseClicked(MouseEvent e) {
            // TODO add your code here
            nautical m10= new nautical(uname);
            m10.setVisible(true);
            this.dispose();
        }



        private void menuItem2MenuKeyPressed(MenuKeyEvent e) {
            // TODO add your code here
        }

        private void menuItem2ActionPerformed(ActionEvent e) {
            // TODO add your code here
            nautical x1=new nautical(uname);
            x1.setVisible(true);
            this.dispose();
        }

        private void menu4ActionPerformed(ActionEvent e) {
            MAIN x9=new MAIN();
            x9.setVisible(true);
            this.dispose();
        }

        private void thisMouseClicked(MouseEvent e) {
            MAIN x6=new MAIN();
            x6.setVisible(true);
            this.dispose();
        }

        private void menu4MouseClicked(MouseEvent e) {
            // TODO add your code here
            this.dispose();
            MAIN x7=new MAIN();
            x7.setVisible(true);
        }

        private void menuItem3MouseClicked(MouseEvent e) {
            // TODO add your code here
            modern p1= new modern(uname);
            this.dispose();
            p1.setVisible(true);
        }

        private void menuItem3ActionPerformed(ActionEvent e) {
            // TODO add your code here
            modern m6= new modern(uname);
            this.dispose();
            m6.setVisible(true);
        }

        private void menuItem5MouseClicked(MouseEvent e) {
            // TODO add your code here
            Minimalist p2= new Minimalist(uname);
            this.dispose();
            p2.setVisible(true);
        }

        private void menuItem5ActionPerformed(ActionEvent e) {
            // TODO add your code here
            Minimalist p3= new Minimalist(uname);
            this.dispose();
            p3.setVisible(true);
        }

        private void menuItem2FocusGained(FocusEvent e) {
            // TODO add your code here
            Designer p4= new Designer(uname);
            this.dispose();
            p4.setVisible(true);
        }

        private void menu2MouseClicked(MouseEvent e) {
            Designer b5=new Designer(uname);
            this.dispose();
            b5.setVisible(true);

        }

        private void menu2ActionPerformed(ActionEvent e) {
            // TODO add your code here
            Designer p5= new Designer(uname);
            this.dispose();
            p5.setVisible(true);
        }

        private void menu3MouseClicked(MouseEvent e) {
            // TODO add your code here
            Consulting b1= new Consulting(uname);
            this.dispose();
            b1.setVisible(true);
        }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - nivitha
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem2 = new JMenuItem();
        menuItem3 = new JMenuItem();
        menuItem5 = new JMenuItem();
        menuItem6 = new JMenuItem();
        menu2 = new JMenu();
        menu3 = new JMenu();
        menu4 = new JMenu();
        label1 = new JLabel();

        //======== this ========
        setIconImage(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\images (3).jfif").getImage());
        setTitle("Interior designing Portal");
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                thisMouseClicked(e);
            }
        });
        Container contentPane = getContentPane();

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("Portfolio");
                menu1.setFont(new Font("Arial", Font.BOLD, 14));

                //---- menuItem2 ----
                menuItem2.setText("Nautical");
                menuItem2.addMenuKeyListener(new MenuKeyListener() {
                    @Override
                    public void menuKeyPressed(MenuKeyEvent e) {
                        menuItem2MenuKeyPressed(e);
                        menuItem2MenuKeyPressed(e);
                    }
                    @Override
                    public void menuKeyReleased(MenuKeyEvent e) {}
                    @Override
                    public void menuKeyTyped(MenuKeyEvent e) {}
                });
                menuItem2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        menuItem2MouseClicked(e);
                        menuItem2MouseClicked(e);
                        menuItem2MouseClicked(e);
                    }
                });
                menuItem2.addFocusListener(new FocusAdapter() {
                    @Override
                    public void focusGained(FocusEvent e) {
                        menuItem2FocusGained(e);
                        menuItem2FocusGained(e);
                    }
                });
                menuItem2.addActionListener(e -> menuItem2ActionPerformed(e));
                menu1.add(menuItem2);

                //---- menuItem3 ----
                menuItem3.setText("Modern");
                menuItem3.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        menuItem3MouseClicked(e);
                    }
                });
                menuItem3.addActionListener(e -> menuItem3ActionPerformed(e));
                menu1.add(menuItem3);

                //---- menuItem5 ----
                menuItem5.setText("Minimilist");
                menuItem5.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        menuItem5MouseClicked(e);
                    }
                });
                menuItem5.addActionListener(e -> menuItem5ActionPerformed(e));
                menu1.add(menuItem5);

                //---- menuItem6 ----
                menuItem6.setText("Traditional");
                menu1.add(menuItem6);
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("Design");
                menu2.setFont(new Font("Arial", Font.BOLD, 14));
                menu2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        menu2MouseClicked(e);
                        menu2MouseClicked(e);
                    }
                });
                menu2.addActionListener(e -> {
			menu2ActionPerformed(e);
			menu2ActionPerformed(e);
		});
            }
            menuBar1.add(menu2);

            //======== menu3 ========
            {
                menu3.setText("Booking");
                menu3.setFont(new Font("Arial", Font.BOLD, 14));
                menu3.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        menu3MouseClicked(e);
                    }
                });
            }
            menuBar1.add(menu3);

            //======== menu4 ========
            {
                menu4.setText("Logout");
                menu4.setFont(new Font("Arial", Font.BOLD, 14));
                menu4.addActionListener(e -> menu4ActionPerformed(e));
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
        label1.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\cat 3\\images.jfif"));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(54, Short.MAX_VALUE)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE)
                    .addGap(45, 45, 45))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(49, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - nivitha
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem2;
    private JMenuItem menuItem3;
    private JMenuItem menuItem5;
    private JMenuItem menuItem6;
    private JMenu menu2;
    private JMenu menu3;
    private JMenu menu4;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
