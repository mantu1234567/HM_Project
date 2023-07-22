package com.geekster.Hotelmanagement_practies.controller;

import com.geekster.Hotelmanagement_practies.model.HotelRoom;
import com.geekster.Hotelmanagement_practies.model.TYPE;
import com.geekster.Hotelmanagement_practies.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    RoomService roomService;

    // Add room in hotel
    @PostMapping("add/room")

    public String AddRoom(@RequestBody List<HotelRoom> hotelRoom){
        return roomService.addRooms(hotelRoom);
    }

    @GetMapping("find/hotelRoom")
    public Iterable<HotelRoom> findAllRooms(){
        return roomService.findAllRooms();
    }
    // get particular room by id
    @GetMapping("get/by/Id/{Id}")
    public HotelRoom getById(@PathVariable Long Id){
        return roomService.getById(Id);
    }

    // Room exit or not
    @GetMapping("exit/room/{Id}")
    public boolean exitRoom(@PathVariable Long Id){
        return roomService.exitRoom(Id);
    }
    @PutMapping("update/room/{Id}")
    public String updatedRoom(@PathVariable Long Id){
        return roomService.updatedRoom(Id);
    }
    // total number of room present
    @GetMapping("rooms/count")
    public Long getTotalRooms(){
        return roomService.getTotalRooms();
    }

    @GetMapping("rooms/status/{status}")
    public List<HotelRoom> getRoomsByStatus(@PathVariable Boolean status)
    {
        return roomService.getRoomsByStatus(status);
    }
    @GetMapping("rooms/status/{status}/type/{type}")
    public List<HotelRoom> getRoomsByStatusAndType(@PathVariable Boolean status,@PathVariable TYPE type)
    {
        return roomService.getRoomsByStatusAndType(status,type);
    }

    @GetMapping("rooms/status/{status}/type/{type}/priceRange")
    public List<HotelRoom> getRoomsByStatusAndTypeAndPrice(@PathVariable Boolean status,@PathVariable TYPE type, @RequestParam Double lLimit, @RequestParam Double uLimit)
    {
        return roomService.getRoomsByStatusAndTypeAndPrice(status,type,lLimit,uLimit);
    }
    @DeleteMapping("room/{id}")
    public String deleteRoomById(@PathVariable Long id){
        return roomService.deleteRoomById(id);
    }
}
