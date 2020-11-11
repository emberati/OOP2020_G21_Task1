package com.github.emb.OOP2020_G21_Task1.tubes.nodes;

import com.github.emb.OOP2020_G21_Task1.tubes.Connection;
import com.github.emb.OOP2020_G21_Task1.tubes.DefaultConnectable;
import com.github.emb.OOP2020_G21_Task1.tubes.Diameter;

public abstract class Tube extends DefaultConnectable {
    public Tube(Diameter diameterIn, Diameter diameterOut) {
        super(1, 1);
        ins.add(new Connection(diameterIn, this));
        outs.add(new Connection(diameterOut, this));
    }
}