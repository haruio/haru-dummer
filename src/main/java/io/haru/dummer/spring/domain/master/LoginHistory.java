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
public class LoginHistory extends CommonDomain {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String loginType;

    @Column(nullable = false)
    private Long userId;

    @Column(length = 1000)
    private String userAgent;

    @Column(length = 100)
    private String ip;

}
