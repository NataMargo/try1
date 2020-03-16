package com.company;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class Translator {
    private Map<String, String> vocabulary = new HashMap<String, String>();

    private String answer = "";

    public void put(String eng, String ua) {
        vocabulary.put(eng, ua);
    }

    public String translate(String str) {

        for (String s : str.split(" ")) {
            if (vocabulary.get(s)!=null){
            answer += vocabulary.get(s) + " ";}
        }
        return answer;
    }
}



