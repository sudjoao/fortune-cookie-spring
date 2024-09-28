package com.sudjoao.fortune_cookie.models.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "fortune_cookies")
public class FortuneCookie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String phrase;
    int luckyNumber;
    ColorEnum luckyColor;

    public Long getId() {
        return id;
    }

    public String getPhrase() {
        return phrase;
    }

    public int getLuckyNumber() {
        return luckyNumber;
    }

    public ColorEnum getLuckyColor() {
        return luckyColor;
    }
}
