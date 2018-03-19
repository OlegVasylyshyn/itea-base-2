package week7.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Desktop extends JFrame{

    private JButton openButton = new JButton("OPEN");
    private JButton saveButton = new JButton("SAVE");

    private JPanel mainPanel = new JPanel();
    private JPanel textAreaPanel = new JPanel();
    private JPanel buttonPanel = new JPanel();

    private JTextArea textArea = new JTextArea(30, 16);

    private FileHolder fileHolder = new FileHolder();

    public Desktop(){
        initComponents();
        initListeners();
        init();
    }

    private void initListeners() {
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("OPEN");
                FileChooseWindow fileChooseWindow = new FileChooseWindow(textArea, fileHolder);
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("File name - " + fileHolder.fileName);
                FileUtil.saveTextFile(fileHolder.fileName, textArea.getText());
            }
        });


    }

    private void initComponents() {
        buttonPanel.setLayout(new GridLayout(0, 1));
        buttonPanel.add(openButton);
        buttonPanel.add(saveButton);

        JPanel westPanel = new JPanel();
        westPanel.setLayout(new BorderLayout());
        westPanel.add(buttonPanel, BorderLayout.NORTH);

        textArea.setLineWrap(true);
        textAreaPanel.add(textArea);

        textArea.setEditable(false);

        JScrollPane scroll = new JScrollPane(textAreaPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(westPanel, BorderLayout.EAST);
        mainPanel.add(scroll, BorderLayout.WEST);

        add(mainPanel);

        JMenuBar bar = new JMenuBar();

        JMenu fileMenu = new JMenu("file");
        fileMenu.add(new JMenuItem("open"));
        fileMenu.add(new JMenuItem("save"));

        JMenu infoMenu = new JMenu("info");
        infoMenu.add(new JMenuItem("about"));

        bar.add(fileMenu);
        bar.add(infoMenu);
        setJMenuBar(bar);
    }

    private void init() {
        setSize(300, 300);
        setTitle("Notepad");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(350, 150);
        setResizable(false);
        setVisible(true);
    }

}
