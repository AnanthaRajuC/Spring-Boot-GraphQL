package io.github.anantharajuc.sbgql.domain.model.person;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import io.github.anantharajuc.sbgql.domain.model.common.AuditEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="books")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@FieldDefaults(level=AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Books extends AuditEntity
{
	private static final long serialVersionUID = 1L;
	
	@Column(name="title", nullable = false)
    private String title;
}