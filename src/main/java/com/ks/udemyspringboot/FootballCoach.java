package com.ks.udemyspringboot;

public class FootballCoach implements Coach {
  @Override
  public String getDailyWorkout() {
    return "Play football for the entire day";
  }
}
