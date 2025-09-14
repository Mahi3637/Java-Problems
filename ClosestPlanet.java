import java.util.Scanner;

public class ClosestPlanet {
    public static void main(String[] args) {

        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter"};
        double[] x_coordinates = {0.39, 0.72, 1.00, 1.52, -5.20};
        double[] y_coordinates = {0.24, 0.00, 0.00, 0.99, 2.86};
        double[] z_coordinates = {-0.10, 0.44, -0.02, 0.21, 0.42};
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Planet Name:");
        String inputPlanet = scanner.nextLine();
        
        // Find index of input planet
        int inputIndex = -1;
        for (int i = 0; i < planets.length; i++) {
            if (planets[i].equalsIgnoreCase(inputPlanet)) {
                inputIndex = i;
                break;
            }
        }
        
        // Check if input is valid
        if (inputIndex == -1) {
            System.out.println("Invalid Input");
            return;
        }
        
        // Get coordinates of input planet
        double x0 = x_coordinates[inputIndex];
        double y0 = y_coordinates[inputIndex];
        double z0 = z_coordinates[inputIndex];
        
        // Find closest planet
        double minDistance = Double.MAX_VALUE;
        int closestIndex = -1;
        
        for (int i = 0; i < planets.length; i++) {
            if (i == inputIndex) continue; // Skip the input planet itself
            
            double x1 = x_coordinates[i];
            double y1 = y_coordinates[i];
            double z1 = z_coordinates[i];
            
            // Calculate squared distance (we don't need to take square root since we're just comparing)
            double distance = Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2) + Math.pow(z1 - z0, 2);
            
            if (distance < minDistance) {
                minDistance = distance;
                closestIndex = i;
            }
        }
        
        // Output result
        System.out.println("Closest Planet : " + planets[closestIndex]);
        System.out.printf("Distance : %.6f%n", minDistance);
    }
}