package io.haru.dummer.spring.domain.master;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Justin Park (aka.asterisk@gmail.com)
 * @since 2016-07-19
 */
@Data
@Entity
public class ClientAuth extends CommonDomain {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private Long clientId;

    @Column(length = 100, nullable = false)
    private String accessToken;

    @Column(length = 100, nullable = false)
    private String refreshToken;

    @Lob
    private String scopes;
}
