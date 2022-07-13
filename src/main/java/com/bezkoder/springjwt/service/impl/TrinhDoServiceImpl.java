package com.bezkoder.springjwt.service.impl;

import com.bezkoder.springjwt.models.TrinhDo;
import com.bezkoder.springjwt.repository.TrindoRepository;
import com.bezkoder.springjwt.service.TrinhDoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class TrinhDoServiceImpl implements TrinhDoService {

    private final TrindoRepository trindoRepository;

    @Override
    public TrinhDo saveTrinhDo(TrinhDo trinhDo) {
        log.info("save user "+ trinhDo.getName());
        trindoRepository.save(trinhDo);
        return null;
    }

    @Override
    public List<TrinhDo> getList() {
        return trindoRepository.findAll();
    }
}
