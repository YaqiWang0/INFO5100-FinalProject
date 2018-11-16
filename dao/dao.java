package dao;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class dao implements Serializable{
    private ArrayList<Dealers> dealers;
    private File file;
    private HashMap<String,Integer> map;

    public dao() throws Exception {
        this.file = new File("src/dao/dealers");
        map=new HashMap<>();

    }

    private void buildIndex(){
        for(int i=0;i<dealers.size();i++){
            map.put(dealers.get(i).getId(),i);
        }
    }

    private void writefile()throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dealers);
        fos.close();
        oos.close();
    }


    private void readfile() throws Exception{
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        dealers = (ArrayList<Dealers>) ois.readObject();
        fis.close();
        ois.close();
    }

    public ArrayList<Vehicle> getAllCars()throws Exception{

        ArrayList<Vehicle> Veh=new ArrayList<>();
        for(Dealers a:dealers){
            for(Vehicle b:a.getVehicles()){
                ((ArrayList<Vehicle>) Veh).add(b);
            }
        }
        return  Veh;
    }

    public Dealers getDealer(String id) throws Exception {
        readfile();
        buildIndex();
        if(map.containsKey(id))
          return dealers.get(map.get(id));
        return null;
    }

    public void updateDealer(Dealers dealer) throws IOException {
        if(map.containsKey(dealer.getId())) {
            int a=map.get(dealer.getId());
            dealers.remove(a);
        }


        dealers.add(dealer);
        buildIndex();
        writefile();
    }



}
