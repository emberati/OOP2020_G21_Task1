package com.github.emb.OOP2020_G21_Task1.tubes;

public final class Connection {

    public final Diameter DIAMETER;
    public final Connectable node;
    private Connection connection;

    public Connection(Diameter diameter, Connectable node) {
        this.DIAMETER = diameter;
        this.node = node;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }
}
