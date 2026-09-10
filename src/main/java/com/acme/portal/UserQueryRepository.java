package com.acme.portal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * JDBC repository. Contains one concatenated query (vulnerable).
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class UserQueryRepository {

    private final Connection conn;
    public UserQueryRepository(Connection conn) { this.conn = conn; }

    public ResultSet searchByEmail(String email) throws SQLException {
        Statement st = conn.createStatement();
        return st.executeQuery("SELECT * FROM app_user WHERE email = '" + email + "'");
    }
}
