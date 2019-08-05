package com.arno.springboot.service.impl;


import com.arno.springboot.dao.domain.MusicInfo;
import com.arno.springboot.dao.mapper.MusicInfoMapper;
import com.arno.springboot.service.MusicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicInfoServiceImpl  implements MusicInfoService {

    @Autowired
    private MusicInfoMapper musicInfoMapper;

    @Override
    public List<MusicInfo> getMusicInfo(MusicInfo musicInfo) {
        List<MusicInfo> musicInfos = musicInfoMapper.selectAll(null);
        return musicInfos;
    }
}