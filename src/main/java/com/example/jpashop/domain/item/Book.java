package com.example.jpashop.domain.item;

import com.example.jpashop.domain.Item;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("B")
public class Book extends Item {
    private String author;
    private String isbn;
}
