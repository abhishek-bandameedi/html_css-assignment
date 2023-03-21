package assignments.assignment3;
//192.168.1.103

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Assignment3 {
    public static double getMedianPingTime(String host) throws IOException {
        String command = "ping " + host;
        Process process = Runtime.getRuntime().exec(command);
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        int count = 0;
        double[] pingTimes = new double[10];
        while ((line = reader.readLine()) != null) {
            if (line.contains("time=")) {
                int index = line.indexOf("time=");
                String timeStr = line.substring(index + 5);
                double time = Double.parseDouble(timeStr.substring(0, timeStr.indexOf(" ")));
                pingTimes[count] = time;
                count++;
                if (count == 10) {
                    break;
                }
            }
        }
        double medianPingTime;
        if (count > 0) {
            if (count % 2 == 0) {
                medianPingTime = (pingTimes[count/2] + pingTimes[count/2 - 1]) / 2;
            } else {
                medianPingTime = pingTimes[count/2];
            }
        } else {
            medianPingTime = -1;
        }
        return medianPingTime;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the host ip address or domain name: ");
        String host=sc.nextLine();
        double medianPingTime = getMedianPingTime(host);
        System.out.println("Median ping time: " + medianPingTime + " ms");
    }
}

