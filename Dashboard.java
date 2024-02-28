import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    Dashboard() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(null);
        topPanel.setBackground(new Color(0, 0, 102));
        topPanel.setBounds(0, 0, 1600, 65);
        add(topPanel);

        JLabel dashboardLabel = new JLabel("Dashboard");
        dashboardLabel.setFont(new Font("Arial", Font.BOLD, 24));
        dashboardLabel.setForeground(Color.WHITE);
        dashboardLabel.setBounds(80, 10, 300, 40);
        topPanel.add(dashboardLabel);

        ImageIcon dashboardIcon = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image scaledDashboardIcon = dashboardIcon.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon scaledDashboardIconImage = new ImageIcon(scaledDashboardIcon);
        JLabel dashboardIconLabel = new JLabel(scaledDashboardIconImage);
        dashboardIconLabel.setBounds(5, 0, 70, 70);
        topPanel.add(dashboardIconLabel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(0, 1, 10, 10)); // Using GridLayout with 1 column
        buttonPanel.setBackground(new Color(0, 0, 102));

        // About Details Button
        addButtonToPanel(buttonPanel, "About Details");

        // Add Personal Details Button
        addButtonToPanel(buttonPanel, "Add Personal Details");

        // View Details Button
        addButtonToPanel(buttonPanel, "View Personal Detail");

        // Update Details Button
        addButtonToPanel(buttonPanel, "Update Personal Details");

        // check package Details Button
        addButtonToPanel(buttonPanel, "Delete Personal Details");

        // book package Details Button
        addButtonToPanel(buttonPanel, "Book package ");

        // View package package Details Button
        addButtonToPanel(buttonPanel, "View package ");

        // View Hotel package Details Button
        addButtonToPanel(buttonPanel, "View Hotel ");

        // View BOOKED Hotel package Details Button
        addButtonToPanel(buttonPanel, "View Booked Hotel ");

        // Destination Details Button
        addButtonToPanel(buttonPanel, "Destination ");

        // Payments Button
        addButtonToPanel(buttonPanel, "Payments ");
        
        // Calculator Button
        addButtonToPanel(buttonPanel, "Calculator");

        // Notepad Button
        addButtonToPanel(buttonPanel, "NotePad");

        JScrollPane scrollPane = new JScrollPane(buttonPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        JPanel sidebarPanel = new JPanel();
        sidebarPanel.setLayout(new BorderLayout());
        sidebarPanel.setBounds(0, 65, 250, 575);
        sidebarPanel.setBackground(new Color(0, 0, 102));
        sidebarPanel.add(scrollPane, BorderLayout.CENTER); // Add the button panel to the center of the sidebar panel
        sidebarPanel.setPreferredSize(new Dimension(250, 800)); // Set preferred size to allocate more space for buttons

        add(sidebarPanel);

        ImageIcon homeImageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image scaledHomeImage = homeImageIcon.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon scaledHomeImageIcon = new ImageIcon(scaledHomeImage);
        JLabel homeLabel = new JLabel(scaledHomeImageIcon);
        homeLabel.setBounds(0, 0,1650, 1000);
        add(homeLabel);
         JLabel label = new JLabel("Travel and Tourism Management System");

        setVisible(true);
    }

    private void addButtonToPanel(JPanel panel, String buttonText) {
        JButton button = new JButton(buttonText);
        button.setBackground(new Color(0, 0, 50));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Tahoma", Font.PLAIN, 18)); // Reduced font size
        button.setPreferredSize(new Dimension(200, 50)); // Set preferred size for the buttons
        panel.add(button);
       

    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
