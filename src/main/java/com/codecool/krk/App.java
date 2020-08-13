package com.codecool.krk;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class App {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        server.createContext("/guestbook", new GuestBook());
        server.setExecutor(null);

        server.start();
    }
}
