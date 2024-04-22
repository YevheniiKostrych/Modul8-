package modul7;
import java.net.*;
public class GooSearchResult {
private String url;
    String domain;
public GooSearchResult(String url){
    this.url=url;
}

    public String getUrl() {
        return url;
    }






    public String parseDomain() {


        try {
            URL url1 = new URL(getUrl());
            domain = url1.getHost();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


        return this.domain;
    }
}
class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}