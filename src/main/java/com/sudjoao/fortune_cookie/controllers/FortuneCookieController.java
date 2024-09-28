package com.sudjoao.fortune_cookie.controllers;

import com.sudjoao.fortune_cookie.models.dto.FortuneCookieDTO;
import com.sudjoao.fortune_cookie.services.FortuneCookieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cookie")
public class FortuneCookieController {
    @Autowired
    FortuneCookieService fortuneCookieService;

    @GetMapping
    FortuneCookieDTO getCookie() {
        return fortuneCookieService.getRandomFortuneCookie();
    }

}
