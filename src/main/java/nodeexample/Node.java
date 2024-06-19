package nodeexample;

import java.util.ArrayList;
import java.util.List;

public class Node <T>{
    private String name;
    private List<Node> children;
    private String type;


    Node(String name, String type) {
        this.name = name;
        this.children = new ArrayList<>();
        this.type = type;
    }

    // Add a child node
    private void addChild(Node child) {
        children.add(child);
    }

    // Recursive method to print the hierarchy
    private void printHierarchy(String indent) {
        System.out.println(indent + type + ": " + name);
        for (Node child : children) {
            child.printHierarchy(indent + "  ");
        }
    }

    // Method to print the data of a division
    private void printDivisionData() {
        if (type.equals("Division")) {
            printHierarchy("");
        }
    }

    public static void main(String[] args) {
        // Create root node
        Node hotel = new Node("Hotel XYZ", "Root");

        // Create lists for divisions, departments, and designations
        List<Node> divisions = new ArrayList<>();
        List<Node> departments = new ArrayList<>();
        List<Node> designations = new ArrayList<>();

        // Create division nodes
        Node executiveManagement = new Node("Executive Management", "Division");
        divisions.add(executiveManagement);

        // Add divisions to the hotel
        hotel.addChild(executiveManagement);

        // Create department nodes
        Node managementOffice = new Node("Management Office", "Department");
        departments.add(managementOffice);

        // Add departments to the division
        executiveManagement.addChild(managementOffice);

        // Create designation nodes
        Node generalManager = new Node("General Manager", "Designation");
        Node hotelManager = new Node("Hotel Manager", "Designation");
        Node paToGeneralManager = new Node("PA to General Manager", "Designation");
        Node healthAndSafetyManager = new Node("Health & Safety Manager", "Designation");

        designations.add(generalManager);
        designations.add(hotelManager);
        designations.add(paToGeneralManager);
        designations.add(healthAndSafetyManager);

        managementOffice.addChild(generalManager);
        managementOffice.addChild(hotelManager);
        managementOffice.addChild(paToGeneralManager);
        managementOffice.addChild(healthAndSafetyManager);

        System.out.println("\nDivision Data:");
        for (Node division : divisions) {
            division.printDivisionData();
}
}
}
