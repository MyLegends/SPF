package com.zhh.spf;

import lombok.var;

import java.util.ServiceLoader;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @auth zhh
 * @date 2021/12/17
 */
public class ParseManager {

    public static CopyOnWriteArrayList<ParseInfo> serviceLoadList = new CopyOnWriteArrayList<ParseInfo>();

    static {
        initManager();
        System.out.println("parseManagaer init");
    }

    public static void initManager(){
        ServiceLoader<Parse> serviceLoader = ServiceLoader.load(Parse.class);
        var serviceItr = serviceLoader.iterator();
        while (serviceItr.hasNext()){
            Parse parse = serviceItr.next();
            System.out.println(parse);
        }
    }

    public static void registerParse(Parse parse){
        serviceLoadList.add(new ParseInfo(parse));
    }

    public Song parse(byte [] msg){
        for(ParseInfo parseInfo: serviceLoadList){
            Song song = parseInfo.parse.parse(msg);
            return song;
        }
        return null;
    }
}
