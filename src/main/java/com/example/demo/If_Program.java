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
        
        //問題1：ここを自分の名前に変えよう！
        String myName = "自分の名前"; 

        // 問題2：もし入力された数値(num)が「25以上」だったら、
        // String型のresultMessage に myName(自分の名前)を上書きするif文を完成させよう！
        //画面に不正解以外の文字列が出たら次の問題へ行けます！
        // ↓ ここのコメントアウト（//）を外してコードを書く
        
        if (num >= 25 ) {
            resultMessage = myName;
        }

        return Map.of("result", resultMessage);
    }
}