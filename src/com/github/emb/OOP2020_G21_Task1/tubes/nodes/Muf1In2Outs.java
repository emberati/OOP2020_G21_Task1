package com.github.emb.OOP2020_G21_Task1.tubes.nodes;

import com.github.emb.OOP2020_G21_Task1.tubes.Connection;
import com.github.emb.OOP2020_G21_Task1.tubes.Diameter;

public class Muf1In2Outs extends Muff {
    public Muf1In2Outs() {
        super(1, 2);
        ins.add(new Connection(Diameter.$25MM, this));
        outs.add(new Connection(Diameter.$15MM, this));
        outs.add(new Connection(Diameter.$15MM, this));
    }
}
