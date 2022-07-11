package com.cautela.api.Cautela_API.controller;

import com.cautela.api.Cautela_API.controller.request.ItemRequest;
import com.cautela.api.Cautela_API.controller.response.ItemResponse;
import com.cautela.api.Cautela_API.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("itens")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @GetMapping
    public ResponseEntity<List<ItemResponse>> listAll(){
        return ResponseEntity.ok(itemService.listAll());

    }

    @PostMapping
    public ResponseEntity<ItemResponse> save(@RequestBody ItemRequest itemRequest){
        return new ResponseEntity<>(itemService.save(itemRequest), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        itemService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping(path = "/{id}")
    public  ResponseEntity<Void> put(@PathVariable Long id){
        return  null;
    }


}
