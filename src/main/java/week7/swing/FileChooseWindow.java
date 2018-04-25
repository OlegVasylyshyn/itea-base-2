package week7.swing;

import week6.io.txt.FilesUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileChooseWindow extends JFrame {

    private JTextField fileNameField = new JTextField(50);
    private JButton openFile = new JButton("open");
    private String fileSource;

    public FileChooseWindow(JTextArea textArea, FileHolder fileHolder){
        setLayout(new GridLayout(0, 1));
        add(fileNameField);
        add(openFile);

        openFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fileName = fileNameField.getText();
                fileHolder.fileName = fileName;
                System.out.println("FileName - " + fileName);
                fileSource = FileUtil.getSource(fileName);
                System.out.println(fileName);
                textArea.setText(fileSource);
                if(fileSource != null) {
                    dispose();
                }
            }
        });

        setSize(300, 100);
        setTitle("Choose file");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(350, 150);
        setResizable(false);
        setVisible(true);
    }

}
