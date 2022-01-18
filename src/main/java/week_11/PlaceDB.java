package week_11;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlaceDB {

    // Holds all the database interactions.

    private final String DB_CONNECTION_URL;

    private final int SQLITE_DUPLICATE_PRIMARY_KEY_CODE = 19;

    public PlaceDB(String connectionURL) {
        DB_CONNECTION_URL = connectionURL;

        try (Connection connection = DriverManager.getConnection(DB_CONNECTION_URL);
             Statement statement = connection.createStatement() ) {

            String createTableSQL = "CREATE TABLE IF NOT EXISTS places " +
                    "(name TEXT PRIMARY KEY, elevation REAL, UNIQUE (name COLLATE NOCASE) )";

            statement.execute(createTableSQL);

        }catch (SQLException sqlE) {
            System.err.println("Error Creating table because " + sqlE);
        }
    }

    public List<Place> fetchAllRecords() {
        List<Place> allRecords = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(DB_CONNECTION_URL);
            Statement statement = connection.createStatement()) {

            String selectAllSQL = "SELECT * FROM places ORDER BY elevation";
            ResultSet rsAll = statement.executeQuery(selectAllSQL);

            while (rsAll.next()) {
                String name = rsAll.getString("name");
                double elevation = rsAll.getDouble("elevation");
                Place placeRecord = new Place(name, elevation);
                allRecords.add(placeRecord);
            }

            return allRecords;

        }catch (SQLException sqlException){
            System.err.println("Error fetching all places because " + sqlException);
            return null;

        }
    }

    public boolean addRecord(Place place) {

        String addPlaceSQL = "INSERT INTO places VALUES (?, ?)";

        try (Connection connection = DriverManager.getConnection(DB_CONNECTION_URL);
        PreparedStatement preparedStatement = connection.prepareStatement(addPlaceSQL)) {

            preparedStatement.setString(1, place.getName());
            preparedStatement.setDouble(2, place.getElevation());
            preparedStatement.execute();
            return true; // indicates successful insert statement.

        }catch (SQLException sqlException) {

            if (sqlException.getErrorCode() == SQLITE_DUPLICATE_PRIMARY_KEY_CODE) {
                System.out.println("Error adding place, already exists in database.");
            } else {
                System.err.println("Error adding new place because " + sqlException);
            }
            return false;
        }
    }

    public void deleteRecord(Place place) {

        String deleteSQL = "DELETE FROM places WHERE name = ?";

        try(Connection connection = DriverManager.getConnection(DB_CONNECTION_URL);
        PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {

            preparedStatement.setString(1, place.getName());
            preparedStatement.execute();

        } catch (SQLException sqlException) {
            System.err.println("Error deleting place " + place + " because " + sqlException);
        }
    }

    public Double getElevationForPlaceName(String name) {
        String searchSQL = "SELECT elevation FROM places where LOWER(name) = LOWER(?)";

        try(Connection connection = DriverManager.getConnection(DB_CONNECTION_URL);
        PreparedStatement preparedStatement = connection.prepareStatement(searchSQL)) {

            preparedStatement.setString(1, name);
            ResultSet placeRS = preparedStatement.executeQuery();

            if(placeRS.next()) {
                System.out.println("PLACE");
                double elevation = placeRS.getDouble("elevation");
                return elevation;
            } else {
                // place not found
                return null;
            }

        } catch (SQLException sqlException){
            System.err.println("Error finding place " + name + " because " + sqlException);
            return null;
        }
    }

    public boolean updatePlaceRecord(Place place) {
        String searchSQL = "UPDATE places SET elevation = ? WHERE LOWER(name) = LOWER(?)";

        try(Connection connection = DriverManager.getConnection(DB_CONNECTION_URL);
        PreparedStatement preparedStatement = connection.prepareStatement(searchSQL)) {

            preparedStatement.setDouble(1, place.getElevation());
            preparedStatement.setString(2, place.getName());

            int rowsUpdated = preparedStatement.executeUpdate();
            if(rowsUpdated == 1) {
                return true;
            }else {
                return false;
            }
        }catch (SQLException sqlException) {
            System.err.println("Error updating place" + place + " because " + sqlException);
            return false;
        }
    }
}
