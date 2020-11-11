package com.github.emb.OOP2020_G21_Task1.tubes.nodes;

import com.github.emb.OOP2020_G21_Task1.tubes.Connection;
import com.github.emb.OOP2020_G21_Task1.tubes.Diameter;

public class Adapter extends Muff {

    public Adapter(Diameter diamIn, Diameter diamOut) {
        super(1, 1);
        ins.add(new Connection(diamIn, null));
        outs.add(new Connection(diamOut, null));
    }
}
