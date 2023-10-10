package com.no3.game.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

//    private final ItemService itemService;

    @GetMapping(value = "/")
    public String main(/*ItemSearchDto itemSearchDto, Optional<Integer> page, Model model*/){

//        Pageable pageable = PageRequest.of(page.isPresent() ? page.get() : 0, 6);
//        Page<MainItemDto> items = itemService.getMainItemPage(itemSearchDto, pageable);
//
//        model.addAttribute("items", items);
//        model.addAttribute("itemSearchDto", itemSearchDto);
//        model.addAttribute("maxPage", 5);

        return "main";
    }

}