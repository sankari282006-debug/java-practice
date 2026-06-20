import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingMenuExample {
    public static void main(String[] args) {
        // 1. Create the main window frame
        JFrame frame = new JFrame("Swing Menu Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. Create the MenuBar container
        JMenuBar menuBar = new JMenuBar();

        // 3. Create a Menu category
        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");

        // 4. Create individual MenuItems
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        // 5. Add an action listener to make an item interactive
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Closes the application
            }
        });

        // 6. Assemble the hierarchy
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Adds a thin divider line
        fileMenu.add(exitItem);

        // Add Menus to the MenuBar
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        // 7. Attach the MenuBar directly to the frame window
        frame.setJMenuBar(menuBar);
        
        frame.setVisible(true);
    }
}