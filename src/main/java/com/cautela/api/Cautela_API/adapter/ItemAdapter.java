package com.cautela.api.Cautela_API.adapter;

import com.cautela.api.Cautela_API.controller.request.ItemRequest;
import com.cautela.api.Cautela_API.controller.response.ItemResponse;
import com.cautela.api.Cautela_API.model.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemAdapter {
    public Item toItem(ItemRequest itemRequest){
        return Item.builder().name(itemRequest.getName()).build();
    }

    public ItemResponse toItemResponse(Item item){
        return ItemResponse.builder().id(item.getId()).name(item.getName()).build();
    }
}
