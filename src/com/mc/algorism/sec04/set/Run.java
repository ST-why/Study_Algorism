package com.mc.algorism.sec04.set;

import com.mc.algorism.sec04.dto.School;

public class Run {

    public static void main(String[] args) {

        School seoulUniv = new School("서울대", "관악구", "대학교");
        School yeonsaeUniv = new School("연세대", "서울", "대학교");
        School minsa = new School("민사고", "대전", "고등학교");
        School multicampus = new School("멀티캠퍼스", "역삼", "아카데미");

        _HashSet_P3<School> set = new _HashSet_P3<>();
        set.add(seoulUniv);
        set.add(yeonsaeUniv);
        set.add(minsa);
        set.add(multicampus);

        System.out.println("========================");

        for(School univ : set){
            System.out.println(univ);
        }
    }
}
