package com.sudjoao.fortune_cookie.controllers;

import com.sudjoao.fortune_cookie.models.dto.FortuneCookieDTO;
import com.sudjoao.fortune_cookie.services.FortuneCookieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cookie")
public class FortuneCookieController {
    @Autowired
    FortuneCookieService fortuneCookieService;

    @GetMapping
    FortuneCookieDTO getCookie() {
        return fortuneCookieService.getRandomFortuneCookie();
    }

    @PostMapping
    public ResponseEntity<String> createCookie(@RequestBody FortuneCookieDTO fortuneCookieDTO) {
        fortuneCookieService.createFortuneCookie(fortuneCookieDTO);
        return ResponseEntity.ok("Created.");
    }

}
