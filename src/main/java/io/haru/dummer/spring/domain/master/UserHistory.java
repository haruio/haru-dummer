package io.haru.dummer.spring.domain.master;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Justin Park (aka.asterisk@gmail.com)
 * @since 2016-09-05
 */
@Data
@Entity
public class UserHistory extends CommonDomain {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;

    @Column(length = 50, nullable = false)
    private String username;

    @Column(length = 3, nullable = false)
    private String userStatusCode;

    @Column(length = 3, nullable = false)
    private String loginTypeCode;

    @Column(length = 50)
    private String email;

    @Column(length = 50)
    private String pw;

    @Column(length = 100)
    private String accessToken;

    @Column(length = 100)
    private String refreshToken;
}
