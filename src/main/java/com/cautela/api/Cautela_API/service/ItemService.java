package com.cautela.api.Cautela_API.service;

import com.cautela.api.Cautela_API.adapter.ItemAdapter;
import com.cautela.api.Cautela_API.controller.request.ItemRequest;
import com.cautela.api.Cautela_API.controller.response.ItemResponse;
import com.cautela.api.Cautela_API.repository.ItemRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;
    private final ItemAdapter itemAdapter;


    public List<ItemResponse> listAll(){
        return itemRepository.findAll().stream().map(itemAdapter::toItemResponse).collect(Collectors.toList());
    }

    public ItemResponse save(ItemRequest itemRequest){
        var item = itemAdapter.toItem(itemRequest);
        return itemAdapter.toItemResponse(itemRepository.save(item));
    }

    public void delete(long id){
        var item = itemRepository.findById(id).orElseThrow(()-> new RuntimeException("Item não encontrado"));
        itemRepository.delete(item);
    }
}
