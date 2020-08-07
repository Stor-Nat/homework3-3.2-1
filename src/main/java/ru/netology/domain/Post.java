package ru.netology.domain;

// файл Post.java
public class Post {
    private int id;           //идентификатор записи
    private int ownerId;      // идентификатор владельца стены
    private String fromId;    // id кто оставил запись
    private int date;         // дата опубликования
    private String text;      // текст статьи
    private String copyright; // источник статьи
    private int countLike;    // счетчик лайков
    private int countComments; // счетчик комментариев
    private int countRepost;  // счетчик репостов
    private int countView;    // кол-во просмотров

    private CommentsInfo commentsInfo;  //

    // + get/set на все поля
}
