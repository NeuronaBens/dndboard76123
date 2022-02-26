package com.dndboard.rest;

import com.dndboard.dao.BoardDAO;
import com.dndboard.model.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/board")
public class BoardController {
    @Autowired
    private BoardDAO boardDAO;

    @CrossOrigin(origins = "https://dndboard76123-frontend.herokuapp.com")
    @PostMapping
    public void CreateBoard(@RequestBody Board board){
        boardDAO.save(board);
    }

    @CrossOrigin(origins = "https://dndboard76123-frontend.herokuapp.com")
    @GetMapping
    public List<Board> GetBoard(){
        return boardDAO.findAll();
    }

    @CrossOrigin(origins = "https://dndboard76123-frontend.herokuapp.com")
    @DeleteMapping("/{id}")
    public void DeleteBoard(@PathVariable("id") Integer id){
        boardDAO.deleteById(id);
    }

    @CrossOrigin(origins = "https://dndboard76123-frontend.herokuapp.com")
    @PutMapping
    public void UpdateBoard(@RequestBody Board board){
        boardDAO.save(board);
    }
}
