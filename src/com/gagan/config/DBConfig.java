package com.gagan.config;

public class DBConfig {
    private final String jdbcUrl;
    private final String username;
    private final String password;
    private final String driverClassName;

    public DBConfig(String jdbcUrl, String username, String password, String driverClassName) {
        this.jdbcUrl = jdbcUrl;
        this.username = username;
        this.password = password;
        this.driverClassName = driverClassName;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }
}
