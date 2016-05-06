package com.example.julianschuster.clase2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pablobarrera on 29/04/16.
 */
public class ContactFactory {
	public static List<Contact> getContacts(){
		List<Contact> contacts = new ArrayList<>();

		contacts.add(new Contact("Carolina Suarez",
				"https://dl.dropboxusercontent.com/u/22342186/android_ejercicios/contacto1.png",
				"4234-5676",
				"Av. Corrientes 324",
				"12-09-1987",
				"csuarez@gmail.com",
				false));

		contacts.add(new Contact("Virginia Lopez",
				"https://dl.dropboxusercontent.com/u/22342186/android_ejercicios/contacto2.png",
				"4463-3456",
				"Guatemala 7223",
				"02-02-1985",
				"vlopez@gmail.com",
				true));

		contacts.add(new Contact("Juan Perez",
				"https://dl.dropboxusercontent.com/u/22342186/android_ejercicios/contacto3.png",
				"4424-3433",
				"Las Heras 679",
				"22-04-1989",
				"jperez@gmail.com",
				false));

		contacts.add(new Contact("Fito Juarez",
				"https://dl.dropboxusercontent.com/u/22342186/android_ejercicios/contacto4.png",
				"4674-3883",
				"Peru 172",
				"22-06-1979",
				"fjuarez@gmail.com",
				false));

		contacts.add(new Contact("Candelaria Villa",
				"https://dl.dropboxusercontent.com/u/22342186/android_ejercicios/contacto5.png",
				"4349-2233",
				"Scalabrini Ortíz 682",
				"23-12-1988",
				"cvilla@gmail.com",
				true));

		contacts.add(new Contact("Reinaldo Vargas",
				"https://dl.dropboxusercontent.com/u/22342186/android_ejercicios/contacto6.png",
				"4114-3213",
				"Lima 239",
				"03-06-1985",
				"rvargas@gmail.com",
				false));


		contacts.add(new Contact("Fátima Cruz",
				"https://dl.dropboxusercontent.com/u/22342186/android_ejercicios/contacto7.png",
				"4444-3333",
				"San Martin 895",
				"21-09-1988",
				"fcruz@gmail.com",
				true));

		contacts.add(new Contact("María Santillán",
				"https://dl.dropboxusercontent.com/u/22342186/android_ejercicios/contacto8.png",
				"2343-5611",
				"Av. Belgrano 323",
				"11-09-1987",
				"msantillan2@gmail.com",
				true));

		return contacts;
	}

}
