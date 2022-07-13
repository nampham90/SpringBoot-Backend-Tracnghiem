package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.models.TrinhDo;
import com.bezkoder.springjwt.service.TrinhDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class CommonController {
    @Autowired
    TrinhDoService trinhDoService;

    @GetMapping("/listtrinhdo")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<?> getListTrinhDo(){
        List<TrinhDo> list= trinhDoService.getList();
        return ResponseEntity.ok(list);
    }

}
