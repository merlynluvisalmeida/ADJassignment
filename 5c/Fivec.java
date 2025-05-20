package swinDemo;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;
public class Fivec {

	

	

	    // Map of countries and their capitals
	    private static final HashMap<String, String> countryCapitals = new HashMap<>();

	    static {
	        countryCapitals.put("USA", "Washington, D.C.");
	        countryCapitals.put("India", "New Delhi");
	        countryCapitals.put("Vietnam", "Hanoi");
	        countryCapitals.put("Canada", "Ottawa");
	        countryCapitals.put("Denmark", "Copenhagen");
	        countryCapitals.put("France", "Paris");
	        countryCapitals.put("Great Britain", "London");
	        countryCapitals.put("Japan", "Tokyo");
	        countryCapitals.put("Africa", "No single capital (Africa is a continent)");
	        countryCapitals.put("Greenland", "Nuuk");
	        countryCapitals.put("Singapore", "Singapore");
	    }

	    public static void main(String[] args) {
	        // Create frame
	        JFrame frame = new JFrame("Country-Capital Viewer");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300, 300);

	        // Create JList with countries
	        String[] countries = countryCapitals.keySet().toArray(new String[0]);
	        JList<String> countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        JScrollPane scrollPane = new JScrollPane(countryList);

	        // Listener for selection
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    java.util.List<String> selectedCountries = countryList.getSelectedValuesList();
	                    System.out.println("Selected Country Capitals:");
	                    for (String country : selectedCountries) {
	                        System.out.println(country + " → " + countryCapitals.get(country));
	                    }
	                    System.out.println("--------------------------------");
	                }
	            }
	        });

	        // Add components to frame
	        frame.add(scrollPane, BorderLayout.CENTER);
	        frame.setVisible(true);
	    }
	}
