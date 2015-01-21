package zet.fer.hr.zetapi;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roni on 1/14/15.
 */
public class Parser {

    public List<BusLine> parseBusLines(final String htmlSource) {
        return null;
    }

    public List<TramLine> parseTramLines(final String htmlSource) {

        Document doc = Jsoup.parse(htmlSource, "UTF-8");
        Element tramList = doc.select("ul").first();
        Elements trams = tramList.select("li");

        List<String> tramLines = new ArrayList<>();
        for (Element tram : trams) {
            String tramText = tram.text();
            tramLines.add(tramText);
        }

        return null;
    }
}
