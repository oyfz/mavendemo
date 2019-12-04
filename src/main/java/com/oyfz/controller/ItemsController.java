package com.oyfz.controller;

import com.oyfz.domain.Items;
import com.oyfz.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/findDetail")
    public String findDetail(Model model) {
		System.out.println("/itemss/findDetail");
        Items items = itemService.findById(1);
        model.addAttribute("item", items);
        return "itemDetail";
    }
}
