package io.haru.dummer.spring.domain.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Justin Park (asterisk@makeus.com)
 * @since 2016-10-18
 */
@Data
public class UserDto {

    private Long id;

    @NotEmpty
    private String username;

    private String userStatusCode;

    @NotEmpty
    private String loginTypeCode;
}
