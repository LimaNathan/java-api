package com.cautela.api.Cautela_API.controller.response;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemResponse {
    private Long id;
    private String name;

}
