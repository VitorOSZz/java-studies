package org.example;

import io.github.cdimascio.dotenv.Dotenv;
import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class Main {
    static void main() {

        DataSource ds = createDataSource();
        System.out.println(ds);

        Connection conn = null;
        try {
            conn = ds.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println(conn);
        System.out.println("Connected to database");

        String result = null;
        try {
            result = getQuery(conn, "SELECT * FROM games");
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println(result);
    }

    private static DataSource createDataSource() {
        final String url = "jdbc:postgresql://localhost:5432/games";

        Dotenv dotenv = Dotenv.load();
        final String user = dotenv.get("POSTGRES_USER");
        final String password = dotenv.get("POSTGRES_PASSWORD");
        final PGSimpleDataSource dataSource = new PGSimpleDataSource();

        dataSource.setURL(url);
        dataSource.setUser(user);
        dataSource.setPassword(password);

        return dataSource;
    }

    private static String getQuery(Connection conn, String Query) throws SQLException {

        PreparedStatement stmt = conn.prepareStatement(Query);
        ResultSet resultSet = stmt.executeQuery();

        StringBuilder result = new StringBuilder();

        ResultSetMetaData metadata = resultSet.getMetaData();
        int columnCount = metadata.getColumnCount();

        while (resultSet.next()) {
            result.append("| ");
            for (int i = 1; i <= columnCount; i++) {
                result.append(resultSet.getString(i)).append(" | ");
            }
            result.append("\n");
        }

        return result.toString();
    }
}
