package com.rencred.driver;

import io.qameta.allure.Step;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.BasicHttpContext;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

import static org.apache.commons.io.FileUtils.copyInputStreamToFile;

public class FileSaver {

    @Step("Сохраняем файл")
    public void saveFile(String name, String url) throws IOException {
        File fileToSave = new File("D:\\" + name + "");

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        HttpResponse response = httpClient.execute(httpGet, new BasicHttpContext());

        copyInputStreamToFile(response.getEntity().getContent(), fileToSave);
    }


    public void checkFile(String name) {
        File f = new File("D:\\" + name + "");
        Assert.assertTrue(f.exists());
    }

}
