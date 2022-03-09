package com.HTTP;

import java.io.FileNotFoundException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.time.Duration;

public class postReq {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest req;
        try {
            req = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofFile(Path.of("Mypath.json")))
            .timeout(Duration.ofSeconds(10))
            .uri(URI.create("http://httpbin.org/forms/post"))
            .build();

            client.sendAsync(req, HttpResponse.BodyHandlers.ofString())
            .thenApply(HttpResponse::body)
            .thenAccept(System.out::println)
            .join();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}