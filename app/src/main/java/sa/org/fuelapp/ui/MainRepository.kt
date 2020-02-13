package sa.org.fuelapp.ui

import android.util.Log
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.core.Response
import com.github.kittinunf.fuel.core.await
import com.github.kittinunf.fuel.core.awaitResponse
import com.github.kittinunf.fuel.core.awaitResponseResult
import com.github.kittinunf.fuel.coroutines.awaitStringResponseResult
import com.github.kittinunf.fuel.gson.responseObject
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.result.Result
import com.github.kittinunf.result.getAs
import sa.org.fuelapp.model.URL
import sa.org.fuelapp.model.User
import java.lang.Exception

class MainRepository {

    suspend fun getUser(): List<User>? {
//        URL.USERS.httpGet().responseObject<User.Deserializer>(){ request, response, result ->
//            println(request.toString())
//            when (result) {
//                is Result.Failure -> {
//                    println(result.getException().message)
//                }
//                is Result.Success -> {
//                    println(result.get())
//                }
//            }
//        }
////

//        val (request, response, result) =
//            Fuel.get(URL.USERS)
//                .awaitResponseResult<User>()
//



    }

}
