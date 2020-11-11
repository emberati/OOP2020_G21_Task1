package com.github.emb.OOP2020_G21_Task1.tubes.objnodes;

import com.github.emb.OOP2020_G21_Task1.tubes.Connection;
import com.github.emb.OOP2020_G21_Task1.tubes.DefaultConnectable;
import com.github.emb.OOP2020_G21_Task1.tubes.Diameter;

public class Toilet extends DefaultConnectable {
    protected Toilet(Diameter in, Diameter out) {
        super(1, 1);
        ins.add(new Connection(Diameter.$15MM, this));
        outs.add(new Connection(Diameter.$15MM, this));
    }
}
