package com.bezkoder.springjwt.service;

import com.bezkoder.springjwt.models.TrinhDo;

import java.util.List;

public interface TrinhDoService {
    TrinhDo saveTrinhDo(TrinhDo trinhDo);

    List<TrinhDo> getList();

}
