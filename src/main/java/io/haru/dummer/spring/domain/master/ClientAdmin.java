package io.haru.dummer.spring.domain.master;

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
public class ClientAdmin extends CommonDomain {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private Long clientId;

    @Column(nullable = false)
    private Long userId;

    @Column(length = 3)
    private String clientAdminTypeCode;
}
