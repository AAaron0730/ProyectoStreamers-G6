import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class Proyecto {

	public static void main (String []args) {
		String uri="mongodb+srv://hectorgd711_db_user:ReFcQMhbNqdAvOGJ"
				+ "@proyectostreamersg6.5osvic5.mongodb.net/?appName=ProyectoStreamersG6";
		
		
		MongoClient mongoClient = MongoClients.create(uri);
		MongoDatabase mongoDatabase =  mongoClient.getDatabase("ProyectoStreamersG6");
		
		String prueba;
	}
		
}
