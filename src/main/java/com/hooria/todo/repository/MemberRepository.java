package com.hooria.todo.repository;

import com.hooria.todo.domain.Member;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.List;

@Repository
public class MemberRepository {

    private final SimpleJdbcInsert insertJdbc;
    private final NamedParameterJdbcTemplate jdbc;
    private final RowMapper<Member> rowMapper;

    public MemberRepository(DataSource dataSource) {
        jdbc = new NamedParameterJdbcTemplate(dataSource);
        insertJdbc = new SimpleJdbcInsert(dataSource).withTableName("article").usingGeneratedKeyColumns("id");
        rowMapper = (rs, row) ->
                new Member(
                        rs.getLong("id"),
                        rs.getString("user_id"),
                        rs.getString("name"),
                        rs.getString("password")
                );
    }

    public List<Member> findAll() {
        return jdbc.query(
                "select id, user_id, name, password from member",
                Collections.emptyMap(), rowMapper
        );
    }
}
