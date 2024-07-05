package com.ohgiraffers.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class BoardDTO {

    private Long id;
    private String title;
    private String content;
    private MemberDTO writer;
}
