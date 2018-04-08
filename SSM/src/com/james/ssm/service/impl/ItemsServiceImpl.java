package com.james.ssm.service.impl;

import com.james.ssm.mapper.ItemsCustomMapper;
import com.james.ssm.mapper.ItemsMapper;
import com.james.ssm.po.Items;
import com.james.ssm.po.ItemsCustom;
import com.james.ssm.po.ItemsQueryVo;
import com.james.ssm.service.ItemsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ItemsServiceImpl  implements ItemsService {
    @Autowired
    private ItemsCustomMapper itemsMapperCustom;
    @Autowired
    private ItemsMapper itemsMapper;
    @Override
    public List<ItemsCustom> queryItemList(ItemsQueryVo itemsQueryVo) {
        return itemsMapperCustom.queryItemList(itemsQueryVo);
    }

    @Override
    public void updateItems(ItemsCustom itemsCustom) {

        itemsMapper.updateItems(itemsCustom);
    }

    @Override
    public ItemsCustom findItemsById(Integer id) {
        Items items=itemsMapper.findItemsById(id);
        ItemsCustom  itemsCustom=new ItemsCustom();
        BeanUtils.copyProperties(items,itemsCustom);
        return  itemsCustom;
    }

    @Override
    public void saveItem(ItemsCustom itemsCustom) {
        itemsMapper.saveItem(itemsCustom);

    }

    @Override
    public void itemsBatchUpdateSave(List<ItemsCustom> itemsCustoms) {
        for(ItemsCustom itemsCustom:itemsCustoms){
            itemsMapper.updateItems(itemsCustom);
        }
    }


}
