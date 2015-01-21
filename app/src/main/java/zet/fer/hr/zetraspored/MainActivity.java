package zet.fer.hr.zetraspored;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;

import java.sql.SQLException;
import java.util.List;

import zet.fer.hr.Model.Tram;
import zet.fer.hr.data.DatabaseHelper;


public class MainActivity extends OrmLiteBaseActivity<DatabaseHelper> {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tb1 = (TextView) findViewById(R.id.text1);
        TextView  tb2 = (TextView) findViewById(R.id.text2);

        Tram tram = new Tram(5);
        Tram tram2 = new Tram(6);

        RuntimeExceptionDao<Tram, Integer> tramDao = getHelper().getRuntimeTramDao();
        List<Tram> trams;
        tramDao.create(tram);
        tramDao.create(tram2);
        trams = tramDao.queryForAll();
        tb1.setText(trams.get(0).getIdTram().toString());
        tb2.setText(trams.get(0).getTramNumber().toString());

    }



}
