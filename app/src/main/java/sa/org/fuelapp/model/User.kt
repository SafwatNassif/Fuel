package sa.org.fuelapp.model

import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.google.gson.Gson

data class User(
    val userId: String,
    val id: String,
    val title: String,
    val body: String
) {

    class Deserializer : ResponseDeserializable<Array<User>> {
        override fun deserialize(content: String): Array<User>? =
            Gson().fromJson(content, Array<User>::class.java)
    }

}