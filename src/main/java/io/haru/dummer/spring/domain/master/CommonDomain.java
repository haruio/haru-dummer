package io.haru.dummer.spring.domain.master;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Justin Park (aka.asterisk@gmail.com)
 * @since 2016-08-27
 */
@Data
@MappedSuperclass
public class CommonDomain {
    @Column
    protected Long createdBy;

    @Column(insertable = true, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date createdAt;

    @Column
    protected Long updatedBy;

    @Column(insertable = false, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date updatedAt;

    @PrePersist
    protected void createdAt() {
        this.createdAt = this.updatedAt = new Date();
    }

    @PreUpdate
    protected void updatedAt() {
        this.updatedAt = new Date();
    }
}
