package com.gagan.database;

import com.gagan.config.DBConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBase {
    private static final Logger LOG = Logger.getLogger(DataBase.class.getName());

    public Connection getConnection(DBConfig dbConfig) {
        LOG.info("Start :: getConnection()");
        Connection conn = null;
        try {
            Class.forName(dbConfig.getDriverClassName());
            conn = DriverManager.getConnection(dbConfig.getJdbcUrl(), dbConfig.getUsername(), dbConfig.getPassword());
            LOG.info("Database Connected Successfully");
        } catch (ClassNotFoundException | SQLException e) {
            LOG.log(Level.SEVERE, "Connection Failed", e);
        }
        return conn;
    }

    public ResultSet executeQuery(Connection connection, String query, String... params) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        for (int i = 0; i < params.length; i++) {
            preparedStatement.setString(i + 1, params[i]);
        }
        return preparedStatement.executeQuery();
    }

    public void close(AutoCloseable... resources) {
        for (AutoCloseable resource : resources) {
            if (resource != null) {
                try {
                    resource.close();
                    LOG.info(resource.getClass().getSimpleName() + " closed successfully");
                } catch (Exception e) {
                    LOG.log(Level.SEVERE, "Failed to close resource: " + resource.getClass().getSimpleName(), e);
                }
            }
        }
    }
}
