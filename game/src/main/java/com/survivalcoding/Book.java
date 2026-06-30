package com.survivalcoding;

import java.util.*;

public class Book extends TangibleAsset {
//    다음 동작을 할 수 있도록 Book 클래스를 수정하시오.
//
//    제목과 출간일(예: 2024-01–01)이 같으면 같은 책으로 판단한다. 또한 List, Map, Set 등의 컬렉션에 넣어도 동일 객체로 판단한다.
//    Book 인스턴스를 담고 있는 컬렉션에 대해 Colections.sort() 를 사용하면 출간일이 신상 순서대로 정렬된다.
//    clone() 메서드를 제공하고, 깊은 복사를 수행한다.

    private String isbn;
    private String title;
    private Date publishDate;
    private String comment;
    Set<Book> book = new HashSet<>();

    private int bookCount = 0;

    public void book(String title, Date publishDate, String comment) {

        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;


    }

    @Override
    public boolean equals(Objects o) {
        return false;
    }

    @Override
    public int hashCode(Objects o) {
        int result = Object.hashCode(Book);
        result = 31 * result;

        return result;
    }

    public void bookSort() {


        Collections.sort();
    }
    //getter

    //setter
//    public Book(String name, int price, String color, double weight, String assetType, String isbn) {
//        setName(name);
//        setPrice(price);
//        setColor(color);
//        setWeight(weight);
//        setAssetType(assetType);
//        this.isbn = isbn;
//    }
//
//    public String getIsbn() {
//        return isbn;
//    }
//
//    public void setIsbn(String isbn) {
//        this.isbn = isbn;
//    }
}

