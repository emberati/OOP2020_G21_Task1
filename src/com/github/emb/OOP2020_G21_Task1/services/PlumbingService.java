package com.github.emb.OOP2020_G21_Task1.services;

import com.github.emb.OOP2020_G21_Task1.tubes.Connectable;

public abstract class PlumbingService {

    public final void connect(Connectable c0, Connectable c1, int out, int in) {
        if (c0.getDiameterOut(out) == c1.getDiameterIn(in)) {
            System.out.println(c0.getDiameterOut(out));
            System.out.println(c1.getDiameterIn(in));
            c0.setOut(c1.getIn(in), out);
            c1.setIn(c0.getOut(out), in);
        } else throw new RuntimeException("Диаметры соединений (выход: " + c0.getDiameterOut(out) + ") и (вход: " + c1.getDiameterIn(in) + ") должны совпадать!");
    }

    public abstract void init();
}
