package com.cautela.api.Cautela_API.controller;

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

}
