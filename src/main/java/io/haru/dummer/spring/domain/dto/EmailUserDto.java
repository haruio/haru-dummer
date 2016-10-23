package io.haru.dummer.spring.domain.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Justin Park (asterisk@makeus.com)
 * @since 2016-10-18
 */
@Data
public class EmailUserDto extends UserDto {
    @NotEmpty
    private String email;

    @NotEmpty
    private String pw;
}
