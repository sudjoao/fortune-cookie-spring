package com.sudjoao.fortune_cookie.models.dto;

import com.sudjoao.fortune_cookie.models.domain.ColorEnum;
import com.sudjoao.fortune_cookie.models.domain.FortuneCookie;

public record FortuneCookieDTO(String phrase, int luckyNumber, ColorEnum luckyColor) {
    public static FortuneCookieDTO fromDomain(FortuneCookie cookie) {
        return new FortuneCookieDTO(cookie.getPhrase(), cookie.getLuckyNumber(), cookie.getLuckyColor());
    }
}
