package io.haru.dummer.spring.domain.master;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Justin Park (aka.asterisk@gmail.com)
 * @since 2016-07-19
 */
@Data
@Entity
public class UserDevice extends CommonDomain {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(length = 3, nullable = false)
    private String userDeviceTypeCode;

    @Column(length = 50)
    private String userDeviceUid;

    @Column(length = 3)
    private String osTypeCode;

    @Column(length = 50)
    private String osVersion;

    @Column(length = 3)
    private String pushTypeCode;

    @Column(length = 100)
    private String pushToken;
}
