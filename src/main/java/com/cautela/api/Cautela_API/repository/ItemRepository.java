package com.cautela.api.Cautela_API.repository;

import com.cautela.api.Cautela_API.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
