package com.bridgelabz.QueueInterface;

import java.util.PriorityQueue;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>((a, b) -> Integer.compare(b.severity, a.severity));

        // Add patients
        pq.offer(new Patient("John", 3));
        pq.offer(new Patient("Alice", 5));
        pq.offer(new Patient("Bob", 2));

        // Process patients in order of severity
        while (!pq.isEmpty()) {
            Patient p = pq.poll();
            System.out.println(p.name + " (Severity: " + p.severity + ")");
        }
    }
}
