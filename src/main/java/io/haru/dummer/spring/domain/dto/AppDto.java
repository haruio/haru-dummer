package io.haru.dummer.spring.domain.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Justin Park (asterisk@makeus.com)
 * @since 2016-10-22
 */
@Data
public class AppDto {

    private Long id;

    @NotEmpty
    private String clientName;

    private String thumbnailUrl;

    private String privacyUrl;

    private String termsUrl;

    private String appCategoryCode;

    private String authorities;

    private String scopes;

    private String redirectUris;

    private String others;
}
