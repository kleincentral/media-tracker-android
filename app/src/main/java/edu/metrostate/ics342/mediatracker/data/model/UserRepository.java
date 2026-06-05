package edu.metrostate.ics342.mediatracker.data.model;

import retrofit2.Retrofit;

public class UserRepository {

    init{
        Retrofit.Builder()
                .baseUrl()
    }

    fun createAccount(): User

}
