package hu.nive.ujratervezes.zarovizsga.housecup;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Objects;

public class HouseCup {

    private JdbcTemplate jdbcTemplate;

    public HouseCup(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public int getPointsOfHouse(String houseName) {
        Integer result = jdbcTemplate.queryForObject("SELECT SUM(points_earned) AS sum FROM house_points GROUP BY house_name HAVING house_name = ?;",
                ((rs, rowNum) -> rs.getInt("sum")), houseName);
        return Objects.requireNonNullElse(result, 0);
    }
}
