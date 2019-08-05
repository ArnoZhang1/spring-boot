package com.arno.springboot.service;

import com.arno.springboot.dao.domain.MusicInfo;

import java.util.List;

public interface MusicInfoService {

    public List<MusicInfo> getMusicInfo(MusicInfo musicInfo);
}