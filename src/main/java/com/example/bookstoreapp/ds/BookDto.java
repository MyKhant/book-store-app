package com.example.bookstoreapp.ds;

import com.example.bookstoreapp.entity.Author;
import com.example.bookstoreapp.entity.Category;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
public class BookDto {
    private int id;
    private String title;
    private LocalDate yearPublished;
    private String publisher;
    private double price;
    private int quantity;
    private String genre;
    private String imgUrl;
    private String description;
    private Category category;
    private int orderBookQuantity;

    private List<Integer> itemList=
            new ArrayList<>();
    private Author author;
    public BookDto(){}

    public BookDto(int id, String title, LocalDate yearPublished, String publisher, double price, int quantity, String genre, String imgUrl, String description, Category category, Author author) {
        this.id = id;
        this.title = title;
        this.yearPublished = yearPublished;
        this.publisher = publisher;
        this.price = price;
        this.quantity = quantity;
        this.genre = genre;
        this.imgUrl = imgUrl;
        this.description = description;
        this.category = category;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookDto bookDto)) return false;
        return id == bookDto.id && title.equals(bookDto.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", yearPublished=" + yearPublished +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", orderBookQuantity="+ orderBookQuantity +
                '}';
    }
}
