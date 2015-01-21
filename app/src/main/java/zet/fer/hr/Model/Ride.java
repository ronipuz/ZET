package zet.fer.hr.Model;

/**
 * Created by Jelena on 20.1.2015..
 */

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "ride")
public class Ride {

    @DatabaseField(generatedId = true)
    private int idRide;

    @DatabaseField(foreign = true)
    private Tram idTram;

    @DatabaseField(foreign = true)
    private Arrival idArrival;

    @DatabaseField(canBeNull = false)
    private boolean direction;

    public int getIdRide() {
        return idRide;
    }

    public Tram getIdTram() {
        return idTram;
    }

    public Arrival getIdArrival() {
        return idArrival;
    }

    public boolean isDirection() {
        return direction;
    }

    public Ride() {
        //needs empty constructo
    }

    public void setIdTram(Tram idTram) {
        this.idTram = idTram;
    }

    public void setIdArrival(Arrival idArrival) {
        this.idArrival = idArrival;
    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }
}
