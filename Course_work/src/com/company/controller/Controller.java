package com.company.controller;

import com.company.customerClass.service.DataWork;
import com.company.view.ProviderInput;
import com.company.view.View;
import com.google.gson.JsonSyntaxException;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.IOException;

public class Controller {
    public static Logger logger = Logger.getLogger(Controller.class);
    static {
        logger.setLevel(Level.INFO);
    }
   private DataWork data;
   private ProviderInput providerInput = new ProviderInput();
   final int ENDCOMMAND = 9;


    public void run(){
        int res = 0;
        loadStartArray();

        setLanguage();

        while (res != ENDCOMMAND){
            View.showWorkMenu();
            res = providerInput.getCommand(ENDCOMMAND);
            executeWorkCommand(res);
        }
    }


    private void executeWorkCommand(int res){
        if(res == 1){
            logger.info("Chosen sort array");
            View.show(data.sort());
        }else if(res == 2){
            logger.info("Chosen show customers in range");
            View.show(data.range(providerInput.getMinMax()));
        } else if(res == 3){
            logger.info("Chosen show array");
            View.show(data.getCustomers());
        }else if(res == 4){
            logger.info("Chosen delete array");
            data.delete();
            View.printLocalMessage("message_deleted");
        } else if ( res == 5){
            logger.info("Chosen store to file");
            storeToFile();
        } else if ( res == 6){
            logger.info("Chosen read from file");
            readFromFile();
        }   else if(res == 7){
            logger.info("Chosen load start array");
            loadStartArray();
            View.printLocalMessage("message_reset");
        } else if(res == 8) {
            logger.info("Chosen change language");
            setLanguage();
        }   else {
            try {
                data.writeData(".\\cust\\store.json");
            } catch (IOException e){
                logger.error("Failed open of file", e);
                View.printLocalMessage("error_save_file");
            }
            logger.info("Chosen exit");
            View.printLocalMessage("exit");
        }
    }

    private void storeToFile(){
        try {
            data.writeData(providerInput.getFileName());
            View.printLocalMessage("message_stored");
        } catch (IOException e){
            logger.error("Failed open of file", e);
            View.printLocalMessage("error_save_file");
        }
    }

    private void readFromFile(){
        try {
            data.readFile(providerInput.getFileName());
            View.printLocalMessage("message_read");
        } catch (IOException e) {
            logger.error("Failed open of file", e);
            View.printLocalMessage("error_injured_file");
        } catch (JsonSyntaxException e){
            logger.error("Error in file format", e);
            View.printLocalMessage("error_format");
        }
    }

    private void loadStartArray (){
        try {
            data = new DataWork();
        } catch (IOException|JsonSyntaxException e) {
            logger.fatal("Failed open of file", e);
            View.printLocalMessage("error_open_file");
            System.exit(-1);
        }
    }

    private void setLanguage(){
        View.showLanguageMenu();
        View.changeLanguage(providerInput.getCommand(3));
    }
}
