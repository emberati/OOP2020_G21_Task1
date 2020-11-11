
package com.github.emb.OOP2020_G21_Task1.tubes;

public interface Connectable {

    void setIn(Connection in, int indexIn);

    void setOut(Connection out, int indexOut);

    Connection getOut(int out);

    Connection getIn(int in);

    Diameter getDiameterOut(int out);

    Diameter getDiameterIn(int in);
}