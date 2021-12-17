package com.zhh.mps;

import com.zhh.spf.Parse;
import com.zhh.spf.ParseManager;
import com.zhh.spf.Song;

/**
 * @auth zhh
 * @date 2021/12/17
 */
public class MpsParse implements Parse {

    static {
        ParseManager.registerParse(new MpsParse());
    }

    @Override
    public Song parse(byte[] msg) {
        return null;
    }
}
