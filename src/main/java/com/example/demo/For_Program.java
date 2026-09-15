package com.example.demo;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping("/api")
    public class For_Program{

    @GetMapping("/for_block")
    public Map<String, Integer> getOmikuji() {
        // 問題：for文を用いて1を100回足して100を作ってみよう！（変数はnumber1つでできます！）
        int number = 0;

        for(int i=0; i<100;i++){
            number = number+1;
        }
        return Map.of("result", number);
    }
}
