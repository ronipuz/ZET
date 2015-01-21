package zet.fer.hr.Model;

/**
 * Created by Jelena on 20.1.2015..
 */

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "comments")
public class Station {


    @DatabaseField(generatedId = true)
    private int idStation;

    @DatabaseField(canBeNull = false)
    private String name ;

    @DatabaseField(canBeNull = false)
    private float coordinateX ;

    @DatabaseField(canBeNull = false)
    private float coordiinateY ;

    public Station() {
        //need empty constructor
    }

    public String getName() {
        return name;
    }

    public int getIdStation() {
        return idStation;
    }

    public float getCoordinateX() {
        return coordinateX;
    }

    public float getCoordiinateY() {
        return coordiinateY;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoordinateX(float coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordiinateY(float coordiinateY) {
        this.coordiinateY = coordiinateY;
    }
}
