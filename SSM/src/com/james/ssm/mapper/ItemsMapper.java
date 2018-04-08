package com.james.ssm.mapper;

import com.james.ssm.po.Items;
import com.james.ssm.po.ItemsCustom;
import com.james.ssm.po.ItemsQueryVo;

import java.util.List;

public interface ItemsMapper {
    public List<ItemsCustom> queryItemList(ItemsQueryVo itemsQueryVo);
    public void  updateItems(ItemsCustom itemsCustom);
    public Items  findItemsById(Integer id);
    public void saveItem(ItemsCustom itemsCustom);
}
