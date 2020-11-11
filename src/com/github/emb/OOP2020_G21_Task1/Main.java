package com.github.emb.OOP2020_G21_Task1;

import com.github.emb.OOP2020_G21_Task1.tubes.Connectable;
import com.github.emb.OOP2020_G21_Task1.tubes.Diameter;
import com.github.emb.OOP2020_G21_Task1.tubes.nodes.Adapter;
import com.github.emb.OOP2020_G21_Task1.tubes.nodes.Muf1In2Outs;
import com.github.emb.OOP2020_G21_Task1.services.PlumbingService;
import com.github.emb.OOP2020_G21_Task1.tubes.nodes.Stock;

public class Main {

    /*
    Муфты, переходники
    Входная труба
    Канализационная труба
    длина труб не более трёх метров
    развилки

    Через графы

    Проверить валидность трубопроводной системы
    */

    /**
    List<? extends Connectable> list = new LinkedList<Tube>(); // Правильно
    List<Connectable> list = new LinkedList<Tube>(); // Неправильно
     */

    public static void main(String[] args) {
        PlumbingService plumbingService = new PlumbingService() {
            @Override
            public void init() {
                Stock stock = new Stock();
                Muf1In2Outs muf1In2Outs = new Muf1In2Outs();
                Adapter adapter15to25 = new Adapter(Diameter.$15MM, Diameter.$25MM);

                connect(stock, muf1In2Outs, 0, 0);
                connect(muf1In2Outs, adapter15to25, 0, 0);
                connect(adapter15to25, stock, 0, 0);
            }
        };
        plumbingService.init();
    }

    private void printState(Connectable c) {
        //System.out.println(c.ge);
    }
}
