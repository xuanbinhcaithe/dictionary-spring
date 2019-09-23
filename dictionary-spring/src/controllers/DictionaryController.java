package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/")
    public String dictionaryForm() {
        return "index";
    }
    @PostMapping("/Search")
    public String search(@RequestParam String word, Model model) {
        Map<String,String> dic = new HashMap<>();
        dic.put("hello","xin chào");
        dic.put("dog","chó");
        dic.put("cat","mèo");
        dic.put("how","thế nào");

        String result = dic.get(word.toLowerCase());
        if (result == null) {
            model.addAttribute("result","Not found");
        }else {
            model.addAttribute("result",result);
        }
        return "index";

    }

}