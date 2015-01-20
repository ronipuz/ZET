package zet.fer.hr.zetapi;

import android.content.Context;
import android.provider.MediaStore;
import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.SmallTest;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by roni on 1/14/15.
 */
public class ParserTest extends AndroidTestCase {

    protected String htmlSourceTram;
    protected Parser parser;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        parser = new Parser();
    }

    @SmallTest
    public void testTramLines() {

        /*Context context = getContext();
        File file = new File(context.getFilesDir(), "dnevne_linije_tramvaja.html");

        FileInputStream outputStream;

        try {
            outputStream = context.openFileInput("dnevne_linije_tramvaja.html");
            String bla = outputStream.toString();
            System.out.println(bla);
            System.out.println("KRAJJJJJJJJJJJJJ");
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    /*
        try {
            HttpClient httpclient = new DefaultHttpClient();
            HttpResponse response = httpclient.execute(new HttpGet("http://zet.hr/default.aspx?id=291"));
            System.out.println("RESPONSE"+response.toString());
            StatusLine statusLine = response.getStatusLine();
            if (statusLine.getStatusCode() == HttpStatus.SC_OK) {
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                response.getEntity().writeTo(out);
                out.close();
                String responseString = out.toString();
                System.out.println(responseString);
                //..more logic
            } else {
                //Closes the connection.
                response.getEntity().getContent().close();
                throw new IOException(statusLine.getReasonPhrase());
            }
        } catch (Exception e) {
            System.out.println("Jebiga");
        }
*/
        //InputStream iS = getAssets().open("bla.txt");
        //BufferedReader reader = new BufferedReader(new InputStreamReader(iS));
        System.out.println("---------PAZI OVO ! -------------");
        //System.out.println(parser.parseTramLines());
        assertTrue(2 == 3);
    }
}
