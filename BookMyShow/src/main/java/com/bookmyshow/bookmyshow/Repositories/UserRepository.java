package com.bookmyshow.bookmyshow.Repositories;

import com.bookmyshow.bookmyshow.Models.SeatStatus;
import com.bookmyshow.bookmyshow.Models.ShowSeat;
import com.bookmyshow.bookmyshow.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
