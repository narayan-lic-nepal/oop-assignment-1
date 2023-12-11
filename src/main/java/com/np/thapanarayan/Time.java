package com.np.thapanarayan;

public class Time {
    private long hour;
    private long minute;
    private long second;

    public Time() {
      long currentTimeMills =  System.currentTimeMillis();
      this.second = (currentTimeMills / 1000) % 60;
      this.minute = (currentTimeMills / (1000 * 60)) % 60;
      this.hour = (currentTimeMills / (1000 * 60 * 60)) % 24;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Time [" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second + "]";
    }
}
