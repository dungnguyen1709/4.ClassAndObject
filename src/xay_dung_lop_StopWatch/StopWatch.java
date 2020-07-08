package xay_dung_lop_StopWatch;

public class StopWatch {
    private double starTime;
    private double endTime;

    public StopWatch(double starTime) {
        this.starTime = starTime;

    }

    public void setStarTime() {
        this.starTime = System.currentTimeMillis();
    }
    public  void setEndTime() {
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return this.endTime - this.starTime;
    }
}
