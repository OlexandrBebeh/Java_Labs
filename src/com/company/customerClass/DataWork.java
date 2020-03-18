package com.company.customerClass;

public class DataWork {
    DataStore data;

    public DataWork(){
        data = new DataStore();
    }

    public void sort(){
        if(data.getData() != null)
        Inquiries.getSortedList(data.getData());
    }

    public Customer[] range(int[] MinMax){
        if(data.getData() != null)
       return Inquiries.getInRange(data.getData(), MinMax[0],MinMax[1]);
        else return null;
    }

    public Customer[] getCustomers(){
        return data.getData();
    }

    public void dataCreate(int quantity){
        if(data.getData() != null) data.createData(quantity);
        else {
            data.setData(RandomFill.createAndFillArray(quantity));
        }
    }

    public void delete(){
        data.delete();
    }

}
