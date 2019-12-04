package com.oyfz.service.impl;


import com.oyfz.dao.ItemsDao;
import com.oyfz.domain.Items;
import com.oyfz.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemsDao itemsDao;

    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
