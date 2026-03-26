package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

@Data
public class MemberDto {

    private String username;
    private int age;

    public MemberDto() {
    }

    @QueryProjection //컴파일 오류를 발견해준다.
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
