package com.dndboard.dao;

import com.dndboard.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardDAO extends JpaRepository<Board, Integer> {
}
