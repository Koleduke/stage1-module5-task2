package com.epam.mjc;

import java.util.LinkedList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return new Operation<Integer>() {
            @Override
            public List<Integer> apply(List<Integer> arg) {
                List<Integer> list = new LinkedList<>();
                for (int i =0; arg.size()>i;i++){
                    list.add(arg.get(i)/divider);
                }
                return list;
            }
        };
    }
}
