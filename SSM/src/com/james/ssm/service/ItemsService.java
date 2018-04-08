package com.james.ssm.service;

import com.james.ssm.po.Items;
import com.james.ssm.po.ItemsCustom;
import com.james.ssm.po.ItemsQueryVo;

import java.util.List;

public interface ItemsService {
    public List<ItemsCustom> queryItemList(ItemsQueryVo itemsQueryVo);
    public void updateItems(ItemsCustom itemsCustom);;
    public ItemsCustom  findItemsById(Integer id);
    public void saveItem(ItemsCustom itemsCustom);
    public void itemsBatchUpdateSave(List<ItemsCustom> itemsCustoms);

}
