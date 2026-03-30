package com.charter.communications.demo;


import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RewardService {

    public int calculatePoints(double amount) {
        int points = 0;
        if (amount > 100) {
            points += (int) (amount - 100) * 2;
            points += 50;
        } else if (amount > 50) {
            points += (int) (amount - 50);
        }
        return points;
    }

    public Map<String, CustomerRewards> processRewards(List<Transaction> transactions) {
        Map<String, CustomerRewards> report = new HashMap<>();

        for (Transaction t : transactions) {
            int points = calculatePoints(t.amount());
            String month = t.date().getMonth().name();

            CustomerRewards customer = report.computeIfAbsent(t.customerId(), id -> new CustomerRewards());
            customer.addPoints(month, points);
        }
        return report;
    }
}
