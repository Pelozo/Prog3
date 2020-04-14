package net.pelozo.java.ex5;

public class Time {

    //gotta save all that memory
    private byte hours;
    private byte minutes;
    private byte seconds;

    public Time(){
       hours = 0;
       minutes = 0;
       seconds = 0;
    }


    public Time(int hours, int minutes, int seconds){
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public Time addSecond(){
        seconds++;
        if(seconds > 59){
            seconds = 0;
            addMinute();
        }
        return this;
    }

    public Time addMinute(){
        minutes++;
        if(minutes > 59){
            minutes = 0;
            addHour();
        }
        return this;
    }

    public Time addHour(){
        hours++;
        if(hours > 23){
            hours = 0;
        }
        return this;
    }

    public Time discountSecond(){
        seconds--;
        if(seconds < 0){
                seconds = 59;
                discountMinute();
        }
        return this;
    }

    public Time discountMinute(){
        minutes--;
        if(minutes < 0){
            minutes = 59;
            discountHour();
        }
        return this;
    }

    public Time discountHour(){
        hours--;
        if(hours < 0){
            hours = 23;
        }
        return this;
    }

    public int getHours() {
        return (int)hours;
    }

    public void setHours(int hours) {
        if(hours < 0 || hours > 23){
            throw new IllegalArgumentException ("Hours need to be in 0 ... 23 range, it was " + hours);
        }

        this.hours = (byte) hours;
    }

    public int getMinutes() {
        return (int)minutes;
    }

    public void setMinutes(int minutes) {
        if(minutes < 0 || minutes > 59){
            throw new IllegalArgumentException ("Minutes need to be in 0 ... 59 range, it was " + minutes);
        }
        this.minutes = (byte) minutes;
    }

    public int getSeconds() {
        return (int)seconds;
    }

    public void setSeconds(int  seconds) {
        if(seconds < 0 || seconds > 59){
            throw new IllegalArgumentException ("Minutes need to be in 0 ... 59 range, it was " + seconds);
        }
        this.seconds = (byte) seconds;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
