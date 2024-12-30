package org.example;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.example.domain.AbstractEntity;

@Entity
@Getter
@Setter
public class LanguageEntity extends AbstractEntity {

	private String code;

}
