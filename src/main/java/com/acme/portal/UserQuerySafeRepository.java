package com.acme.portal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * JDBC repository — safe twin using PreparedStatement bind variables.
 *
 * SYNTHETIC benchmark fixture — not customer code. British English throughout.
 */
public class UserQuerySafeRepository {

    private final Connection conn;
    public UserQuerySafeRepository(Connection conn) { this.conn = conn; }

    public ResultSet searchByEmail(String email) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM app_user WHERE email = ?");
        ps.setString(1, email);
        return ps.executeQuery();
    }
}
