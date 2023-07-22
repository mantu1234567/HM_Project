package com.geekster.Hotelmanagement_practies.service;

import com.geekster.Hotelmanagement_practies.model.HotelRoom;
import com.geekster.Hotelmanagement_practies.model.TYPE;
import com.geekster.Hotelmanagement_practies.repository.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    RoomRepo roomRepo;

    public String addRooms(List<HotelRoom> hotelRooms) {
        roomRepo.saveAll(hotelRooms);
        return "add rooms done";
    }

    public Iterable<HotelRoom> findAllRooms() {
        return roomRepo.findAll();
    }

    public HotelRoom getById(Long id) {
        return roomRepo.findFirstByRoomId(id);
    }

    public boolean exitRoom(Long id) {
        return roomRepo.existsById(id);
    }

    public String updatedRoom(Long id) {
        HotelRoom room = roomRepo.findFirstByRoomId(id);
        room.setRoomNumber(239);
        room.setRoomStatus(false);
        room.setRoomType(TYPE.NON_AC);
        roomRepo.save(room);
       return "updated done";
    }

    public Long getTotalRooms() {
        return roomRepo.count();
    }

    public List<HotelRoom> getRoomsByStatus(Boolean status) {
        return roomRepo.findAllByRoomStatus(status);
    }

    public List<HotelRoom> getRoomsByStatusAndType(Boolean status, TYPE type) {
        return roomRepo.findByRoomStatusAndRoomType(status,type);
    }

    public List<HotelRoom> getRoomsByStatusAndTypeAndPrice(Boolean status, TYPE type, Double lLimit, Double uLimit) {
        return roomRepo.findByRoomStatusAndRoomTypeAndRoomPriceGreaterThanAndRoomPriceLessThan(status,type,lLimit,uLimit);
    }


    public String deleteRoomById(Long id) {
        roomRepo.deleteById(id);
        return "delete Room";
    }
}
