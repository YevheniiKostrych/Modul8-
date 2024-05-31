package modul8.test;

enum Season {
    Summer,
    Autumn,
    Winter,
    Spring
}

class SeasonFormatter implements Season1  {
    public String getSeasonName(Season season) {
        switch(season) {
            case Summer: return "Summer";
            case Autumn: return "Autumn";
            case Winter: return "Winter";
            case Spring: return "Spring";
        }

        throw new IllegalArgumentException("We don't know name for " + season);
    }
}

class SeasonTest {
    public static void main(String[] args) {
        SeasonFormatter sf = new SeasonFormatter();


        System.out.println(sf.getSeasonName(Season.Autumn));
    }
}
