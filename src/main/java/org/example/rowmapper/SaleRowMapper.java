package org.example.rowmapper;

import org.example.domain.SaleModel;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class SaleRowMapper implements RowMapper<SaleModel> {
    @Override
    public SaleModel mapRow(ResultSet rs, int rowNum) throws SQLException {
         return new SaleModel(
                 rs.getLong("id"),
                 rs.getLong("film_id"),
                 rs.getString("name"),
                 rs.getInt("price")

         );
    }
}
