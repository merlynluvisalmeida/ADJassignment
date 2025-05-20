package swinDemo;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
public class Fivea {





    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Country List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new BorderLayout());

        // Country array
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        // Create a JList with countries
        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Add selection listener to the JList
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) { // Prevent double events
                    java.util.List<String> selected = countryList.getSelectedValuesList();
                    System.out.println("Selected Countries: " + selected);
                }
            }
        });

        // Add list to the frame
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
