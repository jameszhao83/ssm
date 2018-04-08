package com.james.ssm.po;

import java.util.List;

public class ItemsQueryVo {
    private Items items;

    private ItemsCustom itemsCustom;

    private List<ItemsCustom> itemsCustoms;

    public List<ItemsCustom> getItemsCustoms() {
        return itemsCustoms;
    }

    public void setItemsCustoms(List<ItemsCustom> itemsCustoms) {
        this.itemsCustoms = itemsCustoms;
    }

    public ItemsCustom getItemsCustom() {
        return itemsCustom;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public void setItemsCustom(ItemsCustom itemsCustom) {
        this.itemsCustom = itemsCustom;
    }

    public Items getItems() {

        return items;
    }

}
