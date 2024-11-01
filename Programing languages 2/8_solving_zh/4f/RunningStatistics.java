import java.util.ArrayList;
import java.util.List;

public class RunningStatistics {

    public static void main(String[] args) {
        String csvFile = "running_performance.csv";
        String csvSplitBy = ",";

        List<String> months = new ArrayList<>();
        List<Double> distances = new ArrayList<>();
        List<Double> times = new ArrayList<>();

        List<String> lines = FileUtils.readLines(csvFile);

        // Skip the header line
        boolean isFirstLine = true;
        for (String line : lines) {
            if (isFirstLine) {
                isFirstLine = false;
                continue;
            }

            String[] data = line.split(csvSplitBy);

            String month = data[0];
            String timeString = data[1];
            double distance = Double.parseDouble(data[2]); // kilometers

            // Convert time from HH:mm:ss format to hours
            String[] timeParts = timeString.split(":");
            double time = Integer.parseInt(timeParts[0]) +
                    Integer.parseInt(timeParts[1]) / 60.0 +
                    Integer.parseInt(timeParts[2]) / 3600.0;

            months.add(month);
            distances.add(distance);
            times.add(time);
        }

        String fastestMonth = null;
        double highestAverageSpeed = 0.0;

        System.out.println("Monthly Average Speeds:");
        for (int i = 0; i < months.size(); i++) {
            String month = months.get(i);
            double totalDistance = distances.get(i);
            double totalTime = times.get(i);
            double averageSpeed = totalDistance / totalTime;
            System.out.printf("%s: %.2f km/h%n", month, averageSpeed);

            if (averageSpeed > highestAverageSpeed) {
                highestAverageSpeed = averageSpeed;
                fastestMonth = month;
            }
        }

        if (fastestMonth != null) {
            System.out.printf("\nA legmagasabb átlagsebességű hónap %s, %.2f km/h átlagsebességgel.%n",
                    fastestMonth, highestAverageSpeed);
        }
    }
}
