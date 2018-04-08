package com.james.ssm.mapper;

import com.james.ssm.po.ItemsCustom;
import com.james.ssm.po.ItemsQueryVo;

import java.util.List;

public interface ItemsCustomMapper {

    public List<ItemsCustom> queryItemList(ItemsQueryVo itemsQueryVo);

    public List<ItemsCustom> queryByItemName(ItemsQueryVo itemsQueryVo);


}
