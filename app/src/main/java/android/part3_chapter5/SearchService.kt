package android.part3_chapter5

import android.part3_chapter5.model.ImageListResponse
import android.part3_chapter5.model.VideoListResponse
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface SearchService {

    @Headers("Authorization: KakaoAK ___key___")
    @GET("image")
    fun searchImage(@Query("query") query: String): Observable<ImageListResponse>

    @Headers("Authorization: KakaoAK __key___")
    @GET("vclip")
    fun searchVideo(@Query("query") query: String): Observable<VideoListResponse>

}