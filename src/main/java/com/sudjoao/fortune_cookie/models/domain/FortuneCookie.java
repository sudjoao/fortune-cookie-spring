package com.sudjoao.fortune_cookie.models.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "fortune_cookies")
public class FortuneCookie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String phrase;
    Number luckyNumber;
    ColorEnum luckyColor;
}
