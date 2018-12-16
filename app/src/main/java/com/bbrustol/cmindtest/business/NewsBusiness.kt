package com.bbrustol.cmindtest.business

import com.bbrustol.cmindtest.data.source.Api
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class NewsBusiness: BaseBusiness() {
    @Provides
    fun providesNewsApi(retrofit: Retrofit) = retrofit.create(Api::class.java)
}
