package zet.fer.hr.zetapi;

/**
 * Created by roni on 1/14/15.
 */
public class TramLine {

    private String tramLineName;
    private String firstStop;
    private String lastStop;

    public TramLine(String tramLineName, String firstStop, String lastStop) {
        this.tramLineName = tramLineName;
        this.firstStop = firstStop;
        this.lastStop = lastStop;
    }

    public String getTramLineName() {
        return tramLineName;
    }

    public void setTramLineName(String tramLineName) {
        this.tramLineName = tramLineName;
    }

    public String getFirstStop() {
        return firstStop;
    }

    public void setFirstStop(String firstStop) {
        this.firstStop = firstStop;
    }

    public String getLastStop() {
        return lastStop;
    }

    public void setLastStop(String lastStop) {
        this.lastStop = lastStop;
    }
}
