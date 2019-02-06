package com.juliofalbo.api.conf;

import javax.annotation.sql.DataSourceDefinition;
import javax.servlet.annotation.WebServlet;

@DataSourceDefinition(
        name = "java:global/CustomerDS",
        className = "org.h2.jdbcx.JdbcDataSource",
        url = "jdbc:h2:mem:customer;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE",
        user = "sa",
        password = "sa")

@WebServlet("/dataSourceServlet")
public class DataSourceConfig {
}
