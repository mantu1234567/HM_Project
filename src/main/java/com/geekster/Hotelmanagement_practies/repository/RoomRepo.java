package com.geekster.Hotelmanagement_practies.repository;

import com.geekster.Hotelmanagement_practies.model.HotelRoom;
import com.geekster.Hotelmanagement_practies.model.TYPE;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepo extends CrudRepository<HotelRoom,Long> {
    HotelRoom findFirstByRoomId(Long id);

    List<HotelRoom> findAllByRoomStatus(Boolean status);

    List<HotelRoom> findByRoomStatusAndRoomType(Boolean status, TYPE type);


    List<HotelRoom> findByRoomStatusAndRoomTypeAndRoomPriceGreaterThanAndRoomPriceLessThan(Boolean status, TYPE type, Double lLimit, Double uLimit);

    void deleteByRoomId(Integer id);
}
