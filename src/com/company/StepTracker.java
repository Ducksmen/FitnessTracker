package com.company;

public class StepTracker {
    int totalDays;
    int activeDays;
    int totalSteps;
    int minActive;
    public StepTracker(int min){
        minActive = min;
        totalDays = 0;
        activeDays = 0;
        totalSteps = 0;
    }
    public int activeDays(){
        return activeDays;
    }
    public void addDailySteps(int steps){
        totalDays++;
        totalSteps += steps;
        if(steps >= minActive){
            activeDays++;
        }
    }
    public double averageSteps(){
        if(totalDays == 0){
            return 0;
        }
        return (double)totalSteps/(double)totalDays;
    }
}
