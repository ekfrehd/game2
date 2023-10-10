package com.no3.game.repository;


import com.no3.game.constant.Role;
import com.no3.game.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.stream.IntStream;

@SpringBootTest
public class MemberRepositoryTests {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Test
    public void insertMembers() {

        IntStream.rangeClosed(1, 100).forEach(i -> {

            Member member = Member.builder()
                    .email("user" + i + "@aaa.com")
                    .password(passwordEncoder.encode("11111111"))
                    .name("USER" + i)
                    .role(Role.ADMIN)
                    .build();

            memberRepository.save(member);
        });
    }
}