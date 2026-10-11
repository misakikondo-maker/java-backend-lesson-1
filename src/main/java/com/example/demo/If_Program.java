package com.example.demo;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")

public class If_Program {

    @GetMapping("/if_brock")
    public Map<String, String> checkNumber(@RequestParam("num") int num) {
        
        // 画面に表示するメッセージの初期値
        String resultMessage = "不正解"; 
        
        //問題1：ここをご自身のお名前、思いついた人の名前に変えましょう！
        String myName = "自分の名前"; 
        String anotherName = "思いついた人の名前";

        //問題2：もし数値(num)が「25以上」だったら(numは宣言不要です。)、
        // String型のresultMessage（不正解） を myName(ご自身のお名前)に25以下だったらanotherName上書きするif文を完成させましょう！25以下でない場合は、思いついた人の名前を入れましょう。
        //画面に不正解以外の文字列が出たら次の問題へ行けます！
        // ↓ ここのコメントアウト（/**/）を外してコードを書く
        /* 
        if () 
        {
          
        }else
        {

        }
        */
        return Map.of("result", resultMessage);
    }
}