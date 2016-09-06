package io.haru.dummer.spring.domain.master;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Justin Park (aka.asterisk@gmail.com)
 * @since 2016-07-19
 */
@Data
@Entity
public class Client extends CommonDomain {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;

    @Column(length = 50)
    private String clientId;

    @Column(length = 50)
    private String clientSecret;

    @Column(length = 100)
    private String clientName;

    @Column(length = 300)
    private String thumbnailUrl;

    @Column(length = 300)
    private String privacyUrl;

    @Column(length = 300)
    private String termsUrl;

    @Column(length = 10)
    private String appCategoryCode;

    @Lob
    private String authorities;

    @Lob
    private String scopes;

    @Lob
    private String redirectUris;

    // client application 등록을 위한 기타 정보
    @Lob
    private String others;
}
