package week_11;

import java.util.List;

public class Controller {
    // Manages interactions between GUI and Database
    // Contains Main method.

    private final String DB_CONNECTION_URL = "jdbc:sqlite:places.sqlite";
    private PlaceGUI gui;
    private PlaceDB db;

    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.startApp();
    }

    private void startApp() {
        // Application Logic goes here.
        db = new PlaceDB(DB_CONNECTION_URL);
        gui = new PlaceGUI(this); // Here "this" means this Controller Object.

    }

    public List<Place> getAllData() {
        List<Place> allPlaces = db.fetchAllRecords();
        return allPlaces;
    }

    public boolean addPlaceToDatabase(Place place) {
        boolean success = db.addRecord(place);
        return success;
    }

    public void deletePlace(Place place) {
        db.deleteRecord(place);
    }

    public Double getElevationForPlace(String name) {
        Double elevation = db.getElevationForPlaceName(name);
        return elevation;
    }

    public boolean updatePlace(Place place) {
        return db.updatePlaceRecord(place);
    }
}
