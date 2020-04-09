package Model;

public class Circuit {
    private int circuitId;
    private String circuitRef;
    private String name;
    private String location;
    private String country;
    private double lat;
    private double lng;
    private int alt;
    private String url;

    public int getCircuitId() {
        return circuitId;
    }

    public String getCircuitRef() {
        return circuitRef;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getCountry() {
        return country;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public int getAlt() {
        return alt;
    }

    public String getUrl() {
        return url;
    }

    public void setCircuitId(int circuitId) {
        this.circuitId = circuitId;
    }

    public void setCircuitRef(String circuitRef) {
        this.circuitRef = circuitRef;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Circuit{" +
                "circuitId=" + circuitId +
                ", circuitRef='" + circuitRef + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", country='" + country + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                ", alt=" + alt +
                ", url='" + url + '\'' +
                '}';
    }
}
