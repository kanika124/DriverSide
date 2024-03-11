package com.railword.cabService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.railword.cabService.entity.Slot;

public interface SlotRepository extends JpaRepository<Slot, String> {

}
