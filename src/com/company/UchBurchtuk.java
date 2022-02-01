package com.company;

public class UchBurchtuk {
//     Уч бурчтук деген класс тузунуз.
//     Класстын 3 полеси болсун a, b, c.
//     Класстын "area" деген методу болсун.
//     "area" методу полелериндеги маалыматтарга(маалымат объектти тузгондон кийин берилет)
//     таянып консолго уч бурчтуктун аянтын чыгарсын.
    int a;
    int b;
    int c;


    void area(){
        int p =(a+b+c)/2;
        System.out.println("Uchburchtuktun P:"+p);
        System.out.println("Uchburchtuktun S:"+Math.round(Math.sqrt(p*(p-a)*(p-b)*(p-c))));
    }
}
