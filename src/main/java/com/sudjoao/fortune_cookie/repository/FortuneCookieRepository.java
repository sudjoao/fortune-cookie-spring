package com.sudjoao.fortune_cookie.repository;

import com.sudjoao.fortune_cookie.models.domain.FortuneCookie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FortuneCookieRepository extends JpaRepository<FortuneCookie, Long> {
}
