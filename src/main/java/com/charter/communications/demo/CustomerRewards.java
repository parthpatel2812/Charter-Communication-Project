package com.charter.communications.demo;

import java.util.HashMap;
import java.util.Map;

public class CustomerRewards {
    private Map<String, Integer> monthlyPoints = new HashMap<>();
    private int totalPoints = 0;

    public void addPoints(String month, int points) {
        monthlyPoints.merge(month, points, Integer::sum);
        totalPoints += points;
    }

    public Map<String, Integer> getMonthlyPoints() {
        return monthlyPoints;
    }

    public void setMonthlyPoints(Map<String, Integer> monthlyPoints) {
        this.monthlyPoints = monthlyPoints;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
}
