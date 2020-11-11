package com.github.emb.OOP2020_G21_Task1.tubes;

import linkedlistlib.LinkedList;
import linkedlistlib.AlternateList;

public abstract class DefaultConnectable implements Connectable {
    public final int INPUTS;
    public final int OUTPUTS;

    protected final AlternateList<Connection> ins;
    protected final AlternateList<Connection> outs;

    protected DefaultConnectable(int maxIns, int maxOuts) {
        INPUTS = maxIns;
        OUTPUTS = maxOuts;
        ins = new LinkedList<>();
        outs = new LinkedList<>();
    }

    @Override
    public void setIn(Connection in, int indexIn) {
        if (indexIn < INPUTS && ins.size() <= INPUTS) {
            System.out.println("Соединено со входом " + (ins.size() - 1) + "\nУказанный вход: " + indexIn);
            ins.get(indexIn).setConnection(in);
        } else {
            throw new IndexOutOfBoundsException("У этого узла не может быть больше " + INPUTS + " входов!");
        }
    }

    @Override
    public void setOut(Connection out, int indexOut) {
        if (indexOut < OUTPUTS && outs.size() <= OUTPUTS) {
                System.out.println("Соединено с выходом " + (outs.size() - 1) + "\nУказанный выход: " + indexOut);
                outs.get(indexOut).setConnection(out);
        } else {
            throw new IndexOutOfBoundsException("У этого узла не может быть больше " + OUTPUTS + " выходов!");
        }
    }

    @Override
    public Connection getOut(int out) {
        return outs.get(out);
    }

    @Override
    public Connection getIn(int in) {
        return ins.get(in);
    }

    @Override
    public Diameter getDiameterOut(int out) {
        return outs.get(out).DIAMETER;
    }

    @Override
    public Diameter getDiameterIn(int in) {
        return ins.get(in).DIAMETER;
    }

    public int getCountOfInputs() {
        return ins.size();
    }

    public int getCountOfOutputs() {
        return outs.size();
    }
}
