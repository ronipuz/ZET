package zet.fer.hr.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;
import retrofit.http.GET;
import retrofit.http.Path;
import zet.fer.hr.zetapi.TramLine;

/**
 * Created by roni on 1/21/15.
 */
public class ZETClient {

    private static final String API_URL = "http://zet.hr";

    static class Contributor {
        String login;
        int contributions;
    }

    interface ZET {
        @GET("default.aspx?id=291")
        List<Contributor> contributors(
                @Path("owner") String owner,
                @Path("repo") String repo
        );
    }

    public static void main(String... args) {

        Gson gson = new GsonBuilder()
       //         .registerTypeAdapter(TramLine.class, new DateTypeAdapter())
                .create();

// Create a very simple REST adapter which points the GitHub API endpoint.
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(API_URL)
                .setConverter(new GsonConverter(gson))
                .build();
// Create an instance of our GitHub API interface.
        ZET zet = restAdapter.create(ZET.class);
// Fetch and print a list of the contributors to this library.
        List<Contributor> contributors = zet.contributors("square", "retrofit");
        for (Contributor contributor : contributors) {
            System.out.println(contributor.login + " (" + contributor.contributions + ")");
        }
    }
}
