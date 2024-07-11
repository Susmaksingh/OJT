/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ojt.crud_mongodb;

/**
 *
 * @author abcde
 */
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

public class CRUD_Mongodb {
    
    //connection deatils
    private static final String CONNECTION_STRING="mongodb://localhost:27017";
    private static final String DATABASE_NAME="nsti";
    private static final String COLLECTION_NAME="studdetails";

    public static void createStud(String studid, String firstname, String lastname){
        try(MongoClient mc= MongoClients.create(CONNECTION_STRING)){
            MongoDatabase db= mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
            
            Document stud= new Document("studid",studid).append("firstname",firstname).append("lastname",lastname);
            
            col.insertOne(stud);
            System.out.println("Student details create"+stud.toJson());
        }
    }
    
   public static void readStud(){
        try(MongoClient mc= MongoClients.create(CONNECTION_STRING)){
            MongoDatabase db= mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
            
            FindIterable<Document> Studs=col.find();
            System.out.println("stud details");
            for(Document obj:Studs){
            System.out.println(obj.toJson());
        }
        }
    }
    
    public static void updateStud(String studid, String firstname){
        try(MongoClient mc= MongoClients.create(CONNECTION_STRING)){
            MongoDatabase db= mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
            
            col.updateOne(Filters.eq("studid",studid),Updates.set("firstname",firstname));
            System.out.println("Student ID updated");
        }  
    }
    
   public static void deleteStud(String firstname){
        try(MongoClient mc= MongoClients.create(CONNECTION_STRING)){
            MongoDatabase db= mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
            col.deleteOne(Filters.eq("firstname",firstname));
            System.out.println("Student details deleted");
            
        }
    }
            
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //createStud("2","Susma","singh");
        //readStud();
        //updateStud("2","Sri");
        readStud();
        deleteStud("Sri");
        readStud();
    }
}

