package org.example.hw2_task4;

public class Clock implements Readable{
    private int hour;
    private int minute;
    private int second;

    public void setHour (int hour) {
        this.hour = hour;
    }

    public void setMinute (int minute) {
        this.minute = minute;
    }

    public void setSecond (int second) {
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void tick() {
        this.second += 1;
        int seconds_value = this.second;
        if (seconds_value > 60) {
            this.minute += 1;
            this.second = this.second%60;
        }
    }

    @Override
    public void readTick() {
        System.out.println(this.hour+":"+this.minute+":"+this.second);
    }
}
