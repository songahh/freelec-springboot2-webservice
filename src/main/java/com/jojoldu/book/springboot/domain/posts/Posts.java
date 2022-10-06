package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity //테이블과 링크될 클래스
public class Posts extends BaseTimeEntity {
    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK의 생성규칙 GenerationType.IDENTITY --> auto_increment
    private Long id;

    // column, 굳이 선언안해도 클래스의 필드는 다 column이 됨
    // 기본값 외에 추가로 변경이 필요한 옵션이 있을 때 사용
    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
