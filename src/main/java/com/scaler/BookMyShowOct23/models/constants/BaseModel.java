package com.scaler.BookMyShowOct23.models.constants;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class BaseModel {
    @Id // says this is primary key
    @GeneratedValue(strategy = GenerationType.AUTO) // says this is auto generated
    @Column(name="ID") // whenever it will create a column it will give this name
    private int id;
}
