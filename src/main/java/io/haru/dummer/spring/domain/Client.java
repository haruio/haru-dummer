package io.haru.dummer.spring.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Justin Park (aka.asterisk@gmail.com)
 * @since 2016-07-19
 */
@Data
@Entity
public class Client {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;

    @Column(length = 50)
    private String appId;

    @Column(length = 50)
    private String appSecret;

    // client application 등록을 위한 기타 정보
}
