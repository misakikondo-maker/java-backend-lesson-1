package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api")

public class Fainal {

   @GetMapping("/final")
    public Map<String, Integer> add_number() {
     int[] number_box = new int[]{42, 873, 15, 624, 91, 305, 518, 76, 239, 942,
    18, 456, 789, 23, 671, 104, 882, 347, 59, 713,
    56, 921, 334, 8, 492, 615, 27, 836, 149, 705,
    98, 512, 743, 65, 281, 907, 439, 14, 658, 320,
    37, 854, 192, 760, 43, 589, 217, 935, 68, 471,
    89, 634, 25, 781, 156, 940, 312, 87, 503, 726,
    64, 419, 865, 31, 572, 98, 245, 809, 137, 694,
    72, 358, 914, 50, 627, 183, 746, 29, 531, 860,
    11, 482, 709, 93, 365, 824, 170, 596, 45, 953,
    83, 297, 641, 12, 510, 788, 326, 95, 467, 812};

        int result = 0;

     // 問題：for文とif文を使って、number_box[i]に100個入っている最大値を求めてみよう！求めた最大値はresultに入れてください！number[0]には42,number[1]には873、、、、、が入っているよ！
    /* 
        
        */
        return Map.of("result", result);
    }
}

