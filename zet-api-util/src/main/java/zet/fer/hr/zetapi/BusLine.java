package zet.fer.hr.zetapi;

/**
 * Created by roni on 1/14/15.
 */
public class BusLine {

    private String busLineName;
    private String firstBusStop;
    private String lastBusStop;
    private String timeStartTravel;

    public BusLine(String firstBusStop, String busLineName, String timeStartTravel, String lastBusStop) {
        this.firstBusStop = firstBusStop;
        this.busLineName = busLineName;
        this.timeStartTravel = timeStartTravel;
        this.lastBusStop = lastBusStop;
    }

    public String getLastBusStop() {
        return lastBusStop;
    }

    public void setLastBusStop(String lastBusStop) {
        this.lastBusStop = lastBusStop;
    }

    public String getBusLineName() {
        return busLineName;
    }

    public void setBusLineName(String busLineName) {
        this.busLineName = busLineName;
    }

    public String getFirstBusStop() {
        return firstBusStop;
    }

    public void setFirstBusStop(String firstBusStop) {
        this.firstBusStop = firstBusStop;
    }

    public String getTimeStartTravel() {
        return timeStartTravel;
    }

    public void setTimeStartTravel(String timeStartTravel) {
        this.timeStartTravel = timeStartTravel;
    }
}
