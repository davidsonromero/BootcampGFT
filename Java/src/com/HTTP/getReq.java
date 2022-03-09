package com.HTTP;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;


public class getReq {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest req = (HttpRequest) HttpRequest.newBuilder()
        .GET()
        .timeout(Duration.ofSeconds(10))
        //.uri(URI.create("https://google.com")).build();
        .uri(URI.create("https://amazon.com")).build();

        try {
            HttpResponse<String> response = client.send(req, HttpResponse.BodyHandlers.ofString());
            System.out.println(response + "\n");
            System.out.println(response.body());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}