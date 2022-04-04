package com.hooria.todo.repository;

import com.hooria.todo.domain.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.test.context.jdbc.Sql;

import javax.sql.DataSource;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@JdbcTest
@Sql(scripts = {"classpath:schema.sql", "classpath:data.sql"})
class MemberRepositoryTest {

    @Autowired
    DataSource dataSource;

    MemberRepository repository;

    @BeforeEach
    void beforeEach() {
        repository = new MemberRepository(dataSource);
    }

    @Test
    @DisplayName("전체 게시글 목록을 반환한다.")
    void findAllSuccess() {

        // given
        List<Member> members = List.of(
                new Member(1, "userId1", "name1", "password1"),
                new Member(2, "userId2", "name2", "password2"),
                new Member(3, "userId3", "name3", "password3")
        );

        // when
        List<Member> result = repository.findAll();

        // then
        // TODO - usingRecursiveComparison() 사용하지 않고 요소 별로 비교하기
        assertThat(result).usingRecursiveComparison().isEqualTo(members);
    }
}
