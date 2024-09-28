package com.sudjoao.fortune_cookie.services;

import com.sudjoao.fortune_cookie.models.dto.FortuneCookieDTO;
import com.sudjoao.fortune_cookie.repository.FortuneCookieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.Cookie;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class FortuneCookieService {
    @Autowired
    private FortuneCookieRepository fortuneCookieRepository;

    public FortuneCookieDTO getRandomFortuneCookie() {
        Random random = new Random();
        int randomNumber = random.nextInt((int) fortuneCookieRepository.count()) + 1;
        var cookie = fortuneCookieRepository.findById(Long.valueOf(randomNumber));
        return cookie.map(FortuneCookieDTO::fromDomain).orElse(null);
    }

    public void createFortuneCookie(FortuneCookieDTO fortuneCookieDTO) {
        fortuneCookieRepository.save(fortuneCookieDTO.toDomain());
    }
}
