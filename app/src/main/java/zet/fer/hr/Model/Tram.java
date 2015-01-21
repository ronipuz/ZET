package zet.fer.hr.Model;

/**
 * Created by Jelena on 20.1.2015..
 */

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "comments")
public class Tram {

    @DatabaseField(generatedId = true)
    private int idTram;

    @DatabaseField(canBeNull = false)
    private int tramNumber;


    public Tram() {
        //need empty constructor
    }

    public int getTramNumber() {
        return tramNumber;
    }

    public int getIdTram() {
        return idTram;
    }

    public void setTramNumber(int tramNumber) {
        this.tramNumber = tramNumber;
    }
}
