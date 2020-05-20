package com.company.customerClass;

import com.company.customerClass.entities.Customer;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.*;

public class FileIOjson {
    public static Customer[] readFile (String fileName) throws IOException, JsonSyntaxException {
        Gson gson = new Gson();
        StringBuilder customersBuffer = new StringBuilder("");
        Customer[] customers = null;
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String str;
        while ((str = br.readLine()) != null) {
            customersBuffer.append(str);
        }

        customers = gson.fromJson(customersBuffer.toString(), Customer[].class);
        return customers;
    }

    public static void writeFile (String str, Customer[] arr) throws IOException{
        Gson gson = new Gson();

        FileOutputStream output = new FileOutputStream(str);
        byte[] b = gson.toJson(arr).getBytes();
        output.write(b);
    }
}
