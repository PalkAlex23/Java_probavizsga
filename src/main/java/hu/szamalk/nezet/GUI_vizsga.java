package hu.szamalk.nezet;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_vizsga extends JFrame {
    private JPanel pnlMain;
    private JComboBox cbxMinden;
    private JButton btnOk;
    private JButton btnCancel;
    private JList list1;
    private JButton btnCopy;
    private JButton btnFelvitel;

    private JMenuItem alkoto, szobor, festmeny;

    public static void main(String[] args) {
        new GUI_vizsga();
    }

    public GUI_vizsga() {
        setTitle("Próbavizsga");
        setContentPane(pnlMain);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(-1);
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(-1);
            }
        });

        /* Menü */
        alkoto = new JMenuItem("Alkotó");
        szobor = new JMenuItem("Szobor");
        festmeny = new JMenuItem("Festmény");
        JMenu mnuPrg = new JMenu("Program");
        mnuPrg.add(alkoto);
        mnuPrg.add(szobor);
        mnuPrg.add(festmeny);
        mnuPrg.add(new JSeparator());
        JMenuBar mnuBar = new JMenuBar();
        mnuBar.add(mnuPrg);
        setJMenuBar(mnuBar);
        pack();
        setVisible(true);
    }
}
